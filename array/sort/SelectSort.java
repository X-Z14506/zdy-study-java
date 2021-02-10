package array.sort;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-18
 * Time:10:57
 */

import java.util.Arrays;

/**
 * 选择排序:效率较冒泡排序高些，因为省去了一些无用的比较次数
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {9,8,10,7,6,0,11};
        int count = 0;
        System.out.println("================选择排序前==============");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length;i++) {
            for ( int j = i+1;j < a.length;j++) {
                if (a[i] > a[j]) {
                    count++;
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("================选择排序后==============");
        System.out.println(Arrays.toString(a));
        System.out.println("交换次数："+count);
    }
}
