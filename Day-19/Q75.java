// Write a program to Transpose matrix. 

public class Q75 {
   public static void main(String[] args) {
    int a[][]={
        {1,2,3},
        {2,7,5}
   };
   int transpose[][]=new int [3][2];
   for(int i=0; i<a.length; i++) {
    for(int j=0; j<a[0].length; j++) {
        transpose[j][i]=a[i][j];
    }
   }
    for(int i=0; i<transpose.length; i++) {
    for(int j=0; j<transpose[0].length; j++) {
   System.out.print(transpose[i][j]+" ");
    }
    System.out.println();
}
   } 
}
