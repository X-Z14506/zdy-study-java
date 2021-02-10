package annotation.annotation01;

import annotation.annotation01.MyAnnotation;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2021-01-01
 * Time:9:37
 */


public class ReflectAnnotationTest {
    public static void main(String[] args) {
        //获取这个类
        Class c = null;
        try {
            c = Class.forName("annotation.annotation01.MyAnnotationTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        /*//判断类上面是否有注解@MyAnnotation
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));//true
        System.out.println(c.isAnnotationPresent(String.class));//false*/
        if (c.isAnnotationPresent(MyAnnotation.class)) {
            //获取该注解对象
            MyAnnotation myAnnotation = (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            System.out.println("类上面的注解对象： "+myAnnotation);//类上面的注解对象： @annotation.annotation01.MyAnnotation(value=陕西咸阳渭城区)
            //获取注解对象的属性：和调接口没区别
            String value = myAnnotation.value();
            System.out.println(value);
        }
    }
}
