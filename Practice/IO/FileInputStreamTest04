package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * FileInputStream类的其他常用方法
 *      int available(): 返回流当中没有读到的剩余的字节数量
 *             这个方法有什么用？省去循环，读一次就行了,,注：该方法不适用于太大文件，因为byte[]数组不能太大
 *      long skip(long n) :跳过几个字节不读
 */
public class FileInputStreamTest04 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/temp");//zhangDingYu

            //总字节数量
            System.out.println("总字节数量：" + fis.available());//11
           /* //读一个字节
            int readByte = fis.read();
            System.out.println("还剩下没读的字节数量：" + fis.available());//10*/

            //这个方法有什么用？
            // 省去循环，读一次就行了
           /* byte[] bytes = new byte[fis.available()];//注：该方法不适用于太大文件，因为byte[]数组不能太大
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes));*/

            //skip跳过几个字节不读取，
            fis.skip(5);
            System.out.println(fis.read());//68  (D)


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis!=null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
