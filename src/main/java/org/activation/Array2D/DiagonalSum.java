package org.activation.Array2D;

public class DiagonalSum {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3},  // 0, 1, 2
                {4, 5, 6},  // 0, 1, 2
                {7, 8, 9}   // 0, 1, 2
        };
        int sum = calcculatedigonalSum(matrix);
        System.out.println("Diagonal sum is : " + sum);  // 25

    }

    private static int calcculatedigonalSum(int[][] matrix) {

//        1 + 5 + 9 = 15 (main diagonal)
//        3 + 5 + 7 = 15 (secondary diagonal)
//        15 (main) + 15 (secondary) = 30
//        But the center element (5) is counted twice (once in each diagonal),
//        so subtract it once: 30 - 5 = 25

        int n = matrix.length;
        int sum = 0;

        for (int i=0; i< n; i ++){
            sum += matrix[i][i]; // main diagonal
            sum += matrix[i][n - 1 - i]; // secondary diagonalum
        }

        // If odd dimension, subtract the middle element (added twice)
        if (n % 2 == 1)
            sum -= matrix[n / 2][n / 2];

        return sum;
    }
}
