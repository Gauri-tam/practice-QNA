package org.activation.recursion;

public class SumOfArrayElements {
    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5}; // Example array

        int sum = sumOfArray(array, array.length - 1);
        System.out.println("Sum of array elements is: " + sum);
//        System.out.println("Sum of array elements is: " + sumOfArray(array, array.length - 1));
    }

//    private static String sumOfArray(int[] array, int i) {
//        if (i < 0){
//            return "0"; // Base case: if index is less than 0, return 0
//        }
//
//        // Integer.parseInt in convert the string to the integer
//        return String.valueOf(array[i] + Integer.parseInt(sumOfArray(array, i - 1))); // Recursive case
//    }

    private static int sumOfArray(int[] array, int i) {
        // base case
        if (i == 0) {
            return 1; // Base case: if index is 0, return the first element of the array
        }

        return array[i] + sumOfArray(array, i - 1);
    }
}
