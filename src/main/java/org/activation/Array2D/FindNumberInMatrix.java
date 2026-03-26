package org.activation.Array2D;

public class FindNumberInMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int k = 5;

        if (findInMatrix(matrix, k) != -1) {
            int givenNum = findInMatrix(matrix, k);
            System.out.println(givenNum);
        } else {
            System.out.println("NOT FOUND!");
        }
    }

    private static int findInMatrix(int[][] matrix, int k) {
        for (int[] rows: matrix) {
            for (int num : rows){
                if (k == num) {
                    return num;
                }
//                System.out.print(num + " ");
            }
            System.out.println();
        }
        return -1;
    }
}
