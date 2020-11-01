//给定一个字符串，判定是否全部由数字组成


//方法一：将字符串转变为字符数组而后判断每一位字符是否是“0”-“9”之间的内容，如果是则为数字
public class StringIsNumber {
    public static void main(String[] args) {
        String str = "1a23456";
        System.out.println(isNumber(str) ? "字符串由数字组成！" : "字符串中有非数字成员！");//字符串中有非数字成员！
        String str2 = "123456";
        System.out.println(isNumber(str2) ? "字符串由数字组成！" : "字符串中有非数字成员！");//字符串由数字组成！
    }
    public static boolean isNumber(String str) {
        char[] data = str.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if (data[i] < '0' || data[i] > '9'){
                return false;
            }
        }
        return true;
    }


//方法二：获取字符串每个位置的字符，而后判断每一位字符是否是'0'-'9'之间的内容，如果是则为数字

public class StringIsNumber {
    public static void main(String[] args) {
        String str = "1a23456";
        System.out.println(isNumber(str) ? "字符串由数字组成！" : "字符串中有非数字成员！");//字符串中有非数字成员！
        String str2 = "123456";
        System.out.println(isNumber(str2) ? "字符串由数字组成！" : "字符串中有非数字成员！");//字符串由数字组成！
    }
    public static boolean isNumber(String str) {
       for(int i = 0; i < str.length(); i++){
          if(str.charAt(i) < '0' || str.charAt(i) > '9' ){
             return false; 
          }
       }
       return true;
    }
