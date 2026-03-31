package org.activation.array2D;

public class ArrayToMatrix {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        convertArrToMatrix(arr);
    }

    private static void convertArrToMatrix(int[] arr) {
        int n = arr.length;
        int rows = 3;
        int cols = 4;  // we only need this to identify the columns.
        int[][] matrix = new int[rows][cols];

            for (int i = 0; i < n; i++) {
                matrix[i / cols ][i % cols] = arr[i];

//                 i / cols == row = 0 0 0 1 1 1 2 2 2 | i % cols == cols = 0 1 2 0 1 2 0 1 2
//                System.out.print( i % cols  + " ");
            }

        for (int[] ro: matrix){
            for (int num: ro) {
                System.out.print(num +  " ");
            }
        }
    }
}
