package array.search;

/**
 * Created with Intellij IDEA
 * Description:
 * Users:123
 * Date:2020-12-18
 * Time:11:32
 */

import static java.util.Arrays.binarySearch;

/**
 * 二分查找法:二分查找法建立在数据已经被排好序的基础上
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {100,200,230,235,600,1000,2000,9999};
        int index = binarySearch(arr,200);
        System.out.println(index == -1 ? "该元素不存在" : "该元素下标为:" + index);
    }

    /**
     * 从数组中查找目标元素的下标
     * @param arr 被查找的数组（已排好序的数组）
     * @param i  目标元素
     * @return 返回- 表示该元素不存在，其他表示返回目标元素的下标
     */
    private static int binarySearch(int[] arr, int i) {
        int begin = 0;
        int end = arr.length-1;


        while (begin <= end) {
            int mid = (begin+end) / 2;
            if (arr[mid] == i) {
                return mid;
            }else if (arr[mid] < i) {
                begin = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
