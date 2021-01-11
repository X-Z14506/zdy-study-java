/*
    实现线程的第三种方式：
       实现Callable接口
       这种方式的优点：可以获取到线程的执行结果
       这种方式的缺点：效率比较低，在获取t线程的执行结果时，当前线程受阻塞，
 */
 
 
public class ThreadTest06 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //第一步：创建一个“未来任务类”对象
        //参数非常重要，需要给一个Callable接口实现类对象
        FutureTask task = new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {//call方法就相当于于run方法，只不过call方法有返回值
                //线程执行一个任务，执行之后可能会有一个执行结果
                //模拟执行
                System.out.println("call方法开始执行");
                Thread.sleep(1000*5);
                System.out.println("call方法执行结束");
                int a = 100;
                int b = 200;
                return a+b;
            }
        });

        //创建线程对象
        Thread t = new Thread(task);

        //启动线程
        t.start();

        //这里是main方法，这是在主线程中
        //在主线程中，获取t线程的返回结果
        Object obj = task.get();

        //main线程睡5秒
        Thread.sleep(1000*5);

        //main方法这里的程序要想执行必须等待get()方法的结束
        //而get方法可能需要很久，因为get（）方法是为了拿另一个线程的执行结果，另一个线程执行时需要时间的
        System.out.println("main方法执行");
    }
}
