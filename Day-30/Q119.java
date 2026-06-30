// Write a program to Create mini employee management system.


import java.util.Scanner;

public class Q119 {

    static int[] empId = new int[100];
    static String[] empName = new String[100];
    static String[] department = new String[100];
    static double[] salary = new double[100];

    static int count = 0;
   
    static void addEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        empName[count] = sc.nextLine();

        System.out.print("Enter Department: ");
        department[count] = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary[count] = sc.nextDouble();

        count++;

        System.out.println("Employee added successfully!");
    }


    // Display Employees
    static void displayEmployee() {

        if(count == 0) {
            System.out.println("No employee records found.");
            return;
        }

        System.out.println("\nEmployee Records:");

        for(int i = 0; i < count; i++) {

            System.out.println("----------------------");
            System.out.println("Employee ID: " + empId[i]);
            System.out.println("Name: " + empName[i]);
            System.out.println("Department: " + department[i]);
            System.out.println("Salary: " + salary[i]);
        }
    }


    // Search Employee
    static void searchEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to search: ");
        int id = sc.nextInt();


        for(int i = 0; i < count; i++) {

            if(empId[i] == id) {

                System.out.println("Employee Found:");
                System.out.println("Name: " + empName[i]);
                System.out.println("Department: " + department[i]);
                System.out.println("Salary: " + salary[i]);

                return;
            }
        }

        System.out.println("Employee not found.");
    }


    // Delete Employee
    static void deleteEmployee() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID to delete: ");
        int id = sc.nextInt();


        for(int i = 0; i < count; i++) {

            if(empId[i] == id) {

                for(int j = i; j < count-1; j++) {

                    empId[j] = empId[j+1];
                    empName[j] = empName[j+1];
                    department[j] = department[j+1];
                    salary[j] = salary[j+1];
                }

                count--;

                System.out.println("Employee deleted successfully.");
                return;
            }
        }

        System.out.println("Employee not found.");
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Mini Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch(choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    displayEmployee();
                    break;

                case 3:
                    searchEmployee();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

    }
}