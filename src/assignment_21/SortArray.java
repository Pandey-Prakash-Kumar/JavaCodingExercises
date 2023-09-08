package assignment_21;

import java.util.Arrays;
import java.util.Arrays;
public class SortArray {
    public static void main(String[] args) {
        int []arr = {7,5,6,3,8,9};
        int temp;
        //Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
          for (int j=i+1;j<arr.length;j++){
               if (arr[i]>arr[j]) {
                   temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
               }
           }

          }
        for (int k=0;k<arr.length;k++){
            System.out.println(arr[k]);

        }
    }

}
