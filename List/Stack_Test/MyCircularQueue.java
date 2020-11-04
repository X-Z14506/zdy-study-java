
//实现一个循环队列

class MyCircularQueue {
    public int[] elem;
    public int front;
    public int rear;
    
    public MyCircularQueue(int k) {
        this.elem = new int[k+1];
    }

   
    boolean enQueue(int value) {
        //1、判断队列是否是满的
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = value;
        this.rear = (this.rear+1) % this.elem.length;
        return true;
    }

   
    boolean deQueue() {
        //判断队列是否是空的
        if (isEmpty()) {
            return false;
        }
        this.front = (this.front+1) % this.elem.length;
        return true;
    }

   
    int Front() {
        if (isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }


    int Rear() {
        if (isEmpty()) {
            return -1;
        }
        //如果rear为0，则返回数组长度-1，如果rear不为0，则返回rear-1
        /*int index = (this.rear == 0 ? this.elem.length - 1 :this.rear-1);
        return this.elem[index];
         */
        int index = 0;
        if(this.rear == 0) {
            index = this.elem.length-1;
        }else {
            index = this.rear-1;
        }
        return this.elem[index];
    }

    boolean isEmpty() {
        //如果rear 和 front 相遇了说明队列为空；
        if (this.rear == this.front) {
            return true;
        }
        return false;
    }

    
    boolean isFull() {
        if ((this.rear+1) % this.elem.length == this.front) {
            return true;
        }
        return false;
    }
}
