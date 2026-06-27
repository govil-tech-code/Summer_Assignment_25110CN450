// Write a program to Create student record management system...

import java.util.Scanner;

public class Q105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id[] = new int[10];
        String name[] = new String[10];
        int marks[] = new int[10];

        int count = 0;
        int choice;

        do {
            System.out.println("--- Student Record Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID: ");
                    id[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Records Found.");
                    } else {
                        System.out.println("\nStudent Records:");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + id[i] +
                                    " Name: " + name[i] +
                                    " Marks: " + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (id[i] == searchId) {
                            System.out.println("ID: " + id[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int updateId = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (id[i] == updateId) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks Updated Successfully.");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student Not Found.");
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