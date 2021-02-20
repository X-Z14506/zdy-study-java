package io;

import java.io.*;
import java.nio.Buffer;


/*
        BufferedWriter：带有缓冲的字符输出流
 */


public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
       /* //带有缓冲区的字符输出流
        BufferedWriter writer = new BufferedWriter(new FileWriter("copy",true));*/

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("copy",true)));
        //开始写
        writer.write("hello world!");
        writer.write("\n");
        writer.write("hello kitty");
        writer.write("\n");
        //刷新
        writer.flush();
        //关闭最外层
        writer.close();
    }
}
