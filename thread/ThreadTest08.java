/*
    使用wait方法和notify方法实现“生产者和消费者模式”

    什么是“生产者和消费者模式”？
        生产线程负责生产，消费线程负责消费
        生产线程和消费线程要达到均衡
        这是一种特殊的业务需求，在这种特殊的情况下需要使用wait方法和notify方法

        一个仓库中可以放多个元素，只要达到生产和消费均衡

    wait和notify方法不是线程对象的方法，是普通java对象都有的方法

    wait方法和notify方法建立在线程同步的基础之上，因为多线程要同时操作一个仓库

    wait方法作用：o.wait()让正在o对象活动的线程t进入等待状态，并且释放掉t线程之前占有的o对象的锁

    notify方法作用：o.notify（）让正在对象上等待的线程唤醒，只是通知，不会释放o对象上之前占有的锁

    模拟这样一个需求：
        仓库采用List集合
        List集合中假设只能存储一个元素
        1个元素就表示仓库存满了
        如果list集合中元素个数是0，表示仓库空了
        保证list集合中永远都是最多存储1个元素

        最终达到效果：生产一个消费一个
 */
 
 
public class ThreadTest08 {
    public static void main(String[] args) {
        //创建一个仓库对象，共享的
        List list = new ArrayList();
        //创建两个线程对象
        //生产者线程
        Thread t1 = new Thread(new Producer(list));
        //消费者线程
        Thread t2 = new Thread(new Consumer(list));

        t1.setName("生产者线程");
        t2.setName("消费者线程");
        t1.start();
        t2.start();
    }
}


//生产线程
class Producer implements Runnable  {
    //仓库
    private List list;
    public Producer(List list) {
        this.list =list;
    }

    @Override
    public void run() {
        //一直生产
        while (true) {
            //给仓库对象list加锁
            synchronized (list) {
                if (list.size()>0) {//大于0，说明仓库中已经有一个元素了
                    //当前线程进入等待状态，并且释放Producer之前占有的list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到这里说明仓库是空的，可以生产
                Object object = new Object();
                list.add(object);
                System.out.println(Thread.currentThread().getName()+"-->"+object);
                //唤醒消费者消费
                list.notify();
            }

        }
    }
}


//消费线程
class Consumer implements Runnable {
    //仓库
    private List list;
    public Consumer(List list) {
        this.list =list;
    }
    @Override
    public void run() {
        //一直消费
        while (true) {
            synchronized (list) {
                if (list.size()==0) {
                    //仓库已经空了，消费者线程等待，释放掉list集合的锁
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //程序能够执行到此处说明仓库中有数据，能够消费
                Object object = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"-->"+object);
                //唤醒生产者生产
                list.notify();
            }
        }
    }
}
