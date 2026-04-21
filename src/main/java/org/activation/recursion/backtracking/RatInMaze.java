package org.activation.recursion.backtracking;

import java.util.ArrayList;

public class RatInMaze {
    /**
     Input: mat[][] = [[1, 0, 0, 0], [1, 1, 0, 1], [1, 1, 0, 0], [0, 1, 1, 1]]
     Output: ["DDRDRR", "DRDDRR"]
     Explanation: The possible paths are: DDRDRR, DRDDRR // we have to replace down -> D and right -> R

     Input: mat[][] = [[1, 1, 1], [1, 0, 1], [1, 1, 1]]
     Output: [DDRR, RRDD]
     */

    public static void main(String[] args) {

        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

//        int[][] mat = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        ArrayList<String> findingPath = findingPath(mat);

        for (String s : findingPath) {
            System.out.print(s + " ");
        }
        System.out.println("--------------"+ findingPath);

    }

    private static ArrayList<String> findingPath(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int index = 0;
        ArrayList<String> word = new ArrayList<>();

//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//               if (dfs(mat, i, j, index, word)) {
//                    dfs(mat, i, j, index, word);
//               }
//            }
//        }

        if (mat[0][0] == 0) return word;

        boolean[][] visited = new boolean[row][row];

        dfs(mat, 0, 0, "", word, visited);
        return word;
    }

    private static void dfs(int[][] mat, int i, int j,
                            String path,
                            ArrayList<String> result,
                            boolean[][] visited) {

        int n = mat.length;
        // base case
        if (i == n - 1 && j == n - 1) {
            result.add(path);
            return;
        }

        if ( i >= 0 && i < n && j >= 0 && j < n && mat[i][j] == 1 && !visited[i][j]) {
            visited[i][j] = true;

            // Move Down
            dfs(mat, i + 1, j, path + "D", result, visited);
            // Move Right
            dfs(mat, i, j + 1, path + "R", result, visited);
            // Move Up
            dfs(mat, i - 1, j, path + "U", result, visited);
            // Move Left
            dfs(mat, i, j - 1, path + "L", result, visited);

            // Backtrack
            visited[i][j] = false;

        }
    }

    // we can also add the getting path to it (run but we have to add the path to it and also we have to add the visited array to it)
    private static boolean dfs(int[][] mat, int i, int j, int index, ArrayList<String> word) {
//        String[] word = new String[0];
        // base case
        // check for the last element = i = 3 & j = 3 all element  we can do index++ every time
        if ( i == mat.length - 1 && j == mat[0].length - 1) {
            return false;
        }
        int temp = mat[i][j];
        mat[i][j] = 0; // mark as visited

        // when i updated = D and when j Updated R
        if(i + 1 < mat.length && mat[i + 1][j] == 1) {
            word.add("D");
        }

        if(mat[i - 1][j] == 1) {
            word.add("U");
        }

        if (j + 1 < mat[0].length && mat[i][j + 1] == 1) {
            word.add("R");
        }

        if (j - 1 < mat[0].length && mat[i][j - 1] == 1) {
            word.add("L");
        }

        // we can also add the getting path to it (run but we have to add the path to it and also we have to add the visited array to it)
        mat[i][j] = temp;

        return false;
    }

//                dfs(mat, i + 1, j, index + 1, word) ||  //  next row
//                dfs(mat, i, j + 1, index + 1, word) ||  // next column(element)
//                dfs(mat, i - 1, j, index + 1, word) ||  // previous row
//                dfs(mat, i, j - 1, index + 1, word);    // previous column(element)
}
