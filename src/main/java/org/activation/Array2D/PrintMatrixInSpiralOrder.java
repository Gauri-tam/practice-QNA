package org.activation.Array2D;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrixInSpiralOrder {

    public static void main(String[] args) {
        // Please recheck it i have Doubts about it.
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 1 -> 2 -> 3
        //           |
        // 8 -> 9 -> 4
        // |         |
        // 7 -> 6 -> 5

        List<Integer> spiral = spiralOrder(matrix);

        for (int val : spiral) {
            System.out.print(val + " ");  //  1 2 3 6 9 8 7 4 5  output.
        }
        System.out.println();
    }

    private static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix.length - 1;

        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++)
                result.add(matrix[top][i]);
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);
                left++;
            }
        }

        return result;
    }
}
