// Write a program to Count words in a sentence....
import java.util.*;
public class Q86 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int n= str.length();
        int count=1;
        for(int i=0; i<n; i++) {
       if(str.charAt(i)==' ') {
         count++;
        }
    }
    System.out.print("Words in a sentence : "+count);
    }
}