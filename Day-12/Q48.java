// Write a program to Write function for perfect number.

public class Q48 {
    public static void perfect_num(int n) {
        int sum=0;
        if(n<=0) {
            return;
        }
        for(int i=1; i<n; i++) {
            if(n%i==0) {
               sum+=i;
            }
        }
        if(sum==n) {
            System.out.print(n+" "+"is Perfect Number");
        } else {
         System.out.print(n+" "+"is not Perfect Number");   
        }
    }
    public static void main(String[] args) {
        perfect_num(6);
    }
}