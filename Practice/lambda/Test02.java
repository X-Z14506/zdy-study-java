
//实现一个比较器
public class Test02 {
    public static void main(String[] args) {
        //1.使用接口实现类
        Comparator comparator = new MyComparator();
        System.out.println(comparator.compare(1, 2));

        //2.使用匿名内部类
        Comparator comparator1 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a-b;
            }
        };
        System.out.println(comparator1.compare(1,2));

        //3.使用Lambda表达式来实现接口
        Comparator comparator2 = (a,b) -> a-b;
        System.out.println(comparator2.compare(1,2));
    }
}


//自定义比较器接口
class MyComparator implements Comparator {
    @Override
    public int compare(int a, int b) {
        return a-b;
    }
}


//函数式接口注解用来判断这个函数式接口有没有声明正确
@FunctionalInterface
interface Comparator{
    //抽象方法
    int compare(int a,int b);
}
