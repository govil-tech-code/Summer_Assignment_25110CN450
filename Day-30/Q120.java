// Write a program to Develop complete mini project using arrays, strings and functions..

import java.util.Scanner;

public class Q120 {

    static int[] productId = new int[100];
    static String[] productName = new String[100];
    static double[] price = new double[100];
    static int[] quantity = new int[100];

    static int count = 0;


    // Function to add product
    static void addProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        productId[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Product Name: ");
        productName[count] = sc.nextLine();

        System.out.print("Enter Product Price: ");
        price[count] = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        quantity[count] = sc.nextInt();

        count++;

        System.out.println("Product added successfully!");
    }


    // Function to display products
    static void displayProducts() {

        if(count == 0) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("\nProduct List:");

        for(int i = 0; i < count; i++) {

            System.out.println("--------------------");
            System.out.println("ID: " + productId[i]);
            System.out.println("Name: " + productName[i]);
            System.out.println("Price: " + price[i]);
            System.out.println("Quantity: " + quantity[i]);
        }
    }


    // Function to search product
    static void searchProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();


        for(int i = 0; i < count; i++) {

            if(productId[i] == id) {

                System.out.println("Product Found:");
                System.out.println("Name: " + productName[i]);
                System.out.println("Price: " + price[i]);
                System.out.println("Quantity: " + quantity[i]);

                return;
            }
        }

        System.out.println("Product not found.");
    }


    // Function to sell product
    static void sellProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Quantity to sell: ");
        int q = sc.nextInt();


        for(int i = 0; i < count; i++) {

            if(productId[i] == id) {

                if(quantity[i] >= q) {

                    quantity[i] -= q;

                    System.out.println("Product sold successfully.");
                    System.out.println("Total Bill = " + (price[i] * q));

                } else {
                    System.out.println("Insufficient stock.");
                }

                return;
            }
        }

        System.out.println("Product not found.");
    }



    // Function to delete product
    static void deleteProduct() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product ID to delete: ");
        int id = sc.nextInt();


        for(int i = 0; i < count; i++) {

            if(productId[i] == id) {


                for(int j = i; j < count-1; j++) {

                    productId[j] = productId[j+1];
                    productName[j] = productName[j+1];
                    price[j] = price[j+1];
                    quantity[j] = quantity[j+1];
                }


                count--;

                System.out.println("Product deleted successfully.");
                return;
            }
        }

        System.out.println("Product not found.");
    }



    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;


        do {

            System.out.println("\n===== Mini Shop Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Sell Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");


            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch(choice) {

                case 1:
                    addProduct();
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    searchProduct();
                    break;

                case 4:
                    sellProduct();
                    break;

                case 5:
                    deleteProduct();
                    break;

                case 6:
                    System.out.println("Program closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }


        } while(choice != 6);

    }
}