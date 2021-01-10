/*
     怎么合理的终止一个线程的执行常用方法
 */
 
 
public class ThreadTest04 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.setName("t");
        t.start();

        //模拟3秒
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        //想什么时候终止t的执行，只需要将标记修改为false，就结束了
        runnable.run = false;
    }
}

class MyRunnable implements Runnable {

    boolean run = true;
    @Override
    public void run() {
        for (int i = 0 ;i < 10;i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName()+"-->"+i);
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                //return就结束了，在结束之前没保存的可以在这里保存
                System.out.println("3秒时间到，t线程该结束了");
                //终止当前线程
                return;
            }
        }

    }
}
