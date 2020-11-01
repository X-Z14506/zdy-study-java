

import java.util.Scanner;

public class ReplaceAndSpiltTest {
    public static void main(String[] args) {
        String s = "HelloWorld";
        //将字符串中所有"l"置换为"-"
        System.out.println(s.replaceAll("l","-"));//He--oWor-d
        //将字符串中第一个"l"置换为"-"
        System.out.println(s.replaceFirst("l","-"));//He-loWorld
        String str = "name=zhangsan&age=18";
        String[] ret = str.split("&");
        /*
        此时字符串"name=zhangsan&age=18"被拆分为
        "name=zhangsan"和"age=18"
        */
        for (String s1:ret) {
            String[] ret1 = s1.split("=");
            for (String s2:ret1) {
                System.out.println(s2);
                /*
                 输出结果为：name
                            zhangsan
                            age
                            18
                */
            }
        }
    }
