// Write a program to Remove duplicates from array....

public class Q64 {
public static void remove_duplicate(int arr[]) {
    int n=arr.length;
    for(int i=0; i<n; i++) {
       for(int j=i+1; j<n; j++) {
        if(arr[i]==arr[j]) {
            for(int k=j; k<n-1; k++) {
                arr[k]=arr[k+1];
            }
            n--; // reduce size
            j--; // check again same position
        }
       }
    }
    for(int i=0; i<n; i++) {
        System.out.print(+arr[i]+" ");
    }
}    
public static void main(String[] args) {
    int arr[]={1,2,4,2,5,6};
    remove_duplicate(arr);
}
}
