// Write a program to input and display array.

import java.util.*;
public class Q49 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int num[]=new int[n];
        System.out.print("Enter array elements : ");
       for(int i=0; i<n; i++) {
        num[i]=sc.nextInt();
       }
        System.out.print("Array is : " );
       for(int i=0; i<n; i++) {
        System.out.print(num[i]+" ");
       }
        sc.close();
    }
}