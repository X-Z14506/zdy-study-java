/*
提示用户输入三角形的三个顶点的x和y的坐标值，然后计算三角形的三个角
可以通过此公式计算角度：A = acos((a*a-b*b-c*c)/(-2*b*c));
                       B = acos((b*b-a*a-c*c)/(-2*a*c));
                       C = acos((c*c-a*a-b*b)/(-2*b*a));
                       
例如：当输入三个顶点的坐标为（x1,y1)=(1,1)  (x2,y2)=(6.5,1)  (x3,y3)=(6.5,2.5)
                 三个角的角度分别为：15.26  90.0  74.74
*/

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //提醒用户输入三个点的坐标
        System.out.print("请输入三个点坐标：");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        //计算三个边的长度
        double a = Math.sqrt((x2-x3) * (x2-x3) + (y2-y3) * (y2-y3));
        double b = Math.sqrt((x1-x3) * (x1-x3) + (y1-y3) * (y1-y3));
        double c = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
        //计算三个角度
        double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
        double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
        double C = Math.toDegrees(Math.acos((c*c-a*a-b*b)/(-2*b*a)));
        //打印结果
        System.out.println("此三角形的三个角的角度分别为"+
                Math.round(A*100)/100.0+" "+
                Math.round(B*100)/100.0+" "+
                Math.round(C*100)/100.0);
    }
}
