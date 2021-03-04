import java.io.*;


/*
     拷贝目录
 */
public class CopyAllDir {
    public static void main(String[] args) {
        //拷贝源
        File srcFile = new File("F:\\java02");
        //拷贝目标
        File destFile = new File("E:\\");
        //调用拷贝方法
        copyDir(srcFile,destFile);
    }

    /**
     * 拷贝目录
     * @param srcFile  拷贝源
     * @param destFile  拷贝目标
     */
    private static void copyDir(File srcFile, File destFile) {
        if (srcFile.isFile()) {
            //递归出口：srcFile如果是一个文件的话，递归结束


            //是文件的时候需要拷贝
            //一边读一边写
            FileInputStream in = null;
            FileOutputStream out = null;
            try {
                //读文件
                //读取这个文件"F:\\java02"
                in = new FileInputStream(srcFile);
                //写文件
                //写入这个文件中"E:\\java02"
                String path = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\")+srcFile.getAbsolutePath().substring(3);
                out = new FileOutputStream(path);

                //一边读一边写
                byte[] bytes = new byte[1024*1024];//一次复制1MB
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes,0,readCount);
                }
                out.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (out!=null) {
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


            return;
        }

        //获取拷贝源下面的子目录
        File[] files = srcFile.listFiles();
        for (File file : files) {
            //获取所有的文件（包括目录和文件）绝对路径
            //System.out.println(file.getAbsolutePath());

            if (file.isDirectory()) {
                //新建对应的目录
                //F:\java02\file02   源目录
                //E:\java02\file02    目标目录
                String srcDir = file.getAbsolutePath();
                String destDir = (destFile.getAbsolutePath().endsWith("\\") ? destFile.getAbsolutePath() : destFile.getAbsolutePath()+"\\")+srcDir.substring(3);
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }
            }
            //递归调用
            copyDir(file,destFile);
        }
    }
}
