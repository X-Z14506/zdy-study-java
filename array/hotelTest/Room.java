package array.hotelTest;

import com.sun.org.apache.xpath.internal.objects.XBooleanStatic;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-17
 * Time:23:32
 */
public class Room {
    /**
     * 房间编号
     * 1楼：101 102 103 104
     * 2楼：201 202 203 204
     * 3楼：301 302 303 304
     */
    private int no;

    /**
     * 房间类型 ：标准间，单人间，总统套房
     */
    private String type;
    /**
     * 房间状态：true表示空闲房间可以被预定，
     *         false表示占用，房间不能被预定
     */
    private boolean status;

    //无参构造方法
    public Room() {

    }
    //有参构造方法
    public Room(int no , String type,boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //IDEA对于boolean了性的变量，生成的get方法的方法名是isXXX(),不喜欢可以自己改成getXXX（）
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //重写toString()方法
    @Override
    public String toString() {
        return "["+no+","+type+","+(status?"空闲":"占用")+"]";
    }

    //重写equals()方法
    public boolean equals(Object obj) {
        if (obj==null || (obj instanceof Room)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Room room = (Room)obj;
        //当前房间编号等于传过来的房间对象的房间编号，认为是同一个房间
        return this.getNo() == room.getNo();
    }
}
