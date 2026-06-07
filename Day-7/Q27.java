// Write a program to Recursive sum of digits.

public class Q27 {
    public static int digit_sum(int n) {
       if(n==0) {
        return 0;
       } else {
        return n%10 + digit_sum(n/10);
       }

    }
    public static void main(String[] args) {
        int n=143;
        System.out.print("Sum of digits = " +digit_sum(n));
    }
   
}
