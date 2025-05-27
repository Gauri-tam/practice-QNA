package org.activation.recursion;

public class FindMaxInArray {
    public static void main(String[] args){
        int[] array = {1, 2, 9, 4, 5}; // Example array
        System.out.println("Maximum element in the array is: " + findMax(array, array.length - 1));
    }

    private static String findMax(int[] array, int i) {
        if (i == 0){
            return String.valueOf(array[0]); // Base case: if index is 0, return the first element
        }
        return String.valueOf(Math.max(array[i], Integer.parseInt(findMax(array, i - 1)))); // Recursive case
    }
}
