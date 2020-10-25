/*
  从键盘输入一个正整数，该正整数作为行数，输出以下图形
    *
   ***
  *****
 *******
*********
  例如，输入5，则打印如上图5行
*/

public class PrintPicture{  
	public static void main(String[] args){ 
		java.util.Scanner s = new java.util.Scanner(System.in);
	    System.out.print("请输入一个正整数");
		int j = s.nextInt();
        //5行循环5次，n行循环n次
	    for (int i =1 ;i <= j ;i++ ) { //最外层循环控制行数
			for (int k = 0 ;k < j - i ;k++ ){
	            System.out.print(" ");  //  输出空格的循环
			}
	        for (int a = 0; a < i * 2 - 1  ;a++ ){
		        System.out.print("*");   // 输出*的循环
			}
		    System.out.println();  //一行循环结束后换行命令
	   }
	}
}
