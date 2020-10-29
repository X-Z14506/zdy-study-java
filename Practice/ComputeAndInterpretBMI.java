
/*
编写程序提示用户输入以英镑为单位的体重，以及以英寸为单位的身高，然后显示BMI
注意：一磅是0.45359237千克，而一英寸是0.0254米

-------------------------------------
      BMI                说明
-------------------------------------
   BMI < 18.5            偏瘦
-------------------------------------
  18.5<=BMI<25.0         正常
-------------------------------------
  25.0<=BMI<30.0         偏胖
-------------------------------------
   30.0<=BMI             过胖
-------------------------------------

*/

例如：Enter weight in pounds : 
      146
      Enter height in inches :
      70
      BMI is 20.94860504845499
      先生/女士，您的身体状况正常


import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //提醒用户输入体重
        System.out.println("Enter weight in pounds : ");
        double weight = input.nextDouble();
        //提醒用户输入身高
        System.out.println("Enter height in inches :");
        double height = input.nextDouble();
        final double kilograms_per_pound= 0.453592397;
        final double meters_per_inch = 0.0254;
        //计算BMI 
        double weightInKilograms = weight * kilograms_per_pound;
        double heightInMeters = height * meters_per_inch;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        //显示结果
        System.out.println("BMI is "+bmi);
        if (bmi <18.5){
            System.out.println("先生/女士，您的身体状况偏瘦");
        }
        else if (bmi < 25.0){
            System.out.println("先生/女士，您的身体状况正常");
        }
        else if (bmi < 30.0){
            System.out.println("先生/女士，您的身体状况超重");
        }
        else
            System.out.println("先生/女士，您的身体状况过胖");
    }
}
