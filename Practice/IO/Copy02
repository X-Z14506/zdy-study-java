package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用FileReader和FileWriter只能复制纯文本文件(注：java文件也是普通文本文件)
 *   能用记事本打开编辑的都是普通文本文件，与后缀无关，不一定非要是.txt文件
 */
public class Copy02 {
    static FileReader reader = null;
    static FileWriter writer = null;

    public static void main(String[] args) {
        try {
            //读
            reader = new FileReader("src/io/Copy02.java");
            //写
            writer = new FileWriter("Copy02.java");

            //边读边写
            char[] chars = new char[1024*512];//1MB
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1) {
                writer.write(chars,0,readCount);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
