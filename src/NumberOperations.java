import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            compare(a, b);
            mathOperations(a, b);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void compare(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    public static void mathOperations(int a, int b) {
        System.out.println("Sum = " + (a + b));
        System.out.println("Sub = " + (a - b));
        if (b != 0) {
            System.out.println("Division = " + (double) a / b);
        } else {
            System.err.println("Division by zero!");
        }
        System.out.println("Multiply = " + (a * b));
    }
}