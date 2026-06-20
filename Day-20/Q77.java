// Write a program to Multiply matrices....

public class Q77 {
    public static void main(String[] args) {
    int a[][] = {
        {1, 2},
       {3, 4}
        };
        int b[][] = {
          {5, 6},
        {7, 8}
        };
  int c[][] = new int[a.length][b[0].length];
 for (int i = 0; i < a.length; i++) {
  for (int j = 0; j < b[0].length; j++) {
  for (int k = 0; k < b.length; k++) {
 c[i][j] += a[i][k] * b[k][j];
         }
            }
        }
     System.out.println("Resultant Matrix:");
    for (int i = 0; i < c.length; i++) {
     for (int j = 0; j < c[0].length; j++) {
  System.out.print(c[i][j] + " ");
     }
    System.out.println();
      }
    }
}