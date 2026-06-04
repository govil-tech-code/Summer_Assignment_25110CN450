// Write a program to Find nth Fibonacci term.

public class Q14 {
    public static void fib_n_term(int n) {
    int a=0,b=1;
    if(n==1) {
        System.out.print(a);
    }
    else if(n==2) {
        System.out.print(b);
    }
        for(int i=3; i<=n; i++) {
           int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.print(n+"th term of fibonacci series = " +b);
}
public static void main(String[] args) {
    fib_n_term(5);
}
}
