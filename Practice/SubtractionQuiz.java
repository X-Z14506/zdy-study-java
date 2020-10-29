/*
开发一个让一年级学生练习减法的程序。程序随机产生两个一位整数：number1和number2，且满足number1>=number2.程序向学生显示问题，
例如，"What is 9-2?"。当学生输入答案之后，程序会显示一个消息表明该答案是否正确。
*/

例如：问题：What is 6-6？ 
      回答：0
      答案：You are correct!
      
      问题：What is 9-2？ 
      回答：5
      答案：You answer is wrong.
            9-2 should be 7
            
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
    //产生两个随机一位数
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        //如果number1小于number2，交换number1和number2的值
        if (number1 < number2){
            int temp = number1;7
            number1 = number2;
            number2 = temp;
        }
        //提示学生去回答问题
        System.out.println(" What is " + number1 + " - " + number2 + " ? ");
        Scanner input =new Scanner(System.in);
        int answer = input.nextInt();
        if (number1 - number2 == answer){
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You answer is wrong.");
            System.out.println(number1+" - "+number2+" should be "+(number1-number2));
        }
    }
}
