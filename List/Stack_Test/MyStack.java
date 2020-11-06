//实现一个栈

public class MyStack {
    private int[] array = new int[100];
    private int size = 0;
    //压栈
    public void push(int value) {
        array[size++] = value;
    }
    //弹栈
    public int pop() {
        return array[--size];
    }
    //获取栈顶元素
    public int peek() {
        return array[size-1];
    }
    //判断栈是否为空
    public boolean isEmpty() {
        return size == 0;
    }
    //获取栈内元素数量
    public int size() {
        return size;
    }


    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1999);
        myStack.push(1);
        myStack.push(17);
        System.out.println(myStack.peek());//17
        System.out.println(myStack.size());//3
        System.out.println(myStack.pop());//17
        System.out.println(myStack.size());//2
        System.out.println(myStack.isEmpty());//false
    }
}
