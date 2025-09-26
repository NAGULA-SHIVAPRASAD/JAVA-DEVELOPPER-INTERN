import java.util.Scanner;
public class Task1 {
    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }
    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }
    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }
    // Method for division with exception handling
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Error: Division by zero is not allowed!");
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            // Menu for the
            System.out.println("\n=== Basic Calculator ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            if (choice == 5) {
                System.out.println("Exiting... Goodbye!");
                running = false;
                continue;
            }
            // Take input numbers
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            try {
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Result: " + subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Result: " + multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Result: " + divide(num1, num2));
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}
