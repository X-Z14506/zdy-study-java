package io;

import java.io.*;



/*
   DataOutputStream： 数据专属的流
        这个流可以将数据连同数据的类型一并写入文件
        注意：这个文件不是普通文本文档（这个文件使用记事本打不开）可以认为是加密后的文件，更安全
*/


public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建数据专属的字节输出流
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));
        //开始写数据
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400l;
        float f = 3.14f;
        double d = 3.14;

        //写，
        dos.writeByte(b);//把数据以及数据的类型一并写入到文件当中
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);

        //刷新
        dos.flush();

        //关闭最外层
        dos.close();

    }
}
