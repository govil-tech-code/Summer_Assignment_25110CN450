// Write a program to Find pair with given sum.

public class Q63 {
    public static void pairs_with_sum(int arr[], int target) {
        int sum,i,j;
        int n = arr.length;
        for( i=0; i < n; i++) {
            for(j=i+1; j<n; j++) {
               sum=arr[i]+arr[j];
                if(sum==target) {
                System.out.print("("+arr[i]+","+arr[j]+")");
             }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,7,5,9,1,8};
        int target=10;
        pairs_with_sum(arr,target);
    }
}