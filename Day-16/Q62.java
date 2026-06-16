// Write a program to Find maximum frequency element.

public class Q62 {
 public static void frequency(int arr[]) {
    int n=arr.length;
    int maxfrequency=0;
    int maxelement=arr[0];
    for(int i=0; i<n-1; i++) {
     int count=1;
     for(int j=i+1; j<n; j++) {
        if(arr[i]==arr[j]) {
            count++;
        }
     }
     if(count>maxfrequency) {
        maxfrequency=count;
        maxelement=arr[i];
     }
    }
    System.out.println("Max frequency : " +maxfrequency);
      System.out.println("Max element : " +maxelement);
 }
 public static void main(String[] args) {
    int arr[]={1,3,1,4,1,6,1,7};
    frequency(arr);
 }
}
