package org.activation.searching;


public class FindMaxByBinarySearch {

    public static void main(String[] args) {
//        int[] arr = {15, 6, 1, 2, 3, 4, 7};
//        int[] arr = {4, 2, 3};
        int[] arr =  {3, 1, 2};

        int maxElement = findMax(arr);
        System.out.print("Max Element in Array: "+ maxElement);

    }

    private static int findMax(int[] arr) {
        int low = 0 , high = arr.length - 1;

        while (low <= high){

            if (arr[low] <= arr[high]) {
                return arr[high];
            }

            int mid = low + (high - low) >>> 1;

            if (arr[mid] > arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[high];
    }
}
