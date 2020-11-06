//顺序栈+链式队列

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


public class MyQueueTestDemo2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //入队
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        //弹出
        System.out.println(queue.poll());//1
        System.out.println(queue.peek());//2
        System.out.println(queue);//[2, 3, 5, 6, 7]
        System.out.println(queue.isEmpty());//false
    }
}
