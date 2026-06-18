// Write a program to Binary search.

public class Q71 {
    public static void binary_search(int arr[], int key) {
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=(start+end)/2;
           if(arr[mid]==key) {
            System.out.print(mid);
            return;
           }
           if(arr[mid]<key) {
            start=mid+1;
           } else {
            end=mid-1;
           }
        }
        System.out.print("-1");
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,6,7,9};
        int key=7;
        binary_search(arr,key);
    }
}

