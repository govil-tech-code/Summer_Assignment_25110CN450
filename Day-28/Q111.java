// Write a program to Create ticket booking system....

import java.util.Scanner;

class Ticket {
    String customerName;
    int ticketId;
    int seats;

    Ticket(String name, int id, int seats) {
        customerName = name;
        ticketId = id;
        this.seats = seats;
    }

    void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Number of Seats: " + seats);
    }
}

public class Q111 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Ticket ticket = null;
        int availableSeats = 50;
        int choice;

        do {
            System.out.println("\n===== TICKET BOOKING SYSTEM =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Check Available Seats");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    if(ticket == null) {

                        sc.nextLine();

                        System.out.print("Enter customer name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter number of seats: ");
                        int seats = sc.nextInt();

                        if(seats <= availableSeats && seats > 0) {

                            int id = (int)(Math.random()*10000);

                            ticket = new Ticket(name, id, seats);

                            availableSeats -= seats;

                            System.out.println("Ticket booked successfully.");
                            System.out.println("Your Ticket ID: " + id);

                        } else {
                            System.out.println("Seats not available.");
                        }

                    } else {
                        System.out.println("Ticket already booked.");
                    }
                    break;


                case 2:
                    if(ticket != null) {
                        ticket.displayTicket();
                    } else {
                        System.out.println("No ticket found.");
                    }
                    break;


                case 3:
                    if(ticket != null) {

                        availableSeats += ticket.seats;
                        ticket = null;

                        System.out.println("Ticket cancelled successfully.");

                    } else {
                        System.out.println("No ticket to cancel.");
                    }
                    break;


                case 4:
                    System.out.println("Available Seats: " + availableSeats);
                    break;


                case 5:
                    System.out.println("Thank you for using Ticket Booking System.");
                    break;


                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

        sc.close();
    }
}