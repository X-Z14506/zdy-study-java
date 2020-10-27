
//猜数字游戏


import java.util.Scanner;
import java.util.Random;
public class GuessNumberGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rand = random.nextInt(100)+1;
        //[0,100)--->  +1   [1,100]
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int n = scanner.nextInt();
            if(n < rand) {
                System.out.println("猜小了！");
            }else if(n == rand) {
                System.out.println("猜对了");
                break;
            }else {
                System.out.println("猜大了");
            }
        }
    }
