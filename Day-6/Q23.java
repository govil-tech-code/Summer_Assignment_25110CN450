// Write a program to Count set bits in a number. 

public class Q23 {
    public static int count_setbits(int n) {
int count=0;
while(n>0) {
    if(n%2==1) {
     count++;
    }
    n/=2;
}
return count;
    }
public static void main(String[] args) {
    System.out.println(count_setbits(29));
}
}
