public class Q5 {
  public static void sum(int n) {
int sum=0;
while(n>0) {
sum+=n%10;
n=n/10;
}
System.out.println(sum);
  }
  public static void main(String[] args) {
    sum(123);
  }
}