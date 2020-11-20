//直接插入排序 ///////////////////////////////////////////////////////

public class Main {
    public static void insertSort() {
        int[] a = {7,10,3,6,8};
        System.out.println(Arrays.toString(a));//排序前：[7, 10, 3, 6, 8]
        for( int i = 1; i < a.length;i++) {
            int temp = a[i];
            int j = i-1;
            for (; j >= 0; j--) {
            
            // 为啥temp不能换成a[i]，换成a[i]就错了：i的下标在小for循环结束前一直不变，i下标内的值可能会被置换
                if (temp < a[j]) { 
                    a[j+1] = a[j];
                }
                else {
                    break;
                }
            }
            //走到这里要么j为0下标前一位，要么前面都比temp小
            a[j+1] = temp;
        }
        for (int ret = 0; ret < a.length;ret++) {
            System.out.print(a[ret] + " ");//3 6 7 8 10（排序后）
        }
        System.out.println();
        System.out.println(Arrays.toString(a));//[3, 6, 7, 8, 10]（排序后）

    }
}
