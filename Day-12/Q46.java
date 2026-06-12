// Write a program to Write function for Armstrong.

public class Q46 {
    public static void armstrong(int n) {
        int digit=0;
        int arm=0;
        int a=n;
        int b=n;
        while(a>0) {
            digit++;
            a=a/10;
        }
        while(b>0) {
           int rem=b%10;
         arm=arm+(int)Math.pow(rem,digit);
         b=b/10;
        }
        if(arm==n) {
            System.out.print(n+" "+"is arm strong number");
        } else{
             System.out.print(n+" "+"is not arm strong number");
        }
    }
    public static void main(String[] args) {
        armstrong(153);
    }
}