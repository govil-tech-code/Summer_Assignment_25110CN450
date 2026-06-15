// Write a program to Rotate array right....


public class Q59 {
    public static void rotate(int arr[]) {
        int last=arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) {
         arr[i]=arr[i-1];
     }    
      arr[0]=last;
        System.out.print(" array Right");
     for(int i=0; i<arr.length; i++) {
       System.out.print(" "+arr[i]+" ");
       }
   }
   public static void main(String[] args) {
       int arr[]={1,3,5,2,7,9,7};
       rotate(arr);
   }
}
