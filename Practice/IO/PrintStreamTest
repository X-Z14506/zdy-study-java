

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
    java.io.PrintStream:标准的字节输出流，默认输出到控制台
 */
public class PrintStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        //联合起来写
        System.out.println("========联合起来写==========");
        System.out.println("hello world");

        //分开写
        System.out.println("==========分开写==============");
        PrintStream ps = System.out;
        ps.println("hello zhangSan");
        ps.println("hello liSi");
        ps.println("hello wangWu");

        //标准输出流不需要手动close（）关闭
        //可以改变标准输出流的输出方向
        /*
            System类常用的方法和属性
                System.exit(0);
                System.gc();
                System.currentTimeMillis();
                System.arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
         */


        //标准输出流不再执行控制台，指向“log”文件
        PrintStream ps2 = new PrintStream(new FileOutputStream("log"));
        //修改输出方向，将输出方向改到“log”文件
        System.setOut(ps2);
        //在输出，会发现输出不在控制台，而在一个新的log文件里
        System.out.println("西安工程大学");
        System.out.println("17级学生");
        System.out.println("zdy");
    }
}

