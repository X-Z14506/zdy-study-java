package array.sort;

import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-18
 * Time:10:46
 */

/**
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {9,8,10,7,6,0,11};
        System.out.println("==============冒泡排序前====================");
        System.out.println(Arrays.toString(a));
        //7个数据，循环6次，每次循环比较n-1次
        int count = 0;
        for (int i = a.length-1;i>0;i--) {
            for (int j = 0;j < i;j++) {
                count++;
                //不管是否需要交换位置，总是要比较一次
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("=================冒泡排序后=================");
        System.out.println(Arrays.toString(a));
        System.out.println("比较次数："+count);
    }
}
