package org.activation.array2D;

public class DiagonalTraversalMatrix {

    /**
     Input: mat[][] = [
         [ 1,  2,  3,  4],
         [ 5,  6,  7,  8],
         [ 9, 10, 11, 12],
         [13, 14, 15, 16],
         [17, 18, 19, 20]
     ]
     Output: 1 5 2 9 6 3 13 10 7 4 17 14 11 8 18 15 12 19 16 20

     */

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4},
                { 5,  6,  7,  8},
                { 9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20}
        };

        diagonalTraversal(matrix);
    }

    private static void diagonalTraversal(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

            }
        }
    }
}
