
public class ExceptionTestDemo02 {
    public static void main(String[] args) {
        try{
            throw ExceptionMethod(true);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("处理数组下标越界异常");
        }catch(NullPointerException ex){
            System.out.println("处理空指针异常");
        }catch(Exception ex){     //注意：父异常必须写到最后
            System.out.println("处理总异常");
        }
        finally {
            System.out.println("无论怎样都得来我这一趟");
        }
    }
    /*
        抛出异常之前
        处理空指针异常
        无论怎样都得来我这一趟
     */

    private static void throw ExceptionMethod(boolean isThrow) {
        System.out.println("抛出异常之前");
        if(isThrow){
            throw new NullPointerException();
        }
        System.out.println("抛出异常之后");
    }
