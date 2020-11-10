
//在一个排序的链表中,存在重复的结点,请删除该链表中重复的结点,重复的结点不保留,返回链表头指针
//例如，链表1->2->3->3->4->4->5 处理后为 1->2->5


class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class SingleList07 {
    public Node head;

    public Node deleteDuplication() {
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node temp = newHead;
        while (cur != null){
            if (cur.next != null && cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                cur = cur.next;
            }
            else {
                temp.next = cur;
                temp = temp.next;
                cur = cur.next;
            }
        }
        temp.next = null;
        return newHead.next;
    }
    public void addLast(int val){
        Node node = new Node(val);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
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


