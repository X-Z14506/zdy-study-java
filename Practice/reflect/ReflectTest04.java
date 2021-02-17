/*
    Class.forName()发生了什么
       重点：
         如果只是希望一个类的静态代码块执行，其他代码一律不执行
         可以使用：Class.forName（"完整类名"）;
         这个方法的执行会导致类加载，类加载时，静态代码块执行
       JDBC会用到
 */
 
 
public class ReflectTest04 {
    public static void main(String[] args) {
        try {
            //Class.forName（）方法的执行会导致类加载，静态代码块会在类加载的时候执行，且只执行一次
            Class.forName("reflect.MyClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
