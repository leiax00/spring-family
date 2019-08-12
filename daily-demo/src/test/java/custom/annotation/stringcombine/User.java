package custom.annotation.stringcombine;

import lombok.AllArgsConstructor;
import lombok.Data;
import sqlgenerator.annotation.SqlField;
import sqlgenerator.bean.constant.SqlConnector;
import sqlgenerator.generrator.interfce.Cond;

@Data
@AllArgsConstructor
public class User extends Cond {
    private String name;
    @SqlField(condInner = SqlConnector.GREATERANDEQUAL, mapping = "age")
    private Integer minAge;
    @SqlField(condInner = SqlConnector.LESSANDEQUAL, mapping = "age")
    private Integer maxAge;
}
