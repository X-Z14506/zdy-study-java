
/*
同步方法
同步可以保证数据的完整性（线程安全操作），但是执行的速度会很慢
 */
public class TestDemo3 {
    public static void main(String[] args) {
        MyThread3 myThread1 = new MyThread3();
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
class MyThread3 implements Runnable{

    private int tickets = 1000;//一共十张票

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            this.sale();
        }
    }

    public synchronized void sale() {
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

