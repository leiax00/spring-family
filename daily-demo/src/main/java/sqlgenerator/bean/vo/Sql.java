package sqlgenerator.bean.vo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Sql {
    private String sql;
    private ArrayList params = new ArrayList();
}
