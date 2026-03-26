package org.activation.array;

import java.util.Arrays;

public class ThirdLargeElementInArray {

    /**
     * Input: arr[] = {1, 14, 2, 16, 10, 20}
     * Output: 14
     * Explanation: Largest element is 20, second largest element is 16 and third largest element is 14
     *
     * Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
     * Output: 16
     * Explanation: Largest element is 20, second largest element is 19 and third largest element is 16
     * */

    public static void main(String[] args) {
        int[] arr = {1, 14, 2, 16, 10, 20};
        int max = arr[arr.length - 3];

        // sort array ASC
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

//        Arrays.sort(arr);

        int element = findLargeElement(arr);
        System.out.print("Third Large Element is: " + element);

    }

    private static int findLargeElement(int[] arr) {
        System.out.println("Sorted Array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // third 0 1 2 3 4 5 = 2
        System.out.println(arr[arr.length - 3]);
        return arr[3];
    }

}
