// Write a program to Character frequency...

import java.util.*;
  public class Q87 {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

     System.out.print("Enter a string: ");
      String str = sc.nextLine();
     for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
     for (int j = 0; j < str.length(); j++) {
           if (ch == str.charAt(j)) {
         count++;
                }
            }
     boolean printed = false;
         for (int k = 0; k < i; k++) {
           if (ch == str.charAt(k)) {
             printed = true;
               break;
             }
          }
         if (!printed) {
             System.out.println(ch + " = " + count);
            }
        }
    }
}