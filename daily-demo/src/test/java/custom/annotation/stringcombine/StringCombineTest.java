package custom.annotation.stringcombine;

import org.junit.Test;
import sqlgenerator.bean.vo.Sql;

public class StringCombineTest {
    @Test
    public void testSqlGenerator() throws IllegalAccessException {
        User user = new User("leiax00", null, 26);
        FilterCond cond = new FilterCond(user, "aaa", "ch");
        cond.setBasicSql("select * from User");
        Sql sql = cond.getSql();
        System.out.println(sql.getSql());
        System.out.println(sql.getParams());
    }
}
