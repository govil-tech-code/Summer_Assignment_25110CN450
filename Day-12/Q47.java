// Write a program to Write function for Fibonacci.

public class Q47 {
    public static void fibonacci(int n) {
        int a=0;
        int b=1;
        if(n<=0) {
            return;
        }
        if(n==1) {
            System.out.print(a);
            return;
        }
        System.out.print(a+" "+b+" ");
       for(int i=3; i<=n; i++) {
            int temp=a+b;
            a=b;
            b=temp;
             System.out.print(b+" ");
        }
    }
    public static void main(String[] args) {
        fibonacci(6);
    }
}