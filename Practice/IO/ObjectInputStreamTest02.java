import io.bean.User;

import javax.jws.soap.SOAPBinding;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;


/*
    反序列化集合
 */



public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Users"));
      /*  Object  object = ois.readObject();
        System.out.println(object instanceof List);*///true

        List<User> list = (List<User>) ois.readObject();
        System.out.println("反序列化成功");
        for (User user : list) {
            System.out.println(user);
        }

        ois.close();
    }
}
