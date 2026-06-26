// Write a program to create quiz application...

import java.util.Scanner;

public class Q104 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Quiz Application =====");

        System.out.println("1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Kolkata");
        System.out.print("Enter your answer: ");
        char ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B') {
            score++;
        }

        System.out.println("\n2. 2+10 = ?");
        System.out.println("a) 10");
        System.out.println("b) 11");
        System.out.println("c) 12");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'c' || ans == 'C') {
            score++;
        }

        System.out.println("\n3. Java is a:");
        System.out.println("a) Programming Language");
        System.out.println("b) Operating System");
        System.out.println("c) Database");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'a' || ans == 'A') {
            score++;
        }

        System.out.println("\n4. Which planet is known as the Red Planet?");
        System.out.println("a) Earth");
        System.out.println("b) Mars");
        System.out.println("c) Jupiter");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'b' || ans == 'B') {
            score++;
        }

        System.out.println("\n5. Which keyword is used to create an object in Java?");
        System.out.println("a) create");
        System.out.println("b) object");
        System.out.println("c) new");
        System.out.print("Enter your answer: ");
        ans = sc.next().charAt(0);

        if (ans == 'c' || ans == 'C') {
            score++;
        }

        System.out.println("\nYour Score = " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}