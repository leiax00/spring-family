package sqlgenerator.generrator.interfce;

import lombok.Getter;
import lombok.Setter;
import sqlgenerator.annotation.SqlField;
import sqlgenerator.bean.vo.Sql;

import java.lang.reflect.Field;

import static sqlgenerator.bean.constant.SqlConnector.*;

public abstract class Cond {
    @Getter
    @Setter
    private String basicSql = "";

    @Setter
    @Getter
    private boolean firstCond = true;

    public Sql getSql() throws IllegalAccessException {
        Sql sql = new Sql();
        StringBuilder builder = new StringBuilder(basicSql);
        Field[] fields = this.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object fieldV = field.get(this);
            if (fieldV == null) {
                System.out.println(field.getName() + "have no value....");
            } else if (fieldV instanceof Cond) {
                Cond cond = (Cond) fieldV;
                cond.setFirstCond(this.isFirstCond());
                Sql tmp = cond.getSql();
                builder.append(tmp.getSql());
                sql.getParams().addAll(tmp.getParams());
                this.setFirstCond(cond.isFirstCond());
            } else if (field.getType().getClassLoader() == null) {
                // fieldName == ?
                builder.append(getCondConnector(field)).append(getMappingName(field)).append(getCondInnerConnector(field)).append(getConnector(PLACEHOLDER));
                sql.getParams().add(fieldV);
            }
        }
        sql.setSql(builder.toString());
        System.out.println("end.....");
        return sql;
    }

    private String getCondConnector(Field field) {
        SqlField annotation = field.getAnnotation(SqlField.class);
        if (isFirstCond()) {
            setFirstCond(false);
            return getConnector(WHERE);
        }
        return annotation == null?getConnector(AND):getConnector(annotation.condBetween());
    }

    private String getMappingName(Field field) {
        SqlField annotation = field.getAnnotation(SqlField.class);
        if (annotation == null || "".equals(annotation.mapping())) {
            return getConnector(field.getName());
        }
        return getConnector(annotation.mapping());
    }

    private String getCondInnerConnector(Field field) {
        SqlField annotation = field.getAnnotation(SqlField.class);
        return annotation == null ? getConnector(EQUAL) : getConnector(annotation.condInner());
    }
}
