public class Q11 {
  public static void gcd(int a, int b) {
 int gcd=1;
 for(int i=1; i<=Math.min(a,b); i++) {
  if(a%i==0 && b%i==0) {
    gcd=i;
  }
 }
System.out.println(gcd);
  }
  public static void main(String[] args) {
    gcd(35,13);
  }
}