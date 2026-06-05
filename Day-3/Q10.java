public class Q10 {
  public static void primeinrange(int n) {
    for(int i=2; i<n; i++) {
      boolean isprime=true;
    for(int j=2; j<i; j++) {
      if(i%j==0) {
        isprime=false;
        break;
      }
    }
 if(isprime) {
  System.out.println(" " +i);
 }
    }
   }
   public static void main(String[] args) {
    primeinrange(100);
  }
}
