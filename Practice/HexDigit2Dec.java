/*
将十六进制数转换为十进制数
十六进制计数系统有16个数字：0-9，A-F ，字母A-F对应十进制数字10-15

例如：请输入一个十六进制数
      AB7C
      对不起，请输入正确十六进制数格式
      
      请输入一个十六进制数
      8
      这个十六进制数8的十进制形式是8
      
      请输入一个十六进制数
      F
      这个十六进制数F的十进制形式是15
      
      请输入一个十六进制数
      U
      U是一个无效的十六进制数

*/

import java.util.Scanner;

public class HexDigit2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个十六进制数");
        String hex = input.nextLine();

        //检查输入的十六进制数格式是否正确
        if (hex.length() != 1){
            System.out.println("对不起，请输入正确十六进制数格式");
            System.exit(1);
        }
        char ch = Character.toUpperCase(hex.charAt(0));
        if (ch<='F'&&ch>='A'){
            int val = ch - 'A' + 10;
            System.out.println("这个十六进制数"+ch+"的十进制形式是"+val);
        }
        else if (Character.isDigit(ch)){
            System.out.println("这个十六进制数"+ch+"的十进制形式是"+ch);
        }
        else{
            System.out.println(ch+"是一个无效的十六进制数");
        }
    }
}
