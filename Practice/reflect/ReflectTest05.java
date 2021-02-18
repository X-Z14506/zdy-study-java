/*
    反射Student类中的所有属性Field
 */

public class ReflectTest05 {
    public static void main(String[] args) {
        //获取整个类
        Class studentClass = null;
        try {
            studentClass = Class.forName("reflect.Student");
            System.out.println("完整类名 "+studentClass.getName());
            System.out.println("简类名 "+studentClass.getSimpleName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取类中所有public修饰的Field
        Field[] fields = studentClass.getFields();
        System.out.println("student类中公共属性个数："+fields.length);//测试数组中只有一个元素
        //取出这个Field
        Field f = fields[0];
        //取出这个Field的名字
        String fieldName = f.getName();
        System.out.println(fieldName);

        //获取所有的Field
        Field[] fields1 = studentClass.getDeclaredFields();
        System.out.println("student类中总共有属性个数："+fields1.length);

        //遍历
        for (Field field : fields1) {

            //获取属性类型
            Class fieldType = field.getType();
            //String name = fieldType.getName();
            String name = fieldType.getSimpleName();
            System.out.print(name+" ");

            //获取属性名字
            System.out.print(field.getName()+" ");
            System.out.println();
        }
    }

}
