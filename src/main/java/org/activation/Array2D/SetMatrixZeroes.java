package org.activation.Array2D;

public class SetMatrixZeroes {
    public static void main(String[] arg) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        // output:
        //        1 0 3
        //        0 0 0
        //        7 0 9

        setZeroes(matrix);

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] firstRowZero = new boolean[rows];
        boolean[] firstColZero = new boolean[cols];

        // Mark the first row and the first Column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    firstRowZero[i] = true;
                    firstColZero[j] = true;
                }
            }
        }

        // Set the Zeroes
        for (int i = 0; i < rows; i++) {
           for(int j = 0; j < cols; j++){
               if (firstRowZero[i] || firstColZero[j]){
                   matrix[i][j] = 0;  // set the row and column to zero
               }
           }
        }
    }
}
