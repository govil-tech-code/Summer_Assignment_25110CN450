// Write a program to Create ATM simulation..

import java.util.Scanner;

public class Q103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000, choice, amount;
        do {
            System.out.println("\n1.Balance  2.Deposit  3.Withdraw  4.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
              System.out.println("Balance = " + balance);
                    break;
             case 2:
              System.out.print("Deposit Amount: ");
                amount = sc.nextInt();
                balance += amount;
                    break;
         case 3:
             System.out.print("Withdraw Amount: ");
            amount = sc.nextInt();
                if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdraw Successful");
                 } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 4);

        sc.close();
    }
}