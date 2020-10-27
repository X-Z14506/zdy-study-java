


public class MySingleListTest {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.addLast(1);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addLast(2);
        mySingleList.addFirst(9);
        mySingleList.addLast(3);
        mySingleList.addLast(4);
        mySingleList.display();//9 1 2 2 2 3 4

        mySingleList.addFirst(99);
        mySingleList.display();// 99 9 1 2 2 2 3 4

        mySingleList.addIndex(5,88);
        mySingleList.display();// 99 9 1 2 2 88 2 3 4

        mySingleList.remove(3);
        mySingleList.display();// 99 9 1 2 2 88 2 4

        mySingleList.removeAllKey(2);
        mySingleList.display();//99 9 1 88 4
        
        mySingleList.clear();
        mySingleList.display();//
    }
}
