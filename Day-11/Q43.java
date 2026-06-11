// Write a program to Write function to check prime.

public class Q43 {
    public static void check_prime(int n) {
        if(n<2) {
            System.out.print(n+ " "+"not prime no.");
            return;
        }
        for(int i=2; i*i<=n; i++) {
            if(n%i==0) {
                System.out.print(n+" "+"is not prime");
                return;
            }
        }
         System.out.print(n+" "+"is prime No");
    }
    public static void main (String[] args) {
        check_prime(100);
    }
}
