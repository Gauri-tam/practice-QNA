package org.activation.Array2D;

public class RowsToColumns34 {

    public static void main(String[] args) {

        // r= 3 c= 4 we have to convert r= 4 c= 3
        int[][] matrix = {
                {1, 2 , 3,  4},
                {5, 6,  7,  8,},
                {9, 10, 11, 12},
        };

        int[][] convertedMatrix = convertRowToColumns(matrix);
        System.out.println("::::::::::NEW MATRIX:::::::::::");

        for (int[] row: convertedMatrix) {
            for (int num: row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // convert matrix into array
    // do your work (What ever it is!)
    // convert array to matrix

    private static int[][] convertRowToColumns(int[][] matrix) {
        System.out.println();
        int[] array = convertMatrixToArray(matrix);

        int[][] tempMatrix = new int[4][3]; // it is the r=4 c=3
        int cols = 3;

        for (int i = 0; i < array.length; i++) {
            tempMatrix[i / cols][i % cols] = array[i];
//            System.out.println(cols);
//            System.out.println((i / cols)+ " " +(i % cols));
        }
        return tempMatrix;

    }

    private static int[] convertMatrixToArray(int[][] matrix) {
        int rows = matrix.length;
        int cols =matrix[0].length;

        int[] temp = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0 ; j < cols ; j++) {
                temp[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("""
                ::::::::::ARRAY:::::::::::""");

        for (int num: temp)
            System.out.print(num + " ");

        System.out.println();
        return temp;
    }
}
