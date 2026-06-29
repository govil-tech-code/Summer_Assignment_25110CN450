// Write a program to Create menu-driven string operations system..

import java.util.Scanner;

public class Q115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {
            System.out.println("\n--- STRING OPERATIONS MENU ---");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Reverse String");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Convert to Uppercase");
            System.out.println("7. Convert to Lowercase");
            System.out.println("8. Compare Strings");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter string: ");
                    str = sc.nextLine();
                    System.out.println("String stored successfully.");
                    break;

                case 2:
                    System.out.println("String is: " + str);
                    break;

                case 3:
                    System.out.println("Length = " + str.length());
                    break;

                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reverse = " + rev);
                    break;

                case 5:
                    String reverse = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        reverse += str.charAt(i);
                    }

                    if (str.equals(reverse))
                        System.out.println("String is Palindrome");
                    else
                        System.out.println("String is not Palindrome");
                    break;

                case 6:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 7:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 8:
                    System.out.print("Enter another string: ");
                    String str2 = sc.nextLine();

                    if (str.equals(str2))
                        System.out.println("Strings are equal");
                    else
                        System.out.println("Strings are not equal");
                    break;

                case 9:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 9);

        sc.close();
    }
}