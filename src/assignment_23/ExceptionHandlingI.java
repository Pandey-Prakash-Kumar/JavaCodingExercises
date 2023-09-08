package assignment_23;
import java.util.Scanner;
public class ExceptionHandlingI {
    public void inputNIntegers(int size){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter "+size+" Integers");
        int []arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingI ex = new ExceptionHandlingI();
        try {
            ex.inputNIntegers(0);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Code Working ");
        }

    }
}
