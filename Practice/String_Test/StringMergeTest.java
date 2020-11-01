
/*
实现无冗余地接受两个字符串，然后把他们无冗余的连接起来
例如：输入：abc def
     输出：abcdef 
*/


public class StringMergeTest{
    public static void main(String[] args) {
    //提示输入字符串
        System.out.print("请输入字符串:");
        Scanner scanner = new Scanner(System.in);
        //防止可能出现多组测试用例的情况
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] ret = str.split(" ");
            String s = "";
            for (String ret2 : ret) {
                s += ret2;
            }
            System.out.println(s);
        }
    }
}
