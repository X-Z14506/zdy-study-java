package annotation.annotation01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2021-01-01
 * Time:9:32
 */

//只允许该注解可以标注类，方法
@Target({ElementType.METHOD,ElementType.TYPE})
//希望这个注解可以被反射
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
   /*
    value属性
    */

    String value() default "陕西咸阳渭城区";


}
