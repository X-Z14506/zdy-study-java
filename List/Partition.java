//编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前

public class SingleList06 {
    public Node1 head;

    public Node1 partition(int x) {
        Node1 beforeStart = null;
        Node1 beforeEnd = null;
        Node1 afterStart = null;
        Node1 afterEnd = null;
        Node1 cur = this.head;
        //新创建两个单链表，一个存放原链表内值小于x的结点，另一个存放原链表内值大于x的结点
        while (cur != null) {
            if (cur.val < x) {
                if (beforeStart == null) {
                    beforeStart = cur;
                    beforeEnd = cur;
                } else {
                    beforeEnd.next = cur;
                    beforeEnd = cur;
                    cur = cur.next;
                }
            }
            if (cur.val > x) {
                if (afterStart == null) {
                    afterStart = cur;
                    afterEnd = cur;
                } else {
                    afterEnd.next = cur;
                    afterEnd = cur;
                    cur = cur.next;
                }
            }
        }
        //将两个新得到的单链表连接起来
        if (beforeStart == null || afterStart == null) {
            return this.head;
        }
        else {
            beforeEnd.next = afterStart;
            afterEnd.next = null;
        }
        return this.head;
    }
    public void addLast(int val){
        Node1 node = new Node1(val);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node1 cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    public void display() {
        Node1 cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
class Node1 {
    public int val;
    public Node1 next;//存储对象引用

    public Node1(int val) {
        this.val = val;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}
