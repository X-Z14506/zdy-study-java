

/*
假设某大学今年的学费是10000美元，而且以每年7%的速度增加，多少年之后学费会翻倍？

输出应为：学费将于11年后翻倍
         学费将会在11年后变成21048.52元
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;
        while (tuition < 20000) {
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("学费将于" + year +"年后翻倍");
        System.out.printf("学费将会在%1d年后变成%.2f元",year,tuition);
    }
}
