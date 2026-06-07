// Write a program to Recursive reverse number

public class Q28 {
     static int rev=0;
    public static int reverse(int n) {
       
  if(n==0) {
    return rev;
  } 
  rev=rev*10+n%10;
    return reverse(n/10);
  
    }
 
public static void main(String[] args) {
int n=143;

System.out.print("reverse of n :" +reverse(n));

}

}
