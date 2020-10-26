public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList(5);
        myArrayList.add(0,1);
        myArrayList.add(1,4);
        myArrayList.add(2,5);
        myArrayList.add(3,7);
        myArrayList.display();//该顺序表此时为 ：1 4 5 7
        
        //测试顺序表长度
        int a = myArrayList.size();
        System.out.println(a);//该顺序表长度为4
        
        //给该顺序表4号位置插入19
        myArrayList.add(4,19);
        myArrayList.display();//该顺序表此时为 ：1 4 5 7 19
        
        
        //清空该顺序表中的第一次出现的数据1
        myArrayList.remove(1);
        myArrayList.display();//该顺序表此时为 ：4 5 7 19
        
        
        //获取该顺序表一号位置的数据值
        int b = myArrayList.getPos(1);
        System.out.println(b);//该顺序表一号位置数据值为5
        
        //将该顺序表的一号位置的数据值设为6
        myArrayList.setPos(1,6);
        myArrayList.display();//该顺序表此时为 ：4 6 7 19
        
        //清空顺序表
        myArrayList.clear();
        myArrayList.display();//此时该顺序表被清空
    }
}
