// Write a program to Move zeroes to end.

public class Q60 {
   public static void zeros_to_end(int arr[]) {
    int index=0;
    for(int i=0; i<arr.length; i++) {
        if(arr[i]!=0) {
        arr[index]=arr[i];
        index++;
       }
        }   
     while(index<arr.length) {
     arr[index]=0;
        index++;
     }
    System.out.print("Position os zeroes : ");
    for(int i=0; i<arr.length; i++) {
  System.out.print(" "+arr[i]+" ");
      }
       } 
   public static void main(String[] args) {
    int arr[]={2,0,4,0,0,6,0,1,9};
    zeros_to_end(arr);
   }
}
