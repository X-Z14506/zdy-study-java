//设计循环队列

class MyCircularQueue {

    public int[] elem;
    //public int usedSize;
    public int front;
    public int rear;
    
    public MyCircularQueue(int k) {
        this.elem = new int[k];
    }
    
    //往循环队列里面插入一个值，如果成功返回true，否则返回false
    public boolean enQueue(int value) {
        //1、判断是否为满的
        if(isFull()) {
            return false;
        }
        //2、rear -->
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) % this.elem.length;
        return true;
    }
    //从循环队列里面删除一个值，如果成功返回true，否则返回false
    public boolean deQueue() {
        //1、是否为空   front和rear相遇的时候
        if(isEmpty()) {
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }
    //获取循环队列的队首元素
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }
    //获取循环队列的队尾元素
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        int index = 0;
        if(this.rear == 0) {
            index = this.elem.length-1;
        }else {
            index = this.rear-1;
        }
        return this.elem[index];
    }
    //判断循环队列是否为空
    public boolean isEmpty() {
        if(front == rear) {
            return true;
        }
        return false;
    }
     //判断循环队列是否为满
    public boolean isFull() {
        if( (this.rear+1) % this.elem.length == this.front){
            return true;
        }
        return false;
    }
}
