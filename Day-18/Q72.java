// Write a program to Sort array in descending order...

public class Q72 {
    public static void descending_order(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int MaxPos=i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[MaxPos]<arr[j]) {
                  MaxPos=j;
                }
            }
            int temp=arr[MaxPos];
            arr[MaxPos]=arr[i];
            arr[i]=temp;
        }
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {2,4,3,7,5,9,8};
        descending_order(arr);
    }
}
