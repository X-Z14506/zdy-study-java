

public class IoPropertiesTest {
    public static void main(String[] args) throws IOException {

        //方式一：
        //直接以流的形式返回
        InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
        Properties properties1 = new Properties();
        properties1.load(stream);
        stream.close();
        String className = properties1.getProperty("className");
        System.out.println(className);


        //方式二：
        //获取一个文件的绝对路径
        String path = Thread.currentThread().getContextClassLoader().getResource("userinfo.properties").getPath();
        //读取文件
        FileReader reader = new FileReader(path);
        Properties properties = new Properties();
        //加载文件进Properties
        properties.load(reader);
        reader.close();
        //通过key获取value
        String username = properties.getProperty("username");//root
        System.out.println(username);
        String password = properties.getProperty("className");//null
        System.out.println(password);
    }
}
