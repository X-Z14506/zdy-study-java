/*
统计一个字符数组中每个字母出现的次数

例如：
随机出现的小写字母有：
a a f i c d h s g d q d p t k t a c d d
t m y t a k i h h a i c s t i x u h m g
d d v j m i f q b y o y x h z j e x p f
i m a x f f h a i e c u f y m o i g d e
l j x k d c y z u p t u w f i v t w k n

每个字母出现的次数为：
7 a 1 b 5 c 9 d 3 e 7 f 3 g 6 h 9 i 3 j
4 k 1 l 5 m 1 n 2 o 3 p 2 q 0 r 2 s 7 t
4 u 2 v 2 w 5 x 5 y 2 z 
Process finished with exit code 0
*/

public class CountLettersInArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("随机出现的小写字母有：");
        displayArray(chars);
        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("每个字母出现的次数为：");
        displayCounts(counts);
    }
    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0;i<chars.length;i++) {
            chars[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length;i++) {
            if ((i+1)%20==0){
                System.out.println(chars[i]);
            }
            else{
                System.out.print(chars[i] + " ");
            }
        }
    }
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (int i = 0; i < chars.length;i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length;i++) {
            if ((i+1)%10==0){
                System.out.println(counts[i]+" "+(char)(i+'a'));
            }
            else {
                System.out.print(counts[i]+" "+(char)(i+'a')+" ");
            }
        }
    }
}
class RandomCharacter {
    public static char getRandomCharacter(char ch1,char ch2) {
        return (char)(ch1 + Math.random()*(ch2-ch1+1));
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a','z');
    }
}
