/*
提示用户输入两个城市，然后以字母表顺序进行显示

例如：请输入第一个城市名字：
      beijing
      请输入第二个城市名字：
      xian
      这两个城市的名字按字母表顺序为beijing xian

*/


import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        //提示用户输入两个城市名字
        System.out.println("请输入第一个城市名字：");
        String city01 = input.nextLine();
        System.out.println("请输入第二个城市名字：");
        String city02 = input.nextLine();
        if (city01.compareTo(city02) < 0) {
            System.out.println("这两个城市的名字按字母表顺序为"+city01+" "+city02);
        }else {
            System.out.println("这两个城市的名字按字母表顺序为"+city02+" "+city01);
        }
    }
}
