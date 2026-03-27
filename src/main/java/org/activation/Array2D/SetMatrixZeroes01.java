package org.activation.Array2D;

public class SetMatrixZeroes01 {

    /**
     Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
     Output: [[1,0,1],[0,0,0],[1,0,1]]
    */

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        findZero(matrix);

        for (int[] rows : matrix) {
            for (int num : rows) {
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    private static int findZero(int[][] matrix) {
        int row  = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i< row; i++) {
            for (int j = 0; j < col; j++) {
                if (i + j == 1 || i + j == 3) {
                    matrix[i][j] = 0;
                }
            }
        }

        return -1 ;
    }
}
