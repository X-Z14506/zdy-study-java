//输入一个链表，输出该链表的倒数第k个结点

class Node {
    public int val;
    public Node next;//存储对象引用

    public Node(int val) {
        this.val = val;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}

public class SingleListTest01 {
    public Node head;
    
    //输出该链表的倒数第k个结点
    public Node findKthToTail(int k) {
        if ( k <= 0 || head == null) {
            return null;
        }
        Node fast = this.head;
        Node slow = this.head;
        //fast先走k-1步，再让fast和slow同时走，因为当fast走到最后，倒数第k个节点即为slow，此时fast和slow恰好相差k-1；
        while (k-1 > 0) {
            if (fast != null) {
                fast = fast.next;
                k--;
            }
            else {
                System.out.println("超出该单链表的长度范围");
                return null;
            }
        }
        //fast先走完k-1步之后，fast和slow此时同时一起走，当fast的下一个结点为空时，slow所在位置即为该单链表的倒数第k个结点；
        while (fast.next != null) {
            fast = fast.next;
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
