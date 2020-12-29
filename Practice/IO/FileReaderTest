

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 * FileReader
     * 文件字符输入流，只能读取普通文本，
     * 读取文本时，比较方便，快捷
 */
 
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/temp");
            char[] chars = new char[4];//一次读取4个字符
            int readCount = 0;
            while ((readCount = reader.read(chars)) != -1) {
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
