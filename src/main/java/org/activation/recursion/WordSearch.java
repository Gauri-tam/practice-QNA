package org.activation.recursion;

public class WordSearch {

    /**
     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"                            === pass
     Output: true

     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"                               === pass
     Output: true

     Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"                              === pass
     Output: false
     */
    public static void main(String[] args) {
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "ABCB";

        System.out.println("Word found: " + exist(board, word));
    }

    private static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // this is the best way to solve the word solve problem
    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
        // Base case
        if (index == word.length()) {
            return true;
        }

        // Boundary + mismatch check
        if (i < 0 ||
                i >= board.length ||
                j < 0||
                j >= board[0].length ||
                board[i][j] != word.charAt(index)
        ) {
            return false;
        }

        // Mark visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Recursive case
        boolean found =
                dfs(board, word, i + 1, j, index + 1) ||  // forward row
                dfs(board, word, i - 1, j, index + 1) ||  // pre row
                dfs(board, word, i, j + 1, index + 1) ||  // forward element
                dfs(board, word, i, j - 1, index + 1);     // pre element

        // Backtrack
        board[i][j] = temp;

        // returning the
        return found;
    }
}
