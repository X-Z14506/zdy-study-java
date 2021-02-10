package collection;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-22
 * Time:10:16
 */

import javax.jws.soap.SOAPBinding;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 测试contains方法
 * contains方法内部调用了equals方法
 *
 * 测试remove方法
 * remove方法内部也调用了equals方法
 *
 * 结论：存放在一个集合中的类型，一定要重写equals方法
 */
public class ContainsTest {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();
        //创建用户对象
        User user1 = new User("zdy");
        //放入集合
        c.add(user1);

        //判断集合中是否包含user2,user2未放入集合，但是name和user1一样
        User user2 = new User("zdy");
       /* //User类没有重写equals方法前，集合不包含user2，因为contains调用的是Object类里面的equals方法，
        // Objects类里的equals方法比较的是两个对象的内存地址，user1和user2的内存地址不同，所以输出false
        System.out.println(c.contains(user2));//false*/

        //重写equals方法后，比较的是对象的内容，因此返回true
        System.out.println(c.contains(user2));

        Integer x = new Integer(1000);
        c.add(x);
        Integer y = new Integer(1000);
        //输出true，因为Integer类型已经重写了equals方法
        System.out.println(c.contains(y));

        String s1 = new String("咸阳");
        c.add(s1);
        String s2 = new String("咸阳");

        //输出true，因为String类型已经重写了equals方法
        System.out.println(c.contains(s2));

        System.out.println(c);//[collection.User@1b6d3586, 1000, 咸阳]
    }
}

class User {
    private String name;

    public User () {

    }
    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof User)) {
            return false;
        }
        if (obj == this.name) {
            return true;
        }
        User u = (User)obj;
        return u.name.equals(this.name);
    }
}