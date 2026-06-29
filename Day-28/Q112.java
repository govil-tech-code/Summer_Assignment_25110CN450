// Write a program to Create contact management system....

import java.util.ArrayList;
import java.util.Scanner;

class Contact {

    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    void displayContact() {
        System.out.println("\nName: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
    }
}


public class Q112 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Contact> contacts = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();


            switch(choice) {


                case 1:
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();


                    contacts.add(new Contact(name, phone, email));

                    System.out.println("Contact added successfully.");
                    break;
                case 2:

              if(contacts.size() == 0) {
                        System.out.println("No contacts available.");
                 }
                    else {

                        System.out.println("\n--- Contact List ---");

                        for(Contact c : contacts) {
                            c.displayContact();
                        }
                    }
                    break;
                case 3:
                    sc.nextLine();

                    System.out.print("Enter name to search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for(Contact c : contacts) {

                        if(c.name.equalsIgnoreCase(search)) {

                            c.displayContact();
                            found = true;
                            break;
                        }
                    }

                    if(!found) {
                        System.out.println("Contact not found.");
                    }

                    break;
                case 4:

                    sc.nextLine();

                    System.out.print("Enter name to delete: ");
                    String deleteName = sc.nextLine();

                    boolean removed = false;


                    for(Contact c : contacts) {

                        if(c.name.equalsIgnoreCase(deleteName)) {

                            contacts.remove(c);
                            removed = true;
                            System.out.println("Contact deleted successfully.");
                            break;
                        }
                    }


                    if(!removed) {
                        System.out.println("Contact not found.");
                    }

                    break;
                case 5:

                    System.out.println("Thank you for using Contact Management System.");
                    break;



                default:

                    System.out.println("Invalid choice.");

            }


        } while(choice != 5);


        sc.close();
    }
}