
/*
synchronized锁多个对象

    test方法开始，当前线程为:Thread-0
    test方法开始，当前线程为:Thread-1
    test方法开始，当前线程为:Thread-2
    test方法结束，当前线程为：Thread-0
    test方法结束，当前线程为：Thread-1
    test方法结束，当前线程为：Thread-2

synchronized没起作用，三个线程同时运行test（）
    因为synchronized(this)以及非static的synchronize方法，只能放置多个线程同时执行同一个对象的同步代码段
    即synchronized所著的是括号里的对象，而不是代码，对于非static的synchronized方法，所得就是对象本身就是this


 */
public class TestDemo4 {
    public static void main(String[] args) throws InterruptedException {

        for (int i =0;i < 3;i++) {
            //Thread.sleep(1000);
            Thread thread = new MyThread4();

            thread.start();
        }
    }
}
class MyThread4 extends Thread {
    @Override
    public void run() {
        Sync sync = new Sync();
        sync.test();
    }
}
class Sync{
    public synchronized void test() {
        System.out.println("test方法开始，当前线程为:"+Thread.currentThread().getName());
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("test方法结束，当前线程为："+Thread.currentThread().getName());
    }
}
