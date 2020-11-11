/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        //定义一个fast结点，一个slow结点
        ListNode fast = head;
        ListNode slow = head;

        //循环不结束，fast走两步，slow走一步，如果链表有环，while循        
        //环退出则是因为slow==fast
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        //如果因为fast==null || fast.next==null 退出while循环，说明链表无环
        if(fast == null || fast.next == null) {
            return false;
        }
        return true;
    }
}
