package assignment_21;

public class Array {
    public int elementFrequency(int []arr, int element){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(element == arr[i])
                count++;
        }
        return count;
    }
    public int[] sortArray(int []arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public int SumOfEvenElement(int []arr){
        int sum = 0;
        for (int num:arr){
            if (num%2==0)
                sum = sum+num;
        }
        return sum;
    }
}
