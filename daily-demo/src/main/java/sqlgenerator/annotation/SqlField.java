package sqlgenerator.annotation;

import sqlgenerator.bean.constant.SqlConnector;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface SqlField {
    String condBetween() default SqlConnector.AND;
    String condInner() default SqlConnector.EQUAL;
    String mapping() default "";
}
