import java.util.Scanner;
public class Task2 {
    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        boolean running = true;
        while (running) {
            // Menu
            System.out.println("\n=== Temperature Converter ===");
            System.out.println("1. Celsius → Fahrenheit");
            System.out.println("2. Fahrenheit → Celsius");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = s1.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = s1.nextDouble();
                    System.out.println("Result: " + celsiusToFahrenheit(celsius) + " °F");
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = s1.nextDouble();
                    System.out.println("Result: " + fahrenheitToCelsius(fahrenheit) + " °C");
                    break;
                case 3:
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
        s1.close();
    }
}
