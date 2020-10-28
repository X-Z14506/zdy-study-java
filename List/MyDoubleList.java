

class ListNode {
    public int val;
    public ListNode next;
    public ListNode prev;
    public ListNode(int val){
        this.val = val;
    }
}
public class DoubleList {
    public ListNode head;
    public ListNode last;//双向链表的尾巴
   
   //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    
    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        if(this.head == null) {
            this.head = node;
            this.last = node;
        }else {
            this.last.next = node;
            node.prev = this.last;
            this.last = node;
        }
    }
    
    //查找链表中的元素
    public ListNode searchIndex(int index) {
        if(index < 0 || index > size()) {
            return null;
        }
        ListNode cur = this.head;
        while (index != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode node = new ListNode(data);
        ListNode cur = searchIndex(index);
        if(cur == null) {
            return;
        }
        node.next = cur;
        cur.prev.next = node;
        node.prev = cur.prev;
        cur.prev = node;
    }
    
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    
    //删除第一次出现关键字为key的节点
    //返回值代表你要删除的数字
    public void remove(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(this.head.val == key) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next!=null) {
                        //当前的cur不是最后一个节点
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = this.last.prev;
                    }
                }
                return;
            }else {
                cur = cur.next;
            }
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(this.head.val == key) {
                    if(this.head.next == null) {
                        this.head = null;
                        return;
                    }
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next!=null) {
                        //当前的cur不是最后一个节点
                        cur.next.prev = cur.prev;
                    }else {
                        this.last = this.last.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    
     //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = this.head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display(){
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print (cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }

    //清空双链表
    public void clear(){
        this.last = null;
        this.head = null;
    }

}

