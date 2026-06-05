public class Q12 {
  public static void lcm(int a, int b) {
  int max=Math.max(a,b);
  while(true) {
    if(max%a==0 && max%b==0) {
      System.out.println(max);
      break;
    }
    max++;
  }
  }
  public static void main(String[] args) {
    lcm(36,60);
  }
}
