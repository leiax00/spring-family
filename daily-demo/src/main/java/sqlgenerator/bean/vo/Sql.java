package sqlgenerator.bean.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Sql {
    private String sql;
    private List<Object> params = new ArrayList<>();
}
