// Write a program to Reverse array. 
import java.util.*;
public class Q57 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter numbers of element : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
          System.out.print("Enter elements : ");
         for(int i=0; i<arr.length; i++) {
            arr[i]=sc.nextInt();
         }
         int start=0;
         int end=arr.length-1;
            while(start<end) {
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--; 
        }
        System.out.print("Reverse array is : " );
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}