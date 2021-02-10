package array.hotelTest;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-18
 * Time:0:17
 */

/*
      酒店对象，酒店中有二维数组，二维数组模拟大厦
 */
public class Hotel {
    /**
     * 二维数组，模拟大厦所有的房间
     */
    private Room[][] rooms;

    //盖楼通过构造方法来盖楼
    public Hotel() {
        //动态初始化：三层楼，一层10个房间
        rooms = new Room[3][10];

        //对二维数组进行遍历
        for (int i = 0;i<rooms.length;i++) {
            for (int j = 0 ; j <rooms[i].length;j++) {
                if (i==0) {
                    //一层
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);
                    //二层
                }else if (i==1) {
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);
                    //三层
                }else if (i==2) {
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }

    //在酒店对象上提供一个打印房间列表的方法
    public void print() {
        //打印所有房间状态，就是遍历二维数组
        for (int i = 0; i < rooms.length;i++) {
            //内层for循环负责输出一层的房间
            for (int j = 0 ;j<rooms[i].length;j++) {
                Room room = rooms[i][j];
                System.out.print(room+" ");
            }

            //换行
            System.out.println();
        }
    }


    /**
     * 订房方法
     * @param roomNo 调用此方法需要传递一个房间编号过来，这个房间编号是前台小姐姐自己输入的
     */
    public void order(int roomNo) {
        //订房最主要的是将房间对象的status修改为false
        //Room对象的status修改为false
        //假设房间编号是207（下标是rooms[1][6]）
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        if (room.isStatus() == false) {
            System.out.println("抱歉，该房间已被预定");
            return;
        }
        //修改为占用
        room.setStatus(false);
        System.out.println(roomNo+"订房成功");
    }

    /**
     * 退房方法
     * @param roomNo
     */
    public  void exit(int roomNo) {
        Room room = rooms[roomNo/100-1][roomNo%100-1];
        if (room.isStatus() == true) {
            System.out.println("抱歉，该房间未被预定");
            return;
        }
        //修改房间状态为空闲
        room.setStatus(true);
        System.out.println(roomNo+"退房成功");
    }
}

