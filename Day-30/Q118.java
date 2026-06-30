// Write a program to Create mini library system...

import java.util.Scanner;

public class Q118 {

    static int[] bookId = new int[100];
    static String[] bookName = new String[100];
    static String[] author = new String[100];
    static boolean[] issued = new boolean[100];

    static int count = 0;

    // Add Book
    static void addBook() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        bookId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        bookName[count] = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author[count] = sc.nextLine();

        issued[count] = false;

        count++;

        System.out.println("Book added successfully!");
    }


    // Display Books
    static void displayBooks() {

        if(count == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nLibrary Books:");

        for(int i = 0; i < count; i++) {

            System.out.println("--------------------");
            System.out.println("Book ID: " + bookId[i]);
            System.out.println("Book Name: " + bookName[i]);
            System.out.println("Author: " + author[i]);

            if(issued[i])
                System.out.println("Status: Issued");
            else
                System.out.println("Status: Available");
        }
    }


    // Search Book
    static void searchBook() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();

        for(int i=0; i<count; i++) {

            if(bookId[i] == id) {

                System.out.println("Book Found:");
                System.out.println("Name: " + bookName[i]);
                System.out.println("Author: " + author[i]);
                return;
            }
        }

        System.out.println("Book not found.");
    }


    // Issue Book
    static void issueBook() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();


        for(int i=0; i<count; i++) {

            if(bookId[i] == id) {

                if(issued[i]) {
                    System.out.println("Book already issued.");
                }
                else {
                    issued[i] = true;
                    System.out.println("Book issued successfully.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }


    // Return Book
    static void returnBook() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();


        for(int i=0; i<count; i++) {

            if(bookId[i] == id) {

                if(issued[i]) {
                    issued[i] = false;
                    System.out.println("Book returned successfully.");
                }
                else {
                    System.out.println("Book was not issued.");
                }

                return;
            }
        }

        System.out.println("Book not found.");
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch(choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    displayBooks();
                    break;

                case 3:
                    searchBook();
                    break;

                case 4:
                    issueBook();
                    break;

                case 5:
                    returnBook();
                    break;

                case 6:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 6);
    }
}