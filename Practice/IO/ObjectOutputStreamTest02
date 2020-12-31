import io.bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/*
    一次序列化多个对象：将多个对象放到集合当中，然后序列化集合
    参与序列化的ArrayList集合以及集合中的元素User都需要实现java.io.Serializable接口
 */

public class ObjectOutputStreamTest02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(888,"张三",18));
        userList.add(new User(222,"李四",19));
        userList.add(new User(333,"王五",20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        //序列化一个集合，这个集合对象中放了很多其他对象
        oos.writeObject(userList);
        System.out.println("序列化成功");
        oos.flush();
        oos.close();
    }
}
