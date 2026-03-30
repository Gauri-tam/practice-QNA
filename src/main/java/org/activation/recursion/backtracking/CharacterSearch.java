package org.activation.recursion.backtracking;

public class CharacterSearch {

    /**
     char[][] board = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};  String word = "ABE";                                 // pass ✅
     output = true

     char[][] board = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};  String word = "ABF";
     output = false                                                                                                      // pass ✅

     char[][] board = {{'A','A'}};  String word = "AAA";
     output = false                                                                                                      // pass ✅
     */


    public static void main(String[] args) {

        char[][] board = {
                {'A'}
        };
        String word = "A";

//        char[][] board = {{'A','B','C'},{'D','E','F'},{'G','H','I'}};  String word = "ABF";

        if (exist(board, word)) {
            System.out.println(" ✅ Fond!");
        } else {
            System.out.println(" ❌ Not Found!");
        }

    }

    private static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        int index = 0;

        // com
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, word, i, j, index)) {
                   return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {

        // base case (returning the last)
        if (word.length() == index) {
            return true;
        }

        //
        if ( i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';
//        // we have to replace this element

        boolean found =
                dfs(board, word,i + 1, j, index + 1 ) ||
                dfs(board, word,i - 1, j, index + 1 ) ||
                dfs(board, word,i, j + 1, index + 1 ) ||
                dfs(board, word,i, j - 1, index + 1 );

        board[i][j] = temp;

        return found;
    }
}
