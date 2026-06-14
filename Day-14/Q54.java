// Write a program to Frequency of an element

import java.util.*;
public class Q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
         int n = sc.nextInt();
         int arr[]=new int[n]; 
        int count=0;
         System.out.print("Enter key: ");
        int key = sc.nextInt();
         System.out.println("Enter elements of array : ");
        for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
            if(arr[i] == key) {
                count++;
            }
        }
        System.out.print("frequency of"+" " + key + " = " + count);
    }
}
