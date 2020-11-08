//反转一个单链表

class Node {
    public int val;
    public Node next;//存储对象引用

    public Node(int val) {
        this.val = val;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}
public class SingleList02 {
    public Node head;

    //反转一个单链表；
    public Node reverseList(){
        Node newHead = null;
        Node prev = null;
        Node cur = this.head;
        while(cur != null){
            Node curNext = cur.next;
            if(curNext == null){
                newHead = cur;
            }
            cur.next = prev;
            prev = cur;
            cur = curNext;
        }
        return newHead;
    }
    public void addFirst(int data) {
        //1、通过data构造一个Node对象
        Node node = new Node(data);
        int x = 10;
        //2、
        if(this.head == null) {
            //第一次插入
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    /**
     * 从指定的节点开始打印
     * newHead
     * @param newHead
     */
    public void display2(Node newHead) {
        Node cur = newHead;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

}
