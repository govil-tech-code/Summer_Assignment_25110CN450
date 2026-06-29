// Write a program to Create menu-driven array operations system...

import java.util.Scanner;

public class Q114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int choice;

        do {
            System.out.println("\n--- ARRAY OPERATIONS MENU ---");
            System.out.println("1. Insert elements");
            System.out.println("2. Display array");
            System.out.println("3. Search element");
            System.out.println("4. Find maximum element");
            System.out.println("5. Find minimum element");
            System.out.println("6. Calculate sum");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Elements inserted successfully.");
                    break;

                case 2:
                    System.out.println("Array elements are:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == search) {
                            System.out.println("Element found at position " + (i + 1));
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Element not found");
                    break;

                case 4:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max)
                            max = arr[i];
                    }
                    System.out.println("Maximum element = " + max);
                    break;

                case 5:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min)
                            min = arr[i];
                    }
                    System.out.println("Minimum element = " + min);
                    break;

                case 6:
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += arr[i];
                    }
                    System.out.println("Sum of elements = " + sum);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}