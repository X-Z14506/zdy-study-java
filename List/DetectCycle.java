/*
给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。

*/


class ListNode {
     int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
  }
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
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

        if(fast == null || fast.next == null) {
            return null;
        }
        //有环，slow遇到fast，slow走了x+h步，fast走了x+h+nc步
        //2（x+h）= x+h+nc ==》 x=nc-h 
        //x为头到开始入环结点的距离，c为环的周长，h为开始入环结点到相        
        //遇点的距离
        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
