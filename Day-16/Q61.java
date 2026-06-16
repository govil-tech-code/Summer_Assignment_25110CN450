// Write a program to Find missing number in array

public class Q61 {
    public static void missing_number(int arr[]) {
        int totalsum=(arr.length*(arr.length+1))/2;
        int actualsum=0;
        for(int i=0; i<arr.length-1; i++) {
            actualsum=actualsum + arr[i];
        }
        int missing_number=totalsum-actualsum;
        System.out.print("Missing number : " +missing_number);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        missing_number(arr);
    }
}