package collection;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-24
 * Time:10:38
 */

import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.math.BigDecimal;
import java.util.*;

/**
 * java.util.Collection 是个集合接口
 * java.util.Collections 是个集合工具类，方便集合的操作
 */
public class CollectionsTest {
    public static void main(String[] args) {
        //ArrayList是线程不安全的
        List<String> list = new ArrayList<>();
        //变成线程安全的
        Collections.synchronizedList(list);

        list.add("adc");
        list.add("abc");
        list.add("apc");
        list.add("afc");

        //排序
        System.out.println("========String类型排序=====");
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }

        //存放自定义类型
        List<Bird> birds = new ArrayList<>();
        birds.add(new Bird(10));
        birds.add(new Bird(5));
        birds.add(new Bird(8));

        //注意：对List元素自定义类型的元素排序时，要保证该类型实现了Comparable接口
        System.out.println("========Bird类型排序========");
        Collections.sort(birds);

        for (Bird bird : birds) {
            System.out.println(bird);
        }

        //对Set集合的排序
        System.out.println("===========对Set结合的排序================");
        Set<String> set = new HashSet<>();
        set.add("king");
        set.add("zdy");
        set.add("wdy");
        set.add("hdy");
        //先将Set集合转换为List集合:将set传入List集合
        List<String> list1 = new ArrayList<>(set);
        Collections.sort(list1);

        for (String s : list1) {
            System.out.println(s);
        }
    }
}

class Bird implements Comparable<Bird>{
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Bird(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                '}';
    }
    @Override
    public int compareTo(Bird o) {
        return this.age-o.age;
    }
}
