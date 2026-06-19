// Write a program to Subtract matrices...

public class Q74 {
    public static void main(String[] args) {
     int a[][] = {
        {4,8, 3},
        {1, 5, 6}
        };

     int b[][] = {
        {9, 1, 3},
        {5, 16, 12}
        };
        int subtraction[][] = new int[2][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
              subtraction[i][j] = a[i][j] - b[i][j];
            }
        }
      System.out.println("Sum Matrix:");
       for (int i = 0; i < subtraction.length; i++) {
        for (int j = 0; j < subtraction[0].length; j++) {
        System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }
    }
}