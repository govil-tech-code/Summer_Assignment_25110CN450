// Write a program to Create bank account system...

import java.util.Scanner;

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    // Constructor
    BankAccount(String name, long accNo, double amount) {
        accountHolder = name;
        accountNumber = accNo;
        balance = amount;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Money deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else {
            balance -= amount;
            System.out.println("Money withdrawn successfully.");
        }
    }

    void displayAccount() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Q110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = null;

        int choice;

        do {
            System.out.println("\n===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    sc.nextLine();

                    System.out.print("Enter account holder name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter account number: ");
                    long accNo = sc.nextLong();

                    System.out.print("Enter initial deposit: ");
                    double amount = sc.nextDouble();

                    account = new BankAccount(name, accNo, amount);

                    System.out.println("Account created successfully.");
                    break;


                case 2:
                    if(account != null) {
                        System.out.print("Enter deposit amount: ");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                    } else {
                        System.out.println("Create account first.");
                    }
                    break;


                case 3:
                    if(account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdraw = sc.nextDouble();
                        account.withdraw(withdraw);
                    } else {
                        System.out.println("Create account first.");
                    }
                    break;


                case 4:
                    if(account != null) {
                        account.displayAccount();
                    } else {
                        System.out.println("Create account first.");
                    }
                    break;


                case 5:
                    System.out.println("Thank you for using Bank System.");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

        sc.close();
    }
}