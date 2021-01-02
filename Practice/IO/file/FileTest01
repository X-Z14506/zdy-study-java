
import java.io.File;
import java.io.IOException;

/**
 * File:
 *    1.File和四大家族没有什么关系，所以File不能完成读和写
 *    2.File对象代表什么
 *         文件和目录路径名的抽象表示形式
 *         F:\java\Maven\profile\src  是File对象
 *         F:\java\Maven\profile\src\main\java\Main.java  也是File对象
 *         一个File对象对应的有可能是目录，也可能是文件
 *         File只是一个路径名的抽象表达形式
 *
 */
public class FileTest01 {
    public static void main(String[] args) throws IOException {
        /*
            File常用方法

        */
        //创建一个File对象
        File file = new File("F:\\java02\\file");
        System.out.println(file.exists());//判断文件是否存在

        //如果文件不存在，以文件的形式创建出来
        if (!file.exists()) {
            file.createNewFile();
        }

        File file02 = new File("F:\\java02\\file02");
        System.out.println(file02.exists());

        //如果文件不存在，以目录的形式创建出来
        if (!file02.exists()) {
            file02.mkdir();
        }

        //创建多重目录
        File file03 = new File("F:\\java02\\file03\\a\\b\\c");
        System.out.println(file03.exists());
        if (!file03.exists()) {
            file03.mkdirs();
        }

        File file1 = new File("F:\\java02\\file03\\a\\b\\c");
        //获取文件的父路径
        System.out.println(file1.getParentFile());//F:\java02\file03\a\b
        String parentPath = file1.getParent();
        System.out.println(parentPath);

        //获取文件的绝对路径
        System.out.println("绝对路径是："+file1.getAbsolutePath());//绝对路径是：F:\java02\file03\a\b\c

        File file2 = new File("file");
        System.out.println("绝对路径是："+file2.getAbsolutePath());//绝对路径是：F:\java\dongli\practice\file


    }
}
