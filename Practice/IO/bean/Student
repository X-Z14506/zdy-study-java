
import java.io.Serializable;


public class Student implements Serializable {
    //java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号
    //这里没有手动写出来，java虚拟机会默认提供这个序列化版本号
    //建议将序列化版本号手动写出来，不建议自动生成

    private static final long serialVersionUID = 1l;//java虚拟机识别一个类的时候，先通过类名，在通过序列化版本号，所以冲突概率很低
    private int no;
    private String name;

    public Student () {

    }
    public Student(int no, String name) {
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
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
