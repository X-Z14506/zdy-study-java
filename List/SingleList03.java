 //给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点


class Node {
    public int val;
    public Node next;//存储对象引用

    public Node(int val) {
        this.val = val;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}
public class SingleList03 {
    public Node head;
    //设定一个快结点一个慢节点
    public Node middleList(){
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null){
        //快结点一次走两步，慢结点一次走一步，当快结点走到尾部，慢结点所在位置即为中间结点
        //这种情况不用区分结点个数为奇还是偶，因为当结点个数为偶次时，有两个中间结点，只需返回第二个中间结点（慢结点所在的位置）
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
