public class Test {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取类
        //Class userClass = Class.forName("annotation.annotation03.Use2");//annotation.annotation03.MyIllegalException: 被@MyAnnotation注解标注的类中必须要有一个int类型的id属性
        Class userClass = Class.forName("annotation.annotation03.User");//该类是合法的

        boolean isOK = false;//给一个默认的标记

        //判断类上是否存在MyAnnotation注解
        if (userClass.isAnnotationPresent(MyAnnotation.class)) {
            //当一个类上面有@MyAnnotation注解的时候，要求类中鼻血存在int类型的id属性
            //如果没有int类型的id属性则报异常

            //获取类的属性
            Field[] fields = userClass.getDeclaredFields();
            for (Field field : fields) {
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())) {
                    //表示这个类时合法的类，有@MyAnnotation注解，则这个类中必须有int id属性
                    isOK = true;//表示合法
                    break;
                }
            }

            //判断类是否合法
            if (!isOK) {
                //如果不合法，抛异常
                throw new MyIllegalException("被@MyAnnotation注解标注的类中必须要有一个int类型的id属性");
            }else {
                System.out.println("该类是合法的");
            }
        }


    }
}
