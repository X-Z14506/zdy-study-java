/*
    将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
    示例：
    输入：1->2->4, 1->3->4
    输出：1->1->2->3->4->4
*/

public class SingleList05 {
    public ListNode head;
    public ListNode mergeTwoLists(ListNode headA, ListNode headB) {
        ListNode newHead = new ListNode(-1);
        ListNode temp = newHead;
        while (headA != null && headB != null) {
            if (headA.val < headB.val) {
                temp.next = headA;
                temp = headA;
                headA = headA.next;
            }
            if (headA.val > headB.val) {
                temp.next = headB;
                temp = headB;
                headB = headB.next;
            }
        }
        if (headA != null) {
            temp.next = headA;
        }
        else {
            temp.next = headB;
        }
        return newHead;
    }
    public void addLast(int val){
        ListNode node = new ListNode(val);
        if(this.head == null) {
            this.head = node;
            return;
        }
        ListNode cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    /**
     * 从指定的节点开始打印
     * newHead
     * @param newHead
     */
    public void display2(ListNode newHead) {
        ListNode cur = newHead;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
