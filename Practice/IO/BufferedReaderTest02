package io;



import java.io.*;

/**
 * 转换流：InputStreamReader
 */
 
 
public class BufferedReaderTest02 {
    public static void main(String[] args) throws IOException {
       /* //字节流
        FileInputStream in = new FileInputStream("src/io/Copy01.java");

        //通过转换流InputStreamReader将字节流转换为字符流
        //in是字节流，reader是包装流
        InputStreamReader reader = new InputStreamReader(in);

        //这个构造方法只能传一个字节流，不能穿字符流，因此要将字符流转换为字节流
        //reader是节点流，br是包装流
        BufferedReader  br = new BufferedReader(reader);*/

        //上面三条语句可以合并为一句
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/io/Copy01.java")));

        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        //关闭最外层流
        br.close();

    }
}
