package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;



/**
 * 文件字节数出流，负责写
 */
public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileOutputStream fos1 = null;
        try {
            //myfile文件不存在的时候会自动新建
            //这种方式谨慎使用，这种方式会将源文件清空，然后重新写入
            fos = new FileOutputStream("myfile");

            //这种方式是以追加的方式在文件末尾写入，不会清空原文件
            fos1 = new FileOutputStream("src/temp",true);

            //开始写
            byte[] bytes = {97,98,99,100};
            //将byte数组全部写出！
            fos.write(bytes);
            fos1.write(bytes);
            //将byte数组的一部分写出
            fos.write(bytes,0,2);//再写出ab

            String s = "西安工程大学张丁玉";
            byte[] bytes1 = s.getBytes();
            fos.write(bytes1);
            fos1.write(bytes1);

            //写完之后，最后一定要刷新
            fos.flush();
            fos1.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos1!=null) {
                try {
                    fos1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
