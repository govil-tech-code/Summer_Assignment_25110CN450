// Write a program to Create marksheet generation system...

import java.util.Scanner;

public class Q108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int marks[] = new int[5];
        int total = 0;
        double percentage;
        char grade;

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.println("Enter Marks of 5 Subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        percentage = total / 5.0;

        if (percentage >= 90)
            grade = 'A';
        else if (percentage >= 75)
            grade = 'B';
        else if (percentage >= 60)
            grade = 'C';
        else if (percentage >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n----- Marksheet -----");
        System.out.println("Student Name : " + name);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + percentage + "%");
        System.out.println("Grade        : " + grade);

        sc.close();
    }
}