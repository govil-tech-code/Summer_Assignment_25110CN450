import java.util.Scanner;
public class Q3 {
  public static void main(String[] args) {
 Scanner sc = new Scanner (System.in);
 long n = sc.nextLong();
 long i=1,f=1;
 while(i<=n) {
  f=f*i;
  i++;
   sc.close();
 }
 System.out.println("factorial of number=" +f);
}
}
