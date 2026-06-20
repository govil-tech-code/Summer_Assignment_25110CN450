// Write a program to Find column-wise sum

public class Q80 {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int j = 0; j < a[0].length; j++) {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i][j];
            }
        System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}
