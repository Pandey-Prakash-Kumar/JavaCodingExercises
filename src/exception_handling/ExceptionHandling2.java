package exception_handling;
import java.util.Scanner;
// <- implicit throw & explicit catch ->
public class ExceptionHandling2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            int z = x / y;
            System.out.println("Quotient = " + z);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        sc.nextLine();
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
