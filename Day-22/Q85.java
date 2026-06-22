// Write a program to Check palindrome string....

import java.util.Scanner;
     public class Q85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        boolean palindrome = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
             palindrome = false;
            break;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }
        sc.close();
    }
}