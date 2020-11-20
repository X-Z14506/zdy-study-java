 //希尔排序 ///////////////////////////////////////////////////
 
 
 public class Main {
    public  static  void shellSort(int[] array) {
        int[] gap = {5,3,1};
        for (int i = 0;i < gap.length;i++) {
            shell(array,gap[i]);
        }

    }
    public static void shell(int[] array,int gap) {
        for (int i = gap;i < array.length;i++) {
            int temp = array[i];
            int j = i-gap;
            for (;j>=0;j=j-gap) {
                if (array[j] > temp) {
                    array[j+gap] = array[j];
                }else {
                    break;
                }
            }
            //如果走到这里 说明前面没有比temp大的了，前面已经排好序
            array[j+gap] = temp;
        }
    }
}
