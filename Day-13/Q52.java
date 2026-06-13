// Write a program to count even and odd elements.
import java.util.*;
public class Q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number of elements : ");
        int n =sc.nextInt();
        int i;
        int arr[]=new int[n];
        if(n==0) {
            System.out.println("Not valid");
            return;
        }
        int evencount=0;
        int oddcount=0;
        System.out.println("Enter array elements : ");
        for(i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
             if(arr[i]%2==0) {
            evencount++;
           } else {
             oddcount++;
           }
        }
        System.out.println("Even elements count : " + evencount);
        System.out.println("Odd elements count : " + oddcount);
    }
}
