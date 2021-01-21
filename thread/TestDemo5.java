
/*
解决TestDemo4的问题

锁同一个对象，即可达到线程安全
        test方法开始，当前线程为:Thread-0
        test方法结束，当前线程为：Thread-0
        test方法开始，当前线程为:Thread-2
        test方法结束，当前线程为：Thread-2
        test方法开始，当前线程为:Thread-1
        test方法结束，当前线程为：Thread-1
 */
public class TestDemo5 {
    public static void main(String[] args) throws InterruptedException {

        Sync1 sync1 = new Sync1();

        for (int i =0;i < 3;i++) {
            //Thread.sleep(1000);
            Thread thread = new MyThread5(sync1);

            thread.start();
        }
    }
}
class MyThread5 extends Thread {
    private Sync1 sync1;
    public MyThread5(Sync1 sync1) {
        this.sync1 = sync1;
    }
    @Override
    public void run() {
        this.sync1.test();
    }
}
class Sync1{
    public  void test() {
        synchronized (this) {
            System.out.println("test方法开始，当前线程为:"+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("test方法结束，当前线程为："+Thread.currentThread().getName());
        }
       
    }
}
