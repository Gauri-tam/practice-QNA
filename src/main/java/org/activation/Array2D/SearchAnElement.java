package org.activation.Array2D;

public class SearchAnElement {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},  // 0 = index
                {4, 5, 6},  // 1
                {7, 8, 9}   // 2 = i {0 = j, 1, 2}
        };
        int target = 8;  // 2, 1
        boolean found = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length;j++){
                if(matrix[i][j] == target){
                    System.out.println("Element found at the index: " + i +" " + j);
                    found = true;
                    break; // exit the loop
                }
            }
        }
    }
}
