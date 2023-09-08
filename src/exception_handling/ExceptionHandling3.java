package exception_handling;
import java.util.Scanner;
// <- Explicit throw & implicit catch

public class ExceptionHandling3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if (age<0)
            throw new ArithmeticException("Age cannot be negative"); // next line will not execute because java default exception handler will run
        System.out.println("Age: "+age);
    }
}
