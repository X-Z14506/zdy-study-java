/*
括号匹配问题
例如： 若输入字符串"((()))}"
      输出：右括号多
      若输入字符串"((({)))"
      输出：左括号多
      若输入字符串"((()))"
      输出：括号匹配
*/
public class ParenthesesMatchTest {

    public static void main(String[] args) {
        String string = "((()))}";
        T t  = new T();
        boolean ret = t.isValid(string);
        System.out.println(ret);
    }
}
class T {
    Stack<Character> characters = new Stack<>();

    public boolean isValid(String s) {
        for (int i = 0; i < s.length(); i++) {
            //1.左括号入栈；
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                characters.push(temp);
            } else {
                //2.判断栈内是否为空
                if (characters.empty()) {
                    System.out.println("右括号多！");
                    return false;
                }
                //3.判断栈顶元素（左括号）与当前元素（右括号）是否匹配
                char cur = s.charAt(i);//在遍历字符串右括号
                char topChar = characters.peek();//栈顶元素
                //如果匹配，就弹出栈顶字符（左括号），并且栈外当前字符下标指向下一个字符（右括号）
                if (cur == ')' && topChar == '('
                        || cur == ']' && topChar == '['
                        || cur == '}' && topChar == '{') {
                    characters.pop();
                } else {
                    System.out.println("括号不匹配");
                    return false;
                }
            }
        }
        //遍历结束，栈外所有右括号匹配完了，判断栈是否为空，如果不为空，说明左括号多了，不匹配
        if (!characters.empty()) {
            System.out.println("左括号多！");
            return false;
        }
        System.out.println("括号匹配");
        return true;
    }
}
