/*
将字符串进行逆置

例如：输入：abcdef
     输出：fedcba
*/  


public class StringReverse {
    public static String reverse(String string) {
        //先把字符串转变为数组
        char[] array = string.toCharArray();
        //开始逆置
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        //把数组变成字符串
        return String.valueOf(array);
    }
    public static void main(String[] args) {
        String string = "abcdef";
        System.out.println(reverse(string));
    }
}
