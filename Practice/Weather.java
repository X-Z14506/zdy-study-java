/*
                                 
业务:从键盘上接收天气的信息:
		1表示:雨天
		0表示:晴天
同时从健盘上按收性别的信息:
		1表示:男
		0表示:女
业务要求:当天气是雨天的时候:
		男的:打一把大黑伞
		女的:打一把小花伞
当天气是晴天的时候:
		男的:直接走起，出去玩要
		女的:擦点防晒霜，出去玩要
*/

public class Weather{  
	public static void main(String[] args){ 
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入您的性别,输入1为男,输入0为女:");
		int gender = s.nextInt();
		System.out.print("请输入天气,输入1为雨天,输入0为晴天:");
		int weather = s.nextInt();
		if (gender == 1){ 
			if (weather == 1){
				System.out.println("男的打一把大黑伞");
			}
			else if (weather == 0){   
					System.out.println("直接走起，出去玩耍");
			}
		}
		if (gender == 0&&weather == 1){ 
			System.out.println("女的打一把小花伞");
		}else if (weather == 0){   
				System.out.println("擦点防晒霜，出去玩耍");
		}
     } 
   }
}

