// Write a program to find row-wise sum of a matrix.

public class Q79 {
    public static void main(String[] args) {

        int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < a[0].length; j++) {
                sum += a[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}