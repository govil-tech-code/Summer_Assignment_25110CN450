// Write a program to union of arrays...

public class Q66 {
    public static void main(String[] args) {
        int arr1[]={2,5,8,1};
        int arr2[]={3,2,1,6};
        int i;
        int merged_arr[]=new int[arr1.length + arr2.length];
        for(i=0; i<arr1.length; i++) {
         merged_arr[i]=arr1[i];
        }
        for( i=0; i<arr2.length; i++) {
         merged_arr[arr1.length+i]=arr2[i];
        }
      int n=merged_arr.length;
        for(i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(merged_arr[i]==merged_arr[j]) {
                    for(int k=j; k<n-1; k++) {
                        merged_arr[k]=merged_arr[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(i=0; i<n; i++) {
        System.out.print(" "+merged_arr[i]+" ");
        }
    }
}