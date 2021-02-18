
/*
    必须掌握：
       怎么通过反射机制访问一个java对象的属性
            给属性赋值set
            获取属性的值get
 */
public class ReflectTest07 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {

        //一、不使用反射机制去访问一个对象的属性
        Student student = new Student();
        //给属性赋值
        student.no = 111;
        //读取属性值
        System.out.println(student.no);


        //二、使用反射机制去访问一个对象的属性（set get）
        //获取类
        Class studentClass = Class.forName("reflect.Student");
        //实例化对象
        Object object = studentClass.newInstance();//object就是student对象（底层调用无参构造方法）

        //获取no属性（根据属性的名称来获取Field）
        Field noField = studentClass.getDeclaredField("no");
        //给object对象（Student对象）的no属性赋值
        /*
            虽然使用了反射机制，但是三要素还是缺一不可
                要素1：object对象
                要素2: no属性
                要素3： 222值
             注意：反射机制让代码复杂了，但是让代码更加灵活，所以值得使用
         */
        noField.set(object,222);//给object对象的no属性赋值222
        //读取属性的值
        Object o = noField.get(object);
        System.out.println(o);


        //可以访问私有的属性吗？
        Field nameField = studentClass.getDeclaredField("name");

        //如果不打破封装，无法访问，会抛异常：java.lang.IllegalAccessException:
                                     //Class reflect.ReflectTest07 can not access a member of class reflect.Student with modifiers "private"

        //打破封装(反射机制的缺点：打破封装，程序变得不安全，)
        //这样设置完之后，在外部也是可以访问私有属性的
        nameField.setAccessible(true);

        //给name属性赋值
        nameField.set(object,"zhangsan");

        //获取name属性的值
        System.out.println(nameField.get(object));
    }
}
