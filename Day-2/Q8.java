public class Q8 {
  public static void palindrome(int n) {
    int temp=n;
    int rev=0;
    while(n>0) {
      rev=rev*10+n%10;
      n=n/10;
    }
    if(temp==rev) {
      System.out.println("palindrome No.");
    }
    else {
      System.out.println("not palindrome No.");
    }
  }
  public static void main(String[] args) {
    palindrome(2332);
  }
}
