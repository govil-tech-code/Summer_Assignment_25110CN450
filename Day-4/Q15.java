// Write a program to Check Armstrong number....

public class Q15 {
public static void armstrong(int n) {

    int temp=n;
    int n1=n;
    int digit=0;
    int sum=0;
    while(temp>0) {
        digit++;
        temp=temp/10;
    }
    while(n1>0) {
        int rem=n1%10;
      sum=sum+(int)Math.pow(rem,digit);
       n1=n1/10;
    }
    if(sum==n) {
        System.out.print(n+ " " + "is an armstrong number");
    } else {
        System.out.print(n+ " " + "is not armstrong number");
}
}
   public static void main(String[] args) {
    armstrong(153);
   }
}
    
