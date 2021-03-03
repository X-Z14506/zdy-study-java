
import java.io.Serializable;



public class User implements Serializable {
    //  transient 关键字表示游离的，不参与序列化的
    private transient int no;
    private String name;

    public User() {

    }
    public User(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
