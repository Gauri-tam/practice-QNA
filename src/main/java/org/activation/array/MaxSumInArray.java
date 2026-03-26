package org.activation.array;

public class MaxSumInArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 7, 9, 10, 4};

        int largeSum = findLargeSumPair(arr);
        System.out.println(largeSum);
    }

    private static int findLargeSumPair(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+ 1; j < n; j++) {
                if (res < arr[i] + arr[j]) {
                    res = arr[i] + arr[j];
                }
            }
        }
        return res;
    }
}
