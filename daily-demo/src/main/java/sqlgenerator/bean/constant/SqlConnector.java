package sqlgenerator.bean.constant;

public class SqlConnector {
    public static final String WHERE = "WHERE";
    public static final String AND = "AND";
    public static final String OR = "OR";
    public static final String PLACEHOLDER = "?";
    public static final String GREATER = ">";
    public static final String GREATERANDEQUAL = ">=";
    public static final String LESS = "<";
    public static final String LESSANDEQUAL = "<=";
    public static final String EQUAL = "==";
    public static final String EMPTY = " ";

    public static final String getConnector(String connector) {
        return EMPTY + connector;
    }
}
