

public class MyQueueTest {
    public static void main(String[] args) {
        //Queue<Integer> queue = new LinkedList<>();
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1999);
        myQueue.offer(11);
        myQueue.offer(17);
        myQueue.display();//1999 11 17
        System.out.println(myQueue.peek());//1999
        myQueue.display();//1999 11 17
        System.out.println(myQueue.poll());//1999
        myQueue.display();//11 17
        System.out.println(myQueue.poll());//11
        System.out.println(myQueue.isEmpty());//false
    }
}
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}

class MyQueue {
    public Node head;
    public Node tail;
    public int size = 0;

    public void offer(int val) {
        Node node = new Node(val);
        if (this.tail == null) {
            this.head = node;
        }
        else {
            this.tail.next = node;
        }
        this.tail = node;
        size++;
    }

    public int poll() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        Node preHead =  this.head;
        this.head =  this.head.next;
        if ( this.head == null) {
            this.tail = null;
        }
        size--;
        return preHead.val;
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("队列为空");
        }
        return head.val;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
    public  int size() {
        return size;
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
