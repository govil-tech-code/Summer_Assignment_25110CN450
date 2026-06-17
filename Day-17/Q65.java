// Write a program to Merge arrays...

public class Q65 {
    public static void main(String[] args) {
        int arr1[]={2,5,8,1};
        int arr2[]={3,9,1,6};
        int i;
        int merged_arr[]=new int[arr1.length + arr2.length];
        for(i=0; i<arr1.length; i++) {
         merged_arr[i]=arr1[i];
        }
        for( i=0; i<arr2.length; i++) {
         merged_arr[arr1.length+i]=arr2[i];
        }
        System.out.print("Merged array : ");
        for(i=0; i<merged_arr.length; i++) {
        System.out.print(" "+merged_arr[i]+" ");
        }
    }
}