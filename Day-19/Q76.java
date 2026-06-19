// Write a program to Find diagonal sum.

public class Q76 {
   public static void main(String[] args) {
    int a[][]={
        {1,2,3},
        {2,7,5},
        {4,9,1}
   };
   int diagonal_sum1=0;
   int diagonal_sum2=0;
   for(int i=0; i<a.length; i++) {
        diagonal_sum1=diagonal_sum1+a[i][i];   
         diagonal_sum2=diagonal_sum2+a[i][a.length-i-1];   
   }
    
     System.out.print(diagonal_sum1+" ");
      System.out.print(diagonal_sum2+" ");
   }
}

