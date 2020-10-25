/*
1000-2000之间闰年数
*/


public class CountLeapYear{
	public static void main(String[] args){
		int year = 1000, sum = 0;
		while (year <= 2000){
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
				System.out.println(year + " is 闰年");
				sum++;
			}
				year++;
		}
				System.out.println("1000-2000之间闰年数为 ：" + sum);
	}
}
