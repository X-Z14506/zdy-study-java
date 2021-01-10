public class ThreadTest05 {
    public static void main(String[] args) {
        Thread  t = new BackDataThread();
        t.setName("守护线程");

        //启动线程之前，将线程设置为守护线程
        t.setDaemon(true);
        t.start();

        //主线程：主线程就是用户线程
        for (int i = 0;i < 10;i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class BackDataThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        //死循环
        //即使是死循环，但由于该线程是守护线程，当用户线程结束，守护线程自动终止
        while (true) {
            System.out.println(Thread.currentThread().getName()+"-->"+(++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
