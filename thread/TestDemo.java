
/*
线程同步问题的引出
此时票数出现负数，这种问题称之为不同步操作
不同步唯一好处是处理速度快，因为多个线程并发执行

//两秒后
黄牛A,还有10张票
黄牛B,还有9张票
黄牛C,还有8张票
//两秒后
黄牛A,还有7张票
黄牛C,还有6张票
黄牛B,还有5张票
//两秒后
黄牛A,还有4张票
黄牛B,还有3张票
黄牛C,还有2张票
//两秒后
黄牛A,还有1张票
黄牛C,还有-1张票
黄牛B,还有0张票
 */
public class TestDemo {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        new Thread(myThread1,"黄牛A").start();
        new Thread(myThread1,"黄牛B").start();
        new Thread(myThread1,"黄牛C").start();
    }
}
class MyThread1 implements Runnable{

    private int tickets = 10;//一共十张票

    @Override
    public void run() {
        while (tickets>0) {//还有票
            try{
                Thread.sleep(1000*2);//模拟网络延迟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+",还有"+this.tickets-- + "张票");
        }
    }
}
