package assignment_20;

public class MinInArray {
    public static void main(String[] args) {
        int []arr={8,5,2,12,4,3};
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Minimum Number is "+min);
    }
}
