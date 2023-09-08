package assignment_20;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int arr[]={4,6,3,8,1};
        int sum = 0;
        for (int i=0;i< arr.length;i++){
            sum = sum +arr[i];
        }
        System.out.println("Sum of Elements: "+sum);
    }
}
