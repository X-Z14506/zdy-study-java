/*
多个减法测试题：设计一个程序，该程序可以产生5道问题，在学生回答完所有的5个问题后，
显示回答正确得题数，还有每道题所花费得时间，并列出所有的题目。

例如 ：8-1= ?7
      你真棒，回答正确

      3-1= ?5
      对不起，回答错误

      8-4= ?4
      你真棒，回答正确

      8-1= ?7
      你真棒，回答正确

      5-3= ?5
      对不起，回答错误

      回答正确的题数为：3
      测试时间为：9秒

      8-1=7正确
      3-1=5错误
      8-4=4正确
      8-1=7正确
      5-3=5错误
 */
 
import java.util.Scanner;
 
public class SubtractionQuiz {
    public static void main(String[] args) {
        //标明题目数量为5
        final  int NUMBER_OF_QUESTIONS = 5;
        int correctAnswer = 0;//记录回答正确问题数
        int count = 0;//记录问题总数
        long startTime = System.currentTimeMillis();
        String output = " ";//输出结果开始置为空
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            //获取两个随机数
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            //如果number1 < number2,交换number1和number2的值
            if (number1 < number2 ) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            //提示学生回答number1 - number2
            System.out.print(number1 + "-" + number2 + "= ?" );
            int answer = input.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("你真棒，回答正确");
                correctAnswer++;
            }
            else {
                System.out.println("对不起，回答错误");
            }
            count++;
            System.out.println();
            output += "\n" + number1 + "-" + number2 + "="
                    + answer + ((number1 - number2 == answer) ? "正确":"错误");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("回答正确的题数为：" + correctAnswer +
                "\n测试时间为：" + testTime/1000 + "秒\n" + output);
    }
}
