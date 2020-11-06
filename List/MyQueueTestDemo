//链式队列

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
    //入队列
    public void offer(int val) {
        Node node = new Node(val);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        this.tail = node;
    }
    //出队列
    public int poll() {
        if(this.head == null) {
            throw new RuntimeException("队列为空\n");
        }
        int oldData = this.head.val;
        if(this.head.next == null) {
            this.head = null;
            this.tail = null;
        }else {
            this.head = this.head.next;
        }
        return oldData;
    }
    //获取队首元素
    public int peek() {
        if(this.head == null) {
            throw new RuntimeException("队列为空\n");
        }
        return this.head.val;
    }
    //判断队列是否为空
    public boolean isEmpty() {
        if(this.head == null) {
            return true;
        }
        return false;
    }

}


public class MyQueueTestDemo {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.peek());//1
        System.out.println(myQueue.poll());//1
        System.out.println(myQueue.poll());//2
        System.out.println(myQueue.poll());//3
        System.out.println(myQueue.poll());//4

    }
}
