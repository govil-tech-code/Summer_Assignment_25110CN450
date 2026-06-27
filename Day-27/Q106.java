// Write a program to Create employee management system...

import java.util.Scanner;

public class Q106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id[] = new int[10];
        String name[] = new String[10];
        double salary[] = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    id[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    salary[count] = sc.nextDouble();

                    count++;
                    System.out.println("Employee Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Employee Records.");
                    } else {
                        System.out.println("\nEmployee Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + id[i] +
                                    " Name: " + name[i] +
                                    " Salary: " + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary Updated Successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found.");
                    }
                    break;

                case 5:
                    System.out.println("Program Ended.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}