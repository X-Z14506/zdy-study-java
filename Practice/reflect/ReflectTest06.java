/*
     通过反射机制，反编译一个类的属性Field
     即给一个.class文件，可以获取.java文件中的所有属性


public class Student {
	public int no;
	private String name;
	protected int age;
	 boolean sex;
}
 */
public class ReflectTest06 {
    public static void main(String[] args) throws ClassNotFoundException {

        //创建这个是为了拼接字符串
        StringBuilder sb = new StringBuilder();

        Class studentClass = Class.forName("reflect.Student");

                  //得到类的修饰符
        sb.append(Modifier.toString(studentClass.getModifiers())+" class "+studentClass.getSimpleName()+" {\n");

        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            //每个属性前拼接一个缩进符
            sb.append("\t");
            sb.append(Modifier.toString(field.getModifiers()));
            sb.append(" ");
            sb.append(field.getType().getSimpleName());
            sb.append(" ");
            sb.append(field.getName());
            sb.append(";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}

