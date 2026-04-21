package org.activation.array2D;

public class Simple2DArray {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] rows : matrix){
            for(int num : rows){
                System.out.print(num+ " ");
            }
            System.out.println();
        }
    }

    // try new things
}
