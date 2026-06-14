// Write a program to Find duplicates in array.

public class Q56 {
    public static void duplicate_key(int arr[], int key) {
    int count=0;
    for(int i=0; i<arr.length; i++) {
        if(key==arr[i]) {
            count++;
        }
    }
    int duplicate=count-1;
    if(count == 0) {
    System.out.println("Key not found");
} else {
    System.out.print("Dupliacte of"+" "+ key +" = "+duplicate);
    }
}
    public static void main(String[] args) {
        int arr[]={2,5,3,4,3,5,3,6,3};
        int key=3;
       duplicate_key(arr,key);
    }
}
