// Write a program to Selection sort.

public class Q70 {
    public static void selectionsort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int Min_Pos=i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[Min_Pos]>arr[j]) {
                    Min_Pos=j;
                }
            }
            int temp=arr[Min_Pos];
            arr[Min_Pos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,8,1,4,6};
        selectionsort(arr);
        printArr(arr);
    }
}