// Write a program to Check strong number. 
import java.util.Scanner;
public class Q18 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int n =sc.nextInt();
int n1=n;
int sum=0;
while(n>0) {
    int rem=n%10;
    int fact=1;
    for(int i=1; i<=rem; i++) {
        fact=fact*i;
    }
    sum=sum+fact;
    n=n/10;
}
if(sum==n1) {
    System.out.println(n1 + " is a strong number");
} else {
    System.out.println(n1 + "is not a strong number");
}
}
}
