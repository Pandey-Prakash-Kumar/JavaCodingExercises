package assignment_20;

public class AverageOfElementsOfArray {
    public static void main(String[] args) {
        int []arr = {3,7,3,3,4,7};

        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.printf("Average of Elements of the Array: %.2f%n",((double)sum/arr.length));
    }
}
