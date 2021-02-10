/*
    通用方法：获取一个文件的绝对路径，但是前提是：文件在类路径下才能使用这种方式
 */
 
 
public class AboutPath {
    public static void main(String[] args) throws FileNotFoundException {
       /* //这种方式的路径缺点是：移植性差，在IDEA中默认的当前路径是project的根路径
        //这个代码离开了IDEA，换到了其他位置，可能当前路径就不是project的
        FileReader reader = new FileReader("src/classinfo.properties");*/

        //通用的路径，即使代码换位置了，这样仍然通用
        //注：使用以下通用方式的前提：这个文件必须在类路径下（src是类的根路径）

        /*
            Thread.currentThread() 当前线程对象
            getContextClassLoader() 线程对象的方法，可以获取到当前线程的类加载器对象
            getResource("")【获取资源】这是类加载器对象的方法，当前线程的类加载器默认从类的根路径下加载资源
         */
        //采用该代码可以获取一个文件的绝对路径（前提是这个文件必须在类路径下（src是类的根路径））
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        System.out.println(path);//  /F:/java/dongli/practice/out/production/practice/classinfo.properties

        //获取text文件的绝对路径（从类的根路径下作为起点开始）
        String path1 = Thread.currentThread().getContextClassLoader().getResource("io/bean/text").getPath();
        System.out.println(path1);//   /F:/java/dongli/practice/out/production/practice/io/bean/text
    }
}
