import java.util.Scanner;

// Class representing a Bank
class Bank {

    private String name;

    // Constructor
    public Bank(String name) {
        this.name = name;
    }

    // Method to open an account for a customer
    public BankAccount openAccount(Customer customer, double initialBalance) {
        return new BankAccount(this, customer, initialBalance);
    }

    // Method to get bank name
    public String getName() {
        return name;
    }
}

// Class representing a Customer
class Customer {

    private String name;
    private BankAccount account;

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // Method to create a new bank account
    public void createAccount(Bank bank, double initialBalance) {
        this.account = bank.openAccount(this, initialBalance);
    }

    // Method to display account details
    public void displayAccount() {
        System.out.println("Customer: " + name);

        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("No account found.");
        }
    }
}

// Class representing a Bank Account
class BankAccount {

    private static int accountCounter = 1000;
    private int accountNumber;
    private Bank bank;
    private Customer customer;
    private double balance;

    // Constructor
    public BankAccount(Bank bank, Customer customer, double initialBalance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = initialBalance;
        this.accountNumber = accountCounter++;
    }

    // Method to view balance
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank: " + bank.getName());
        System.out.println("Balance: $" + balance);
    }
}

// Main class to demonstrate association
public class BankSystem {

    public static void main(String[] args) {

        // Creating bank objects
        Bank bank1 = new Bank("State Bank");
        Bank bank2 = new Bank("City Bank");

        // Creating customer objects
        Customer customer1 = new Customer("Ankush");
        Customer customer2 = new Customer("Ansh");

        // Opening accounts for customers in different banks
        customer1.createAccount(bank1, 5000);
        customer2.createAccount(bank1, 3000);
        customer1.createAccount(bank2, 7000);

        // Displaying customer details and associated account
        customer1.displayAccount();

        System.out.println();

        customer2.displayAccount();
    }
}
