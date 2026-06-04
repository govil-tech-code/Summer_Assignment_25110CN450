// Write a program to Generate Fibonacci series. 

public class Q13 {
  public static void fibonacci(int n) {
    int a=0,temp;
    int b=1;
    if(n==1) {
        System.out.print(a);
    } else if(n==2) {
        System.out.print(a+" "+b);
    }
    System.out.print(a+" "+b+" ");
  for(int i=1; i<n-1; i++) {
     temp=a+b;
     a=b;
     b=temp;
      System.out.print(temp+" ");
   
    }  
  }
  public static void main(String[] args) {
    fibonacci(6);
  }
}
