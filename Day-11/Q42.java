// Write a program to Write function to find maximum.

public class Q42 {
    public static int maximum(int a, int b) {
        int max = a>b?a:b;
        return max;
    }
    public static void main(String[] args) {
        System.out.print("maximum number : " +maximum(40,20));
    }
}