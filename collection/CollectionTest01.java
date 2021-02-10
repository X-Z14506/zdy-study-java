package collection;



import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-22
 * Time:8:47
 */
public class CollectionTest01 {
    public static void main(String[] args) {
        //  Collection c = new Collection(); 这段代码是错的，Collection是接口，无法实例化被new出来
        Collection c = new ArrayList();
        c.add(1200);//集合中不能存储基本数据类型，这其实使用了自动装箱机制，将int类型装箱为Integer类型
        c.add(3.14);//自动装箱，存储的是对象的地址
        c.add(new Object());
        c.add(new Student());
        c.add(true);//自动装箱，存储的是对象的地址

        //获取集合元素个数
        System.out.println("集合中元素个数：" + c.size());


        //转换成数组(了解使用不多)
        Object[] objects = c.toArray();
        for (int i = 0;i < objects.length;i++) {
            Object o = objects[i];
            System.out.println(o);
        }

        //清空集合
        c.clear();
        System.out.println("集合中元素个数：" + c.size());
    }
}

class Student{

}
