
//学习使用lambda表达式简化创建线程的代码
public class Test01 {
    public static void main(String[] args) {
        //创建线程方式1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("run.......");
            }
        };
        new Thread(runnable).start();

        //方式2
        Runnable runnable1 = ()->{System.out.println("hello lambda");};
        new Thread(runnable1).start();

        //方式3
        new Thread(()->{System.out.println("hello lambda2");}).start();

        //方式4
        new Thread(()-> System.out.println("hello lambda3")).start();

    }
}
