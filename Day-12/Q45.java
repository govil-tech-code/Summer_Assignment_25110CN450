// Write a program to Write function for palindrome.

public class Q45 {
    public static void palindrome(int n) {
        int rev=0;
        int a=n;
        while(a>0) {
          rev=rev*10+a%10;
          a=a / 10; 
        }
        if(rev==n) {
            System.out.print(n+" "+"is palindrome");
        } else {
            System.out.print(n+" "+"is not palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(242);
    }
}