package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;




/*
    第一个程序的缺点：
       一次读取一个字节byte,这样内崔和硬盘交互太频繁，基本上时间/资源都耗费
       在交互上面，可以一次读取多个字节

       方法： int read(byte[] b)
           一次最多读取b.length个字节
           减少硬盘和内存的交互，提高程序的执行效率
           往byte[]数组当中读
 */


public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            //工程Project的根是IDEA默认的当前路径
            fis = new FileInputStream("D:\\Temp\\test.txt");

            //开始读，采用byte数组，一次读取多个字节，最多读取数组.length个字节
            byte[] bytes = new byte[4];//准备一个长度为4的byte数组，一次最多读取4个字节

            //这个方法的返回值是：读取到的字节数量（不是字节本身）
            int readCount = fis.read(bytes);
            System.out.println(readCount);//4  第一次读到了4个字节
           /* //将byte数组转换为字符串
            System.out.println(new String(bytes));//abcd*/
            System.out.println(new String(bytes,0,readCount));


            readCount = fis.read(bytes);
            System.out.println(readCount);//2 第二次只能读到了2个字节
            //System.out.println(new String(bytes));//efcd  这个构造方法不适用，他将所有字节都转换为字符串了，应该读到多少字节，转多少
            System.out.println(new String(bytes,0,readCount));


            readCount = fis.read(bytes);
            System.out.println(readCount);//-1 一个字节都没有的时候返回-1



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
