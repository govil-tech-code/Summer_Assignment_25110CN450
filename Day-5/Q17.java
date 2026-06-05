// Write a program to Check perfect number. 

public class Q17 {
    public static void perfectnum(int n) {
       int sum=0;
       for (int i=1; i<=n/2; i++) {
        if(n%i==0) {
            sum=sum+i;
        }
       }
       if(sum==n) {
        System.out.print(n+ " is a perfect number");
       } else {
        System.out.print(n+ " is not a perfect number");
       }
    }
 public static void main(String[] args) {
    perfectnum(28);
 }
}