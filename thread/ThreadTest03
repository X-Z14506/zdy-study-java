/*
        sleep睡眠太久了，如果希望半道上醒来，该怎么办，也就是说怎么叫醒一个正在睡眠的线程
           注意：这个不是中断线程的执行，是终止线程的睡眠
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        //5秒之后，t线程醒来
        try{
          Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //中断t线程的睡眠（这种中断睡眠的方式依靠了java的异常处理机制）
        t.interrupt();
    }
}
class MyRunnable2 implements Runnable {

    //注意：run（）方法中的异常不能throws，只能try catch
    //  因为run（）方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--> begin");
        try{
            //睡眠一年
            Thread.sleep(1000*60*60*24*365);
        } catch (InterruptedException e) {
            /*//打印异常信息
            e.printStackTrace();*/
            System.out.println("5秒时间已到，t线程醒来");
        }
        //正常情况，睡眠不被终止的情况下1年后才会执行这里，
        // 但是睡眠被终止，5秒后便会执行到这里
        System.out.println(Thread.currentThread().getName()+"--> end");
    }
}
