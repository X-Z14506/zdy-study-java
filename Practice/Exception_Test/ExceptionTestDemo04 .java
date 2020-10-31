

public class ExceptionTestDemo04 {
    public static void main(String[] args) {
        try{
            throw ExceptionMethod(true);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("处理异常");
        }finally {
            System.out.println("无论怎样都得来我这一趟");
        }
    }
    /*编译有错误：因为异常类型不匹配
        抛出异常之前
        Exception in thread "main" java.lang.NullPointerException
        无论怎样都得来我这一趟
     */

    private static void throw ExceptionMethod(boolean isThrow) {
        System.out.println("抛出异常之前");
        if(isThrow){
            throw new NullPointerException();
        }
        System.out.println("抛出异常之后");
    }
}
