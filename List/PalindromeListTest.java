//判断链表的回文方法的测试

public class PalindromeListTest {
    public static void main(String[] args) {
        PalindromeList palindromeList = new PalindromeList();
        palindromeList.addLast(1);
        palindromeList.addLast(2);
        palindromeList.addLast(2);
        palindromeList.addLast(1);
        palindromeList.display();//   1 2 2 1
        boolean ret = palindromeList.chkPalindrome();
        System.out.println(ret); //    true;
        PalindromeList palindromeList1 = new PalindromeList();
        palindromeList1.addLast(1);
        palindromeList1.addLast(2);
        palindromeList1.addLast(3);
        palindromeList1.addLast(2);
        palindromeList1.addLast(1);
        palindromeList1.display();//  1 2 3 2 1
        //   奇数个结点时
        boolean ret1 = palindromeList1.chkPalindrome();
        System.out.println(ret1);//   true
        PalindromeList palindromeList2 = new PalindromeList();
        //    偶数个结点时
        boolean ret2 = palindromeList2.chkPalindrome();
        //     零个结点时
        System.out.println(ret2);  // false
        PalindromeList palindromeList3 = new PalindromeList();
        //    一个结点时
        palindromeList3.addLast(0);
        boolean ret3 = palindromeList3.chkPalindrome();
        System.out.println(ret3); // true
    }
}
