package sqlgenerator.generrator.interfce;

import sqlgenerator.bean.vo.Sql;

public interface SqlFactory {
    Sql buildSql(Cond cond);
}
