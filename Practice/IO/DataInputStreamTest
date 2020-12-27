package io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;



/*
      DataInputStream：数据字节输入流
      DataOutputStream写的文件，只能使用DataInputStream去读。并且读的时候你需要提前知道写入的顺序
                               读的顺序需要和写的顺序一致，慈爱可以正常取出数据
 */


public class DataInputStreamTest {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("data"));
        //开始读,按照什么顺序写的，就要按照什么顺序读
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();

        System.out.println(b);
        System.out.println(i+1000);
        System.out.println(s);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        dis.close();
    }
}
