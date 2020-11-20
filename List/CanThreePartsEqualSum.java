///1013. 将数组分成和相等的三个部分
//给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。

//输入：[0,2,1,-6,6,-7,9,1,2,0,1]
//输出：true
//解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1

//输入：[0,2,1,-6,6,7,9,-1,2,0,1]
//输出：false

public class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        //1.先求数组内元素总和
        int sum = 0;
        for (int e : A) {
            sum += e;
        }

        //2.如果数组总和不是3的倍数，说明不可以被平均分为三份，直接返回false
        if (sum % 3 != 0) {
            return false;
        }

        //3.定义两个指针，同时从数组开头和结尾开始遍历，节省时间
        int left = 0;
        int right = A.length-1;
        int leftSum = A[left];
        int rightSum = A[right];

        //4.循环条件为left+1 < right,防止数组只被分成两部分
        while (left+1 < right) {
            //如果两边都等于sum/3，则中间一定也是sum/3，则返回true
            if (leftSum == sum/3 && rightSum == sum/3) {
                return true;
            }
            //如果左边和不为sum/3，left初始化为0，所以先让left自加，再加上新A[left]的值
            if (leftSum != sum/3) {
                leftSum += A[++left];
            }
            //右边同上
            if (rightSum != sum/3) {
                rightSum += A[--right];
            }
        }
        //5.如果循环走到这里，说明数组总和不能被均分为三份，返回false
        return false;
    }
}
