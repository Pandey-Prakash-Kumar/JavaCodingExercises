package assignment_21;
import java.util.Scanner;
public class ElementFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={2,6,2,2,6};
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(n == arr[i])
                count++;
        }
        System.out.println("frequency of "+n+": "+count);
    }

}
