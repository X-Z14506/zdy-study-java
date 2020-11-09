//输出倒数第k个结点方法的测试

public class singleListTest04 {
    public static void main(String[] args) {
        SingleListTest01 singleListTest01 = new SingleListTest01();
        singleListTest01.addFirst(1);
        singleListTest01.addFirst(9);
        singleListTest01.addFirst(6);
        singleListTest01.addFirst(4);
        singleListTest01.addFirst(11);
        singleListTest01.addFirst(17);
        singleListTest01.display();//17 11 4 6 9 1
       
       //输出倒数第3个结点---应该输出为6
        Node ret3 = singleListTest01.findKthToTail(3);
        System.out.println(ret3.val);//6
       
       //输出倒数第5个结点---应该输出为11
        Node ret4 = singleListTest01.findKthToTail(5);
        System.out.println(ret4.val);//11
       
       //输出倒数第0个结点---应该输出为null
        Node ret5 = singleListTest01.findKthToTail(0);
        System.out.println(ret5);//null
       
       //输出倒数第8个结点，应该输出“超出该单链表的长度范围” \n null
        Node ret6 = singleListTest01.findKthToTail(8);
        System.out.println(ret6);//超出该单链表的长度范围
                                 //null
    }
}
