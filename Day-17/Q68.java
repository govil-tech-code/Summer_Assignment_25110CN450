// Write a program to Find common elements. 

public class Q68 {
    public static void main(String[] args) {
        int arr1[]= {1,4,4,3,8};
        int arr2[]= {2,4,3,4,9};
        int k=0;
        int arr[]=new int[arr1.length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0; j<arr2.length; j++) {
       if(arr1[i]==arr2[j]) {
            arr[k]=arr1[i];
              k++;
           break;
          }
            }
        }
     for(int i=0; i<k; i++) {
        System.out.print(" "+arr[i]+" ");
        }
    }
}
