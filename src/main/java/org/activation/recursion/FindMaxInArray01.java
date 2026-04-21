package org.activation.recursion;

public class FindMaxInArray01 {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 9, 3};

        int max = findMax(arr);
//        int max = findMax(arr, 0);
        System.out.println("Maximum element in the array: " + max);
    }

    private static int findMax(int[] arr) {

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int findMax(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }

        // finding max in the rest of the array and comparing it with the current element
        return findMax(arr, i + 1) > arr[i] ? findMax(arr, i + 1) : arr[i];
    }
}
