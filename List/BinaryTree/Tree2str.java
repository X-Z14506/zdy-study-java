
/**
  根据二叉树创建字符串
  你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。

  空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。

 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
 public class Tree2str {
        public String tree2str(TreeNode t) {
            StringBuilder stringBuilder = new StringBuilder();
            if (t == null) {
                return "";
            }
            tree2strChild(t,stringBuilder);
            return stringBuilder.toString();
        }
        public void tree2strChild(TreeNode t,StringBuilder stringBuilder){
            if (t == null) {
                return;
            }
            stringBuilder.append(t.val);

            //   t的左边 ////////////////////////////////////////////////////
            if (t.left != null) {
                stringBuilder.append("(");
                tree2strChild(t.left,stringBuilder);
                stringBuilder.append(")");
            }
            else {
                if (t.right == null) {
                    return;
                }
                else {
                    stringBuilder.append("()");
                }
            }
            //  t的右边 /////////////////////////////////////////////////
            if (t.right != null) {
                stringBuilder.append("(");
                tree2strChild(t.right,stringBuilder);
                stringBuilder.append(")");
            }
            else {
                return;
            }
        }
}
