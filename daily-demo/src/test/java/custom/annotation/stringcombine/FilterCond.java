package custom.annotation.stringcombine;

import lombok.AllArgsConstructor;
import lombok.Data;
import sqlgenerator.annotation.SqlField;
import sqlgenerator.bean.constant.SqlConnector;
import sqlgenerator.generrator.interfce.Cond;

@Data
@AllArgsConstructor
public class FilterCond extends Cond {
    private User user;
    @SqlField(condBetween = SqlConnector.OR)
    private String doc;
    private String country;
}
