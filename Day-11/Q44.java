// Write a program to Write function to find factorial.

public class Q44 {
    public static int factorial(int n) {
        int fact=1, i=1;
        while(i<=n) {
            fact=fact*i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.print("factorial of n : " +factorial(4));
    }
}
