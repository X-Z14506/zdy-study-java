//将数组转换为字符串输出；

import java.util.Arrays;

public class ArraysToString{
	  public static void main(String[] args){
		   int[] arr = {1,2,3,4,5,6};
		   System.out.println(arr2(arr));
	  }
	  public static String arr2(int[] arr){
		    String ret = "[ ";
		    for ( int i = 0;i < arr.length ;i++ ){
			      ret += arr[i];
			      if (i != arr.length-1){
				       ret += ",";
			      }
		    }
		    ret += " ]";
	    	return ret; 
	  }
}
