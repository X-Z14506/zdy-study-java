/*
求出0～999之间的所有“水仙花数”并输出。
(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
如；153＝1＋5＋3?，则153是一个“水仙花数“。）
答题
*/

public class NarcissisticNumber{
	public static void main(String[] args){
		int sum = 0;
		for ( int i = 0; i <= 999 ; i++ ){
			int a = i % 100 % 10;
			int b = i % 100 / 10;
			int c = i / 100;
			if (i == a*a*a + b*b*b + c*c*c){
				sum++;
				System.out.println(i + "is shuixianhua");
			}
		}
		System.out.println("水仙花数为 ："+sum );
	}
}
