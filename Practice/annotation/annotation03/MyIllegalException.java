/*
    自定义异常，记住这个格式，继承RuntimeException，
    提供一个无参构造方法和一个有参构造方法，有参构造方法调用super(s)父类的构造方法
 */
public class MyIllegalException extends RuntimeException{
    public MyIllegalException() {

    }
    public MyIllegalException(String s) {
        super(s);
    }
}
