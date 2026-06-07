//Write a program to Recursive Fibonacci. 

public class Q26 {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
           return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("fibonacci series : ");
        for(int i=1; i<=n; i++) {
        System.out.print(fibonacci(i)+" ");
    }
   }
}