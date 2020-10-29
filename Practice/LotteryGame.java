/*
   开发一个玩彩票的游戏，程序随机产生一个两位数的彩票，提示玩家输入一个两位数，然后按照下面的规则判定玩家是否能赢；
1.如果玩家输入的数字匹配彩票的实际顺序，获得一等奖：10000元
2.如果玩家输入的数字匹配彩票的所有数字，获得二等奖：3000元
3.如果玩家输入的一个数字匹配彩票的一个数字，获得三等奖：1000元
注意：两位数字的位中可能为0.如果一个数小于10，我们假设这个数字以0为开始，从而构建一个两位数，
例如：8视作08，0视作00

例如：
     请输入您要猜的两位数 ：
      55
      获奖彩票数字为 ： 66
      谢谢惠顾

      请输入您要猜的两位数 ：
      55
      获奖彩票数字为 ： 35
      恭喜您，获得二等奖 ，您将获得奖金1000元


*/


import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        //创建一个获奖彩票数字
        int lottery = (int)(Math.random()*100);
        //提醒玩家输入猜的数字
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要猜的两位数 ：");
        int guess = input.nextInt();
        //从获奖彩票数字得到十位和个位的数字
        int lotteryNumber1 = lottery / 10;
        int lotteryNumber2 = lottery % 10;
        //从玩家输入的数字得到十位和个位的数字
        int guessNumber1 = guess / 10;
        int guessNumber2 = guess % 10;
        System.out.println("获奖彩票数字为 ： "+lottery);
        //进行对比
        if (guess == lottery){
            System.out.println("恭喜您，获得一等奖 ，您将获得奖金10000元");
        }
        else if (guessNumber1 == lotteryNumber2 && guessNumber2==lotteryNumber1){
            System.out.println("恭喜您，获得二等奖 ，您将获得奖金3000元");
        }
        else if (guessNumber1 == lotteryNumber1 
                || guessNumber1 == lotteryNumber2 
                || guessNumber2 == lotteryNumber1 
                || guessNumber2 == lotteryNumber2){
            System.out.println("恭喜您，获得二等奖 ，您将获得奖金1000元");
        }
        else
            System.out.println("谢谢惠顾");
    }
}
