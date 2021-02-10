package annotation.annotation02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2021-01-01
 * Time:10:10
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    /*
    username属性
     */
    String username();
    /*
    password属性
     */
    String password();
}
