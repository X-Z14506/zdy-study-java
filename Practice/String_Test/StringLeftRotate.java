/*
字符串的左旋转操作是将字符串前面的若干个字符转移到字符串的尾部，
定义一个函数实现字符串左旋转操作的功能，比如：输入字符串adbdefg和数字2， 输出为cdefgab

思路：1、先将字符串转变为数组
      2、将下标小于2内数组的元素逆置，再将下标为2到下标为数组长度减1内的元素逆置
      3、最后将整体逆置即可
 */
public class StringLeftRotate {
    public static String reverse(String string,int i, int j) {
        //如果字符串为空，返回null
        if (string == null) {
            return null;
        }
        //先把字符串转变为数组
        char[] array = string.toCharArray();
        //开始逆置
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
    public static String reverse02(String string,int k) {
        if (string == null){
            return null;
        }
        int len = string.length();
        if ( k <= 0 || k > len) {
            return null;
        }
        string = reverse(string,0,k-1);
        string = reverse(string,k,len-1);
        string = reverse(string,0,len-1);
        return string;
    }
    public static void main(String[] args) {
        String string = "abcdef";
        System.out.println(reverse02(string,2));
    }
}
