
/**
 *  使用生产者和消费者模式实现，交替输出：
 *       假设只有两个线程，输出以下结果：
 *           t1-->1
 *           t2-->2
 *           t1-->3
 *           t2-->4
 *           t1-->5
 *           t1-->6
 *           ...
 *
 *           要求：必须交替，并且t1线程负责输出奇数，t2线程负责输出偶数
 *
 */


public class ThreadTest07 {

    public static void main(String[] args) {
        //两个线程共享数据Num对象的num
        Num num = new Num();
        Thread t1 = new Thread(new MyRunnable01(num));
        Thread t2 = new Thread(new MyRunnable02(num));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }
}
class MyRunnable01 implements Runnable{
    //共享仓库
    private Num num;
    public MyRunnable01(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num.i %2 != 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(Thread.currentThread().getName()+"-->"+ (++num.i));
                num.notify();
            }
        }
    }
}
class MyRunnable02 implements  Runnable{

    private Num num;
    public MyRunnable02(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num.i %2 == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"-->"+ (++num.i));
                num.notify();
            }
        }

    }
}

class Num {
    public int i;
}
