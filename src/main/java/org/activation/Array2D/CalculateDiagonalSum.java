package org.activation.Array2D;

public class CalculateDiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        diagonalSum(matrix);
    }

    private static void diagonalSum(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int sum = 0;

        for (int i = 0; i < row ; i++) {
            for (int  j = 0; j < col; j++) {
                if (i == j) {
                   sum+= matrix[i][j];
                }
            }
        }
        System.out.println("Sum of the Diagonal is: " + sum );
    }
}
