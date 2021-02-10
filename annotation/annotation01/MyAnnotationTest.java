package annotation.annotation01;

import annotation.annotation01.MyAnnotation;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2021-01-01
 * Time:9:37
 */

//注解不会报错，因为元注解指定了该注解可以出现在类上
@MyAnnotation("陕西西安临潼区")//指定value值为陕西西安临潼区，如果不指定，获取value值为默认值陕西咸阳渭城区
public class MyAnnotationTest {

    //@MyAnnotation  注解会报错，因为注解的元注解上没有指定该注解可以出现在属性上
    int i ;

    @MyAnnotation//注解不会报错，因为元注解Target上指定了该注解可以出现在方法上
    public void doSome() {
        //@MyAnnotation   会报错，同上
        int i;
    }



}
