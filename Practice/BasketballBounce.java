/*
篮球从 5 米高的地方掉下来，每次弹起的高度是原来的30%，经过几次弹起，篮
球的高度是 0.1 米。
*/

 public class BasketballBounce{  
	 public static void main(String[] args){ 
		 double high = 5.0;
	     int count = 0;
         while ( high > 0.1){ 
		     high *= 0.3;
			 count++;
		}
		 System.out.println("弹起次数 : " + count);
	 }
 }


