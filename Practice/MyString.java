
public class MyString {
    //compareTo
    public static void main5(String[] args) {
        String s3 = "a";
        String s4 = "b";
        System.out.println(s3.compareTo(s4));
        String s1 = "hello world";
        String s2 = "hello java";
        System.out.println(s1.compareTo(s2));
    }
    //contains
    public static void main4(String[] args) {
        String s1 = "hello world hello java";
        boolean ret = s1.contains("zdy");
        System.out.println(ret);
        String s2 = "zdy";
        System.out.println(s2.contains("z"));
    }
    //indexOf
    public static void main2(String[] args) {
        String s = "hello world hello java";
        int index1 = s.indexOf("o",0);
        System.out.println(index1);//4
        int index2 = s.indexOf("o",4);
        System.out.println(index2);//4
        int index3 = s.indexOf("o",11);
        System.out.println(index3);//16
        int index4 = s.indexOf(" ",0);
        System.out.println(index4);//5
    }
    //replace
    public static void main1(String[] args) {
        String s = "hello world , hello zdy";
        System.out.println(s);//hello world , hello zdy
        String m = s.replace("zdy","java" );
        System.out.println(m);// hello world , hello java
    }
    /*
    输出：hello world , hello zdy
         hello world , hello java
     */
     //split
    public static void main(String[] args) {
        String s = "zdy 99-01-17";
        String[] strings1 = s.split(" ",2);
        for (int i = 0; i < strings1.length; i++) {
            String[] strings2 = strings1[i] .split("-");
            for (int j = 0; j < strings2.length; j++) {
                System.out.println(strings2[j]);
            }
        }
    }
}
/*输出：zdy
       99
       01
       17
 */
