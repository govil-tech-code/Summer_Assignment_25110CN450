import java.util.Scanner;
public class Q4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    long n = sc.nextLong();
    long digit=0;
    while(n>0) {
     digit++;
     n=n/10;
     sc.close();
    }
    System.out.println("Digit of number =" +digit);
}
}
