package org.activation.Array2D;

import java.util.Arrays;
import java.util.Objects;

public class WordSearch {

    /**
     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"                            === fail
     Output: true

     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"                               === pass
     Output: true

     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"                              === pass
     Output: false
     */
    public static void main(String[] args) {
        String[][] matrix = {
                {"A","B","C","E"},
                {"S","F","C","S"},
                {"A","D","E","E"}
        };

        String word = "ABCCED";

        char[] charArr = word.toCharArray();
        for ( char ch : charArr) {
            System.out.print(ch+" ");
        }

        System.out.println();
        System.out.println("======================");

        boolean searchWord = wordSearch(matrix, charArr);
        System.out.println("Word is found: " + searchWord );
    }

    // this is not correct
    private static boolean wordSearch(String[][] matrix, char[] charArr) {
        int row = matrix.length;
        int col = matrix[0].length;

        boolean isFound = false;
        int count = 0;

        for (int k = 0; k < charArr.length; k++) {
            for (int i = 0 ; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (String.valueOf(charArr[k]).equals(matrix[i][j])){
                        System.out.print(matrix[i][j] + " == ");
                        System.out.println(charArr[k]);
                        count++;
                        k++;   // check next num
//                        j++; // in row next num
//                        i++; // it gos on nex row
//                        break;
                    }
                }
            }
            if (count == charArr.length)
              isFound = true;
        }
        return isFound;
    }
}
