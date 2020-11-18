/*

	小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天
	或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。

*/
   
	public class WhileTest01{   
		public static void main(String[] args){
		    int day = 0; double money = 0.0;
		    while ( money < 100){ 
			   day++;
		           money += 2.5;
			   if ( day % 5 == 0){  
		           money -= 6;
			 } 
		   }
		 System.out.println("小芳经过" + day + "可以存到" + money	+ "元");
		}
	}
