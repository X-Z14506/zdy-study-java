
//求两个正整数的最大公约数


import java.util.Scanner;
public class HomeWork09 {
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("请输入两个整数");
       int num1 = scanner.nextInt();
       int num2 = scanner.nextInt();
       for(int i = Math.min(num1, num2);i > 0;i--) {
           if(num2 % i == 0 && num1 % i == 0) {
              System.out.println("这两个整数的最大公约数是" + i);
              break;
           } 
       }
   }
}
