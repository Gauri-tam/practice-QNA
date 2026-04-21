package org.activation.array;

public class ReverseSubarrayBetweenIndexes {

    /**
     * Reverse subarray between indexes
     * Input:
     * arr = [1,2,3,4,5,6]
     * l = 2
     * r = 4
     *
     * Output:
     * [1,2,5,4,3,6]
     * */

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
           //        0 1 2 3 4 5
        int l = 2;
        int r = 4;

        swapElement(arr, l, r);

        for (int num : arr)
            System.out.print(num + " ");
    }

    private static void swapElement(int[] arr, int l, int r) {

        int n = arr.length;
        if (l >= 0 && r <= n-1) {
            // swap element
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }
    }
}
