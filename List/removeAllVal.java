////删除链表中等于给定值val的所有节点；

class Node {
    public int val;
    public Node next;//存储对象引用

    public Node(int val) {
        this.val = val;
        //这里没有初始化next的引用是，不知道next当前指向那个
        //节点
    }
}

public class SingleList01 {
    public Node head;
        //删除链表中等于给定值val的所有节点；
    public Node removeAllVal(int val) {
        if (this.head == null) {
            return null;
        }
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if(cur.val == val){
                prev.next = cur.next;
            }else{
                prev = prev.next;
            }
            cur = cur.next;
        }
        if(head.val == val){
            head = head.next;
        }
        return head;
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
}
