package array.StackTest;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-17
 * Time:20:36
 */


/*
             编写程序：使用一位数组，模拟栈数据结构
             要求：
                1.这个栈可以存储java中的任何引用类型的数据
                2.在栈中提供push方法模拟压栈（栈满了，要有提示信息）
                3.在栈中提供pop方法模拟弹栈（栈空了，也有提示信息）
                4.编写测试程序，new栈对象，调用push，pop方法来模拟压栈弹栈的动作
                5.假设栈的默认初始化容量为10（请注意无参构造方法的编写方式）
 */
public class MyStack {
    private Object[] elements;
    //栈帧，永远指向栈顶元素
    private int index;

    /**
     * 无参数构造方法
     */
    public MyStack() {
        //一维数组动态初始化
        this.elements = new Object[10];
        //给index初始化
        this.index = -1;
    }

    /**
     * 压栈的方法
     * @param obj 被压入的元素
     */
    public void push(Object obj) throws MyStackOperationException {
        if (this.index >= this.elements.length-1) {
          /*  System.out.println("压栈失败，栈已满");
            return;*/
            throw new MyStackOperationException("压栈失败，栈已满");
        }
        //走到这里，说明栈没满
        //向栈中加一个元素，栈帧向上移动一个位置
        this.elements[++index] = obj;
        System.out.println("压栈"+obj+"元素成功，栈帧指向"+index);
    }

    /**
     * 弹栈的方法，即从数组向外取元素，每取出一个元素，栈帧向下移动一位
     */
    public void pop() throws MyStackOperationException {
        if (index<0) {
            /*System.out.println("栈为空，无法弹栈");
            return;*/
            throw new MyStackOperationException("栈为空，无法弹栈");
        }
        //走到这里说明这个栈不为空，弹出index位置的元素即可
        System.out.print("弹栈"+this.elements[index]+"元素成功,");
        //index移动至下一位
        index--;
        System.out.println("栈帧指向"+index);
    }

    /**
     * set和get也许用不上，但是必须写上，封装的规矩
     * 封装：第一步：属性私有化，第二步：对外提供set和get方法
     * @return
     */
    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
