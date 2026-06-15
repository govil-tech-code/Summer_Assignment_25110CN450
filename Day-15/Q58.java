// Write a program to rotate array left.....

public class Q58 {
    public static void rotate(int arr[]) {
        int first=arr[0];
        for(int i=0; i<arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
         arr[arr.length-1]=first;
         System.out.print("Left array : ");
       for(int i=0; i<arr.length; i++) {
       System.out.print(" "+arr[i]+" ");
       }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,5,9};
        rotate(arr);
    }
} 