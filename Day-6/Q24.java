//Write a program to Find x^n without pow().

public class Q24 {
public static void x_pow_n(int x,int n) {
    double c=1;
    if(n>=0) {
    for(int i=1; i<=n; i++) {
      c=c*x;
    }
} else {
    for(int i=1; i<=-n; i++) {
        c=c*x;
    }
    c=1/c;
}
     System.out.println(c);
}
    public static void main(String[] args) {
        x_pow_n(3,-4);

    }
}
