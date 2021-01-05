/*
    验证反射机制的灵活性
        java代码写一遍，再不改变java源代码的基础之上，可以做到不同对象的实例化
        更加灵活（符合OCP开闭原则：对扩展开放，对修改关闭）
 */


public class ReflectTest03 {
    public static void main(String[] args) {

        //这种方式实例化对象就写死了，只能创建一个User类型的对象
        //User user = new User();


        //以下代码是灵活的，代码不需要改动，可以修改配置文件，配置文件修改之后，可以创建出不同的实例对象
        //通过IO流读取classinfo.properties文件
        FileReader reader = null;
        try {
             reader = new FileReader("src/classinfo.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //创建属性类对象Map
        Properties properties = new Properties();//key value都是String
        //加载
        try {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (reader!=null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //通过key获取value，即通过key获取类名
        String className = properties.getProperty("className");
        System.out.println(className);

        //通过反射机制实例化对象
        Class c = null;
        try {
            c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object object = c.newInstance();
            System.out.println(object);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
