//打印1-9乘法表

            MultiplicationTable
    1    2    3    4    5   6    7    8    9
------------------------------------------------
1 | 1    2    3    4    5   6    7    8    9
2 | 2    4    6    8    10  12   14   16   18
3 |
4 |
5 |
6 |
7 |
8 |
9 |



public class PrintMultiplicationTable{ 
	public static void main(String[] args){
	  System.out.println("\n           MultiplicationTable");
	  System.out.print("\n   ");
	  for(int i=1;i<=9;i++){
		System.out.printf("%4d",i);
	  }
	  System.out.println("\n-----------------------------------------");
	  for(int j=1;j<=9;j++){
		System.out.print(j+" |");
		for(int k=1;k<=9;k++){
		  System.out.printf("%4d",j*k);
		}
		System.out.println();
	  }
	}
}
