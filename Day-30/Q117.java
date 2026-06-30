// Write a program to Create student record system using arrays and strings....

import java.util.Scanner;

public class Q117 {

    static int[] rollNo = new int[100];
    static String[] name = new String[100];
    static String[] course = new String[100];
    static int[] marks = new int[100];

    static int count = 0;

    // Add student record
    static void addStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Course: ");
        course[count] = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks[count] = sc.nextInt();

        count++;

        System.out.println("Student record added successfully!");
    }

    // Display all records
    static void displayStudents() {

        if (count == 0) {
            System.out.println("No records available.");
            return;
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < count; i++) {
            System.out.println("--------------------");
            System.out.println("Roll No: " + rollNo[i]);
            System.out.println("Name: " + name[i]);
            System.out.println("Course: " + course[i]);
            System.out.println("Marks: " + marks[i]);
        }
    }

    // Search student
    static void searchStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number to search: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {
                System.out.println("Student Found:");
                System.out.println("Name: " + name[i]);
                System.out.println("Course: " + course[i]);
                System.out.println("Marks: " + marks[i]);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete student
    static void deleteStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number to delete: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (rollNo[i] == r) {

                for (int j = i; j < count - 1; j++) {
                    rollNo[j] = rollNo[j + 1];
                    name[j] = name[j + 1];
                    course[j] = course[j + 1];
                    marks[j] = marks[j + 1];
                }

                count--;
                System.out.println("Record deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while(choice != 5);
    }
}