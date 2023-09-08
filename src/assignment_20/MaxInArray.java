package assignment_20;

public class MaxInArray {
    public static void main(String[] args) {
        int []arr={5,8,4,9,3,6};
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]>max)
                max = arr[i];
        }
        System.out.println("Maximum number is "+max);
    }
}
