/*
编写程序输出下图菱形。
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public class Test01 { 
	public static void main(String[] args) {
		int lay = 9;
		for (int m = 1; m <= (lay + 1) / 2; m++){ 
			for (int b = 1; b <= (lay + 1) / 2 - m; b++){ 
				System.out.print(" ");
			}
			for (int c = 1; c <= m * 2 - 1; c++){
				System.out.print("*");
			}
				System.out.println();
		}
	   for (int d = (lay + 1) / 2 - 1; d >= 1; d--){
		   for (int b = 1; b <= (lay + 1) / 2 - d; b++){ 
				System.out.print(" ");
           }
		   for (int c = (lay + 1) / 2 - d; c <= (lay + 1) / 2 - 2 + d; c++){  
			   System.out.print("*");
           }  
	       System.out.println();
      } 
   } 
}
