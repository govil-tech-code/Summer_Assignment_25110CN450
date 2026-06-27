// Write a program to Create salary management system...

import java.util.Scanner;

public class Q107 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        double basic[] = new double[10];
        double bonus[] = new double[10];
        double deduction[] = new double[10];
        double netSalary[] = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Salary Management System ---");
            System.out.println("1. Add Employee Salary");
            System.out.println("2. Display Salary Records");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Basic Salary: ");
                    basic[count] = sc.nextDouble();

                    System.out.print("Enter Bonus: ");
                    bonus[count] = sc.nextDouble();

                    System.out.print("Enter Deduction: ");
                    deduction[count] = sc.nextDouble();

                    netSalary[count] = basic[count] + bonus[count] - deduction[count];

                    count++;
                    System.out.println("Salary Record Added.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\nSalary Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Employee: " + name[i]);
                            System.out.println("Basic Salary: " + basic[i]);
                            System.out.println("Bonus: " + bonus[i]);
                            System.out.println("Deduction: " + deduction[i]);
                            System.out.println("Net Salary: " + netSalary[i]);
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 3);

        sc.close();
    }
}