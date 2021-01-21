
/*
同步代码块
这种方式是在方法里拦截的，也就是说进入到方法中的线程依然可能会有多个
 */
public class TestDemo2 {
    public static void main(String[] args) {
        MyThread2 myThread1 = new MyThread2();
        Thread t1 = new Thread(myThread1,"黄牛A");
        Thread t2 = new Thread(myThread1,"黄牛B");
        Thread t3 = new Thread(myThread1,"黄牛C");
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.start();
        t1.start();

    }
}
class MyThread2 implements Runnable{

    private int tickets = 1000;//一共十张票

    @Override
    public void run() {
        for (int i = 0;i < 1000;i++) {
            //在同一时刻只允许一个线程进入代码块处理
            synchronized (this) {//表示为程序逻辑上锁
                if (this.tickets>0) {//还有票
                    try{
                        Thread.sleep(10);//模拟网络延迟
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+",还有"+this.tickets-- + "张票");
                }

            }
        }
    }
}

