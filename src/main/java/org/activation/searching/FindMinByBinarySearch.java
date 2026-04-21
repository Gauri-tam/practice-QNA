package org.activation.searching;

public class FindMinByBinarySearch {

    public static void main(String[] args){
//        int[] arr =  {5, 6, 1, 2, 3, 4};
//        int[] arr =  {4, 2, 3};
        int[] arr =  {3, 1, 2};

        int smallestOne = finMin(arr);
        System.out.println("Min Element in This Array is " + smallestOne);
    }

    public static int finMin(int[] arr){
        int low = 0, high = arr.length - 1;

        while (low < high){

            if (arr[low] < arr[high]) {
                return arr[low];
            }
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return arr[low];
    }
}
