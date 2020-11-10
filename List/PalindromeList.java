/*对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
 给定一个链表的头指针A，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
 测试样例：
        1->2->2->1
    返回：true*/
    
    
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class PalindromeList {
    public ListNode head;

    public boolean chkPalindrome() {
        //当链表为空时，不是回文
        if (this.head == null) {
            return false;
        }
        //只有1个节点的时候，也是回文
        if (this.head.next == null) {
            return true;
        }
        //    1、找到中间位置
        ListNode fast = this.head;
        ListNode slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //    slow就是中间位置。开始进行第2步
        //    2、slow后半部分进行反转
        ListNode cur = slow.next;
        while (cur != null ) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }
        //    3、开始判断
        while (this.head != slow && slow.next !=null) {
            //结点数为奇数的情况
            if(this.head.val != slow.val) {
                return false;
            }
            //结点数为偶数的情况
            if (this.head.next == slow) {
                return true;
            }
            this.head = this.head.next;
            slow = slow.next;
        }
        return true;
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
    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
