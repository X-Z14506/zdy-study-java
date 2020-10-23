/*
 一个数如果恰好等于他的因子之和，则称为完数，如6 = 2 + 3 + 1，
 编程找出1000以内所有的完数。
*/

public class Test03{ 
	public static void main(String [] args){
	    //1不属于完数，从2开始判断；
		  //第一步：先从2-1000，每个数字都取出来 
	   for ( int i = 2; i <= 1000 ; i++ ){ 
				  int sum = 0;
		   // 第二步，判断i是不是完数，数有了后，找该数的因子
	      // 假设这个数字是6，则i=6，j可以取1、2、3、4、5
			// 实际j只取到一半就行了，j取1、2、3即可
             for ( int j = 1; j <= i / 2 ; j++ ){
                if (i % j ==  0 ){
                   sum += j;
		        }
		     }
			if (i == sum){
                System.out.println(i);
           }
	   }
	}
}
