//Write a program to Intersection of arrays...

public class Q67 {
    public static void main(String[] args) {
        int arr1[]= {3,4,3,8};
        int arr2[]= {2,4,3,3,9};
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
        int n=k;
        for(int i=0; i<n; i++) {
            for(int j= i+1; j<n; j++) {
        if(arr[i]==arr[j]) {
        for( int m=j; m<n-1; m++) {
                arr[m]=arr[m+1];
                    }
                n--;
                j--;
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(" "+arr[i]+" ");
        }
    }
}
