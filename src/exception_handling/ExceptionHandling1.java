package exception_handling;
import java.util.Scanner;
// <- implicit throw & implicit catch ->
public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a /b; // if b=0 it will throw an implicit exception and that will implicitly catch by the JVM and stop running program.
        System.out.println("Quotient = "+c);

        System.out.println("Now Enter your favourite number: ");
        int d = sc.nextInt();
        System.out.println("Your favourite Number is "+d);
    }

}
