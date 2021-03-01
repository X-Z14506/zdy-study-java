package io;


import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter:
 *     文件字符输出流，负责写
 *     只能输出普通文本
 */


public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            //创建文件字符输出流对象
            //这个方法会删除源文件内容，重新写
            writer = new FileWriter("file");

            //开始写
            char[] chars = {'我','是','中','国','人'};
            writer.write(chars);
            //换行
            writer.write("\n");
            writer.write(chars,2,3);
            writer.write("\n");
            writer.write("菜鸡也有梦，菜鸡也想想进大厂");

            //刷新流
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer!=null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
