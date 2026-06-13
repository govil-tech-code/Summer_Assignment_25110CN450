// Write a program to find sum and average of Array...
import java.util.*;
public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.print("Enter arrays detail : ");
           for (int i = 0; i < n; i++) {
              arr[i]=sc.nextInt();
           }
        for(int i=0; i<arr.length; i++) {
            sum=sum+arr[i];
        }
         System.out.println("Sum of elements : " +sum);
        int average=sum/n;

       System.out.println("average of the array elements : " +(double)average);

    }
}
