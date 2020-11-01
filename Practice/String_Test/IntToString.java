


//由基本数据型态转换成String
//String.valueOf()
public class IntToString{
    public static void main(String[] args) {
        String s="";
        for(int i=0;i<10;i++){
            s+=String.valueOf(i);//将 int 变量 i 转换成字符串
        }
        System.out.println(s);  //0123456789
    }
    /*
        建议不要这样写，因为这样写创建了11个引用
        也就是创建了11个临时变量
        造成了空间的浪费 ，而它的目的是只输出最后一个引用对应的内容
     */
}
