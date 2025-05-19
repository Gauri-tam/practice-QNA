package org.activation.Array2D;



public class RotateMatrix {

    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        rotate(matrix);

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {

        int n = matrix.length; // 0, 1, 2, 3 = i

        // transpose the matrix // convert row to column
        for (int i = 0; i < n ; i ++) {
            for (int j = i; j < n; j++){
                int temp = matrix[i][j]; // 1, 2, 3
                matrix[i][j] = matrix[j][i]; // 1, 4, 7
                matrix[j][i] = temp; // 1, 2, 3
            }
        }

        // reverse the rows
        for(int i = 0; i< n; i++) {
            for (int j = i; j < n / 2; j++){
                int temp = matrix[i][j]; // 1, 2, 3
                matrix[i][j] = matrix[i][n - j - 1]; // 1, 4, 7
                matrix[i][n - j - 1] = temp; // 1, 2, 3
            }
        }

    }
}
