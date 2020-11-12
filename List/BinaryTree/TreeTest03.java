/*
编一个程序，读入用户输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。 
例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。

例如：
    输入
    abc##de#g##f###

    输出
    c b e g d f a 
*/


import java.util.Scanner;

class Tree {
    public char val;
    public Tree left;
    public Tree right;

    public Tree(char val) {
        this.val = val;
    }
}
public class Main {
    static int i = 0;
    public static Tree createTreeByString(String string) {
        Tree root = null;
        if (string.charAt(i) != '#') {
            root = new Tree(string.charAt(i));
            i++;
            root.left = createTreeByString(string);
            root.right = createTreeByString(string);
        }
        else {
            i++;
        }
        return root;
    }
     static void inOrderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ret = scanner.nextLine();
        Tree root = createTreeByString(ret);
        inOrderTraversal(root);
    }
}
