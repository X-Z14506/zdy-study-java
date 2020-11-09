//返回中间结点方法的测试程序

public class singleListTest03 {
    public static void main(String[] args) {
        SingleListTest01 singleListTest01 = new SingleListTest01();
        singleListTest01.addFirst(1);
        singleListTest01.addFirst(9);
        singleListTest01.addFirst(6);
        singleListTest01.addFirst(4);
        singleListTest01.addFirst(11);
        singleListTest01.addFirst(17);
        singleListTest01.display();//17 11 4 6 9 1
        
        //结点个数为偶数时
        Node ret1 = singleListTest01.middleList();
        System.out.println(ret1.val);//6
        singleListTest01.addFirst(18);
        singleListTest01.display();//18 17 11 4 6 9 1
        
        //结点个数为奇数时
        Node ret2 = singleListTest01.middleList();
        System.out.println(ret2.val);//4
     }
}
