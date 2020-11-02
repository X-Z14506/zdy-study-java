
/*
判断一个字符串是否回文,"mom","dad","noon"都是回文字符串

例如：请输入一个字符串 ：mom
      mom是回文字符串
      请输入一个字符串 ：sdsaas
      sdsaas不是回文字符串
 */
public class HuiWenString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个字符串 ：");
        String str = input.nextLine();
        boolean ret = HuiWenString.huiWenTest(str);
        if (ret) {
            System.out.println(str + "是回文字符串");
        }
        else{
            System.out.println(str + "不是回文字符串");
        }
    }
    public static boolean huiWenTest(String string) {
        int head = 0;
        int last = string.length() - 1;
        boolean isHuiWen = true;
        while (head < last) {
            if (string.charAt(head) != string.charAt(last)) {
                isHuiWen = false;
                break;
            }
            head++;
            last--;
        }
        return isHuiWen;
    }
}
