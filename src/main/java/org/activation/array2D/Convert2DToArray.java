package org.activation.array2D;

public class Convert2DToArray {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2 , 3,  4},
                {5, 6,  7,  8,},
                {9, 10, 11, 12},
        };

        convert2DToArray(matrix);
        System.out.println();

//        // print the matrix
//        for (int[] row: matrix) {
//            for (int num: row) {
//                System.out.print(num + " ");
//            }
//        }

    }

    private static void convert2DToArray(int[][] matrix) {
        int rows = matrix.length;
        int cols =matrix[0].length;

        int[] temp = new int[rows * cols];
        int index = 0;

//        System.out.println(rows * cols); // 12

        for (int i = 0; i < rows; i++) {           // always start from 0
            for (int j = 0 ; j < cols ; j++) {     // always start from 0
                temp[index] = matrix[i][j];
                index++;
            }
        }

        // printer simple array...
        for (int num: temp)
            System.out.print(num + " ");
    }
}
