package array.StackTest;

import array.StackTest.MyStack;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-17
 * Time:22:44
 */
public class MyStackTest {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        //压栈
        try {
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            stack.push(new Object());
            //第十一个压栈失败，栈满了
            stack.push(new Object());
        }catch (MyStackOperationException e) {
            //输出异常的简单信息
            System.out.println(e.getMessage());
        }



        //弹栈
        try {
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            stack.pop();
            //此时栈为空，弹栈失败
            stack.pop();
        }catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }





    }



}
