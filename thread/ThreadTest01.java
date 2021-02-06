/*
    关于线程的sleep方法：
       static void sleep（long millis）
       1.静态方法：Thread.sleep（1000）
       2.参数是毫秒
       3.作用：让当前线程进入休眠，进入“阻塞状态”，放弃战友CPU时间片，让给其他线程使用
            这行代码出现在A进程中，A进程就会进入休眠
            这行代码出现在B进程中，B进程就会进入休眠
       4.Thread.sleep()方法，可以做到这种效果：
            间隔特定的时间，去执行一段特定的代码，每个多久执行一次
 */
 
 
public class ThreadTest01 {
    public static void main1(String[] args) {

        //让当前线程进入休眠，睡眠5秒
        //当前线程是主线程！！！
        try  {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //5秒之后执行这里的代码
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        for (int i = 0;i < 10;i++) {
            System.out.println(Thread.currentThread().getName()+"----->" + i);

            //睡眠2秒
            try{
                Thread.sleep(1000*2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
