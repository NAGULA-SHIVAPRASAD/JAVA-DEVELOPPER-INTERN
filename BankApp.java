// Abstraction - only showing necessary details
abstract class Account {
    protected String ownerName;
    protected double balance;

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public abstract void withdraw(double amount); // Abstract method (Abstraction)

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

// Inheritance - SavingsAccount inherits from Account
class SavingsAccount extends Account {

    public SavingsAccount(String ownerName, double balance) {
        super(ownerName, balance); // Call parent constructor
    }

    // Polymorphism - method overriding
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

// Encapsulation - hiding data with getters/setters
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

// Interface - behavior blueprint
interface Printable {
    void printDetails();
}

// Class implementing interface
class Printer implements Printable {
    @Override
    public void printDetails() {
        System.out.println("Printing details...");
    }
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("Shiva", 5000);
        sa.deposit(2000);
        sa.withdraw(3000);
        sa.displayBalance();

        User user = new User("Shiva", 25);
        System.out.println("User: " + user.getName());

        Printable printer = new Printer();
        printer.printDetails();
    }
}
