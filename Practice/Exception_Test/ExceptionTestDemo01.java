

public class ExceptionTestDemo01 {
    public static void main(String[] args) {
        try{
            throw ExceptionMethod(true);
        }catch(NullPointerException ex){
            System.out.println("处理异常");
        }finally {
            System.out.println("无论怎样都得来我这一趟");
        }
    }
    /*
        抛出异常之前
        处理异常
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
