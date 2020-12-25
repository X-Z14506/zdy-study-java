package io;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 最终版
 * 字节流 什么类型的文件都可以读取，一次只能读取一个字节，等同于一次读取8个二进制位
 * 字符流 只能读取普通文本文件，一次读取一个字符，为了方便读取普通文本文件
 */


public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\Temp\\test.txt");

            //准备一个byte数组
            byte[] bytes = new byte[4];
            //开始读文件
            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes,0,readCount));
            }

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
