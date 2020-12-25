package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("D:\\Temp\\test.txt");
            System.out.println("============while循环优化前==============");
            while (true) {
                int readData = fis.read();
                if (readData == -1) {
                    break;
                }
                System.out.print(readData+" ");
            }

          
          /* System.out.println("============while循环优化后==============");

            int readData = 0;
            while ((readData = fis.read()) != -1) {
                System.out.println(readData);
         }*/
         
         
         
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
