/*
1-100内所有整数中数字9出现的次数
*/


public class CountNumber{
	public static void main(String[] args){
		int i = 1 , sum = 0;
		while (i < 100){
           if (i / 10 / 9 == 1 || i % 10 / 9 == 1 ){
			   sum++;
           } 
		   i++;
		}
		System.out.println("1-100内所有整数中数字9出现的次数为 : " + sum + "次");
	}
}
