package collection;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-22
 * Time:9:20
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代器：是所有Collection通用的一种方式
 * 在Map集合中不能用，在所有的Collection以及子类中使用
 *
 * 注意：在迭代元素过程中，一定要使用迭代器iterator的remove方法，删除元素
 *      不要使用集合自带的remove方法删除元素
 */
public class Test02 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();//ArrayList有序可重复，存什么顺序，取也是什么顺序

        /**
         * 此处获取的迭代器，指向的是集合中没有元素状态下的迭代器
         *   注意：集合结构只要发生改变，迭代器必须重新获取
         *   当集合结构发生改变，迭代器没有重新获取，会出现异常： Iterator iterator = c.iterator();
         *                                              java.util.ConcurrentModificationException
         */
        Iterator iterator0 = c.iterator();
        //添加元素
        c.add("zdy");
        c.add("zyd");
        c.add("ydz");
        c.add("yzd");
        c.add("zdy");


        /**
         * 注意：迭代器对象最初并没有指向第一个元素
         *  iterator.hasNext() 这个方法返回true，表示还有元素可以迭代，
         *                      返回false表示没有更多元素可以迭代了
         *  Object o = iterator.next();这个方法让迭代器前进一位，并且将指向的元素返回
         */
        //对集合Collection进行遍历/迭代
        //1.获取集合对象的迭代器对象
        Iterator iterator = c.iterator();
        //2.用迭代器对象开始迭代，遍历集合
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        //HashSet集合:无序不可重复
        //无序：存入和取出的顺序不一定相同
        //不可重复：存储100后。不能再存储100
        Collection c2 = new HashSet();
        c2.add(100);
        c2.add(200);
        c2.add(10);
        c2.add(200);
        c2.add(50);
        c2.add(90);
        Iterator iterator1 = c2.iterator();
        while (iterator1.hasNext()) {
            Object o = iterator1.next();
            System.out.println(o);
        }

        System.out.println("===============remove方法测试=================");

        Collection c3 = new ArrayList();
        c3.add("123");
        c3.add("456");
        c3.add("789");
        System.out.println(c3.size());
        Iterator iterator2 = c3.iterator();
        while (iterator2.hasNext()) {
            Object o = iterator2.next();
            //删除元素之后，集合的结构放生变化，应该重新获取迭代器
            //但是循环下一次的时候使用  c3.remove(o); 并没有重新获取迭代器，所以会出现异常:java.util.ConcurrentModificationException
            //出异常的根本原因是：集合中的元素删除了，但是没有更新迭代器，（迭代器不知道集合变化了）‘
            //c3.remove(o);直接通过集合去删除元素，没有通知迭代器，导致迭代器的快照和源几何状态不同
            //迭代器去删除时，会自动更新迭代器，并且更新集合（删除集合中的元素）
            iterator2.remove();//删除的一定是迭代器当前指向的元素
            System.out.println(o);
        }
        System.out.println(c3.size());
    }
}
