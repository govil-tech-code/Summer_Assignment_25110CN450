//Write a program to Print character triangle.
// A
// AB
// ABC
// ABCD
// ABCDE

public class Q31 {
    public static void main(String[] args) {
    for(int i=1; i<=5; i++) {
         char ch ='A';
        for(int j=1; j<=i; j++) {
            System.out.print(ch);
             ch++;
        }
        System.out.println();
    }

    }
}
