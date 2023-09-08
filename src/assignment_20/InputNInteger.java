package assignment_20;
import java.util.Scanner;
public class InputNInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter "+n+" numbers: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Stored numbers are: ");
        for (int j=0;j<n;j++)
            System.out.println(arr[j]);

    }

}
