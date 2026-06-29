// Write a program to Create inventory management system...

import java.util.Scanner;

public class Q116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] product = new String[50];
        int[] quantity = new int[50];
        double[] price = new double[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n--- INVENTORY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Remove Product");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter product name: ");
                    product[count] = sc.nextLine();

                    System.out.print("Enter quantity: ");
                    quantity[count] = sc.nextInt();

                    System.out.print("Enter price: ");
                    price[count] = sc.nextDouble();

                    count++;

                    System.out.println("Product added successfully.");
                    break;


                case 2:
                    System.out.println("\nProduct List:");

                    if (count == 0) {
                        System.out.println("Inventory is empty");
                    } 
                    else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(
                                "Name: " + product[i] +
                                ", Quantity: " + quantity[i] +
                                ", Price: " + price[i]
                            );
                        }
                    }
                    break;


                case 3:
                    System.out.print("Enter product name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (product[i].equalsIgnoreCase(search)) {

                            System.out.println("Product found:");
                            System.out.println(
                                "Name: " + product[i] +
                                ", Quantity: " + quantity[i] +
                                ", Price: " + price[i]
                            );

                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product not found");

                    break;


                case 4:
                    System.out.print("Enter product name: ");
                    String update = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (product[i].equalsIgnoreCase(update)) {

                            System.out.print("Enter new quantity: ");
                            quantity[i] = sc.nextInt();

                            System.out.println("Quantity updated");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product not found");

                    break;


                case 5:
                    System.out.print("Enter product name to remove: ");
                    String remove = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (product[i].equalsIgnoreCase(remove)) {

                            for (int j = i; j < count - 1; j++) {
                                product[j] = product[j + 1];
                                quantity[j] = quantity[j + 1];
                                price[j] = price[j + 1];
                            }

                            count--;

                            System.out.println("Product removed");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Product not found");

                    break;


                case 6:
                    System.out.println("Exiting Inventory System...");
                    break;


                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}