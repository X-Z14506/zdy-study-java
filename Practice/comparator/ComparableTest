package comparator;


import java.util.TreeSet;



/**
 * 用户自定义类型想要按照大小进行比较时，在定义类时，需要实现 Comparable 接口 ，然后在类中重写compareTo方法
       比较规则由程序员自己定，例如，下列程序，按照User的年龄升序比较
 *     不然会抛异常：java.lang.ClassCastException: comparable.User cannot be cast to java.lang.Comparable
 */
 
 
public class ComparableTest {
    public static void main(String[] args) {
        TreeSet<User> treeSet = new TreeSet<>();

        User user1 = new User(20);
        User user2 = new User(10);
        User user3 = new User(35);
        User user4 = new User(29);
        User user5 = new User(25);

        treeSet.add(user1);
        treeSet.add(user2);
        treeSet.add(user3);
        treeSet.add(user4);
        treeSet.add(user5);

       for (User user:treeSet) {
           System.out.println(user);
       }
    }



}

class User implements Comparable<User>{
    private int age;
    private String name;

    public User() {

    }
    public User(int age) {
        this.age = age;
    }
    public User(int age,String name) {
        this.age = age;
        this.name = name;
    }

/*   @Override
    //倘若有多个属性的比较规则，按照如下方式写排序规则
    public int compareTo(User o) {
        if (this.age == o.age) {
            //String类型内部已经重写了compareTo方法，比较的时候直接调用方法即可
            //当年龄相等的时候比较name
            return this.name.compareTo(o.name);
        }else {
            //年龄不想等就按照年龄比较
            return  this.age - o.age;
        }
    }*/

    @Override
    public int compareTo(User o) {
        return  this.age - o.age;//升序
        // return  o.age - this.age;//降序
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
