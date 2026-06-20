// Write a program to Check symmetric matrix.....

public class Q78 {
    public static void main(String[] args) {  
        int[][] a = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };
        boolean symmetric = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] != a[j][i]) {
                    symmetric = false;
                    break;
                }
            }
        }
        if (symmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is Not Symmetric");
        }
    }
}