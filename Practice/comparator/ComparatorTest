package comparator;



/**
 * 比较器Comparator
 *    TreeMap的key或者TreeSet集合中的自定义类型的元素想要排序有两种实现方式：
 *        方式一：实现java.lang.Comparable接口
 *        方式二：Comparator比较器 有两种方式：
 *                               方式1：单独写一个比较器，传入集合
 *                               方式2：创建集合的时候编写一个Comparator匿名内部类传入集合
 */



public class ComparatorTest {
    public static void main(String[] args) {
        WuGui wuGui1 = new WuGui(1000);
        WuGui wuGui2 = new WuGui(500);
        WuGui wuGui3 = new WuGui(800);
        //创建TreeSet集合的时候，需要使用这个比较器
        //TreeSet<WuGui> wuGuis = new TreeSet<>(); 这样不行，因为没有通过通过构造方法，传递比较器进去

        System.out.println("===============方式1比较器=================");
                                        //方式1：单独写一个比较器，传入集合
        TreeSet<WuGui> wuGuis0 = new TreeSet<>(new WuGuiComparator());
        wuGuis0.add(new WuGui(1800));
        wuGuis0.add(new WuGui(8200));
        wuGuis0.add(new WuGui(8100));
        for (WuGui wuGui99: wuGuis0) {
            System.out.println(wuGui99);
        }

        System.out.println("===============方式2比较器=================");
                                            //方式2：匿名内部类，传入集合
        TreeSet<WuGui> wuGuis = new TreeSet<>(new Comparator<WuGui>() {
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        wuGuis.add(wuGui1);
        wuGuis.add(wuGui2);
        wuGuis.add(wuGui3);

        for (WuGui wuGui : wuGuis) {
            System.out.println(wuGui);
        }
    }
}

class WuGui {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "小乌龟{" +
                "age=" + age +
                '}';
    }
}

//单独编写一个比较器
class WuGuiComparator implements Comparator<WuGui> {
    @Override
    public int compare(WuGui o1, WuGui o2) {
        //指定比较规则
        //按照年龄排序
        return o1.getAge() - o2.getAge();
    }
}
