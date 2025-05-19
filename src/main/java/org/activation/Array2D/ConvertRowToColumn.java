package org.activation.Array2D;

public class ConvertRowToColumn {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        convertRowToColumn(matrix);

       for(int[] row :  matrix){  // matrix index 0 -> array , 1, 2
           for(int val : row){ // 0 th array index 0, 1, 3
               System.out.print(val + " ");
           }
           System.out.println();
       }
    }

    private static void convertRowToColumn(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
