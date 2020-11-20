
    //选择排序////////////////////////////////////////////
   
   
public class Main { 
    public static void selectSort(int[] array) {
        for (int i = 0;i < array.length;i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
