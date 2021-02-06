/*
    关于Thread.sleep（）方法的面试题：
       问题：下面程序 t.sleep（1000*5）这行代码会让线程t进入休眠状态吗？
       答：不会，在执行的时候还是会转换成Thread.sleep(1000*5);
          这行代码的作用是：让当前线程进入休眠，也就是说main线程会进入休眠
          这行代码出现在main方法中，所以main线程睡眠，即t线程执行完3秒钟之后才会执行main线程的hello world

 */


public class ThreadTest02 {
    public static void main(String[] args) {
        //创建线程对象
        MyThread t = new MyThread();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            t.sleep(1000*5);//在执行的时候还是会转换成Thread.sleep(1000*5);
                                  //这行代码的作用是：让当前线程进入休眠，也就是说main线程会进入休眠
                                  //这行代码出现在main方法中，所以main线程睡眠，即t线程执行完5秒钟之后才会执行main线程的hello world
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //3秒钟之后才会执行
        System.out.println("hello world");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0;i < 1000;i++) {
            System.out.println(Thread.currentThread().getName() + "--->" + i);
        }
    }
}
