/*
    获取Class，能干什么？
       通过Class的newInstance()方法来实例化对象
       注：newInstance()方法内部实际上调用了无参数的构造方法，必须保证无参构造方法存在才可以
 */


public class ReflectTest02 {
    public static void main(String[] args) {

        //不使用反射机制创建对象
        User user = new User("s");
        System.out.println(user);

        try {
            //通过反射机制，获取Class，通过Class来实例化对象
            Class c = Class.forName("reflect.User");

            //newInstance()这个方法会调用User这个类的无参数构造方法，完成对象的创建
            //重点是：newInstance()调用的无参构造方法，所以必须保证无参数构造方法是存在的
            //如果无参构造方法不存在，会抛出异常：java.lang.InstantiationException: reflect.User
            Object o = c.newInstance();//reflect.User@1b6d3586
            System.out.println(o);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
