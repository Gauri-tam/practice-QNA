package org.activation;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args){

        int[] array = {4, 5, 3, 7, 9};
        int[] reversed  = new int[array.length];

        // First for loop: copy elements in reverse order
        for (int i = 0; i < array.length; i++){
            // 0 = array[0-1-0] = 1 next element
            reversed[i] = array[array.length - 1 - i]; //  switch the element
        }

        // Second for loop: print reversed array
        for(int i = 0; i < reversed.length; i++){
            System.out.print(reversed[i] + " ");  // 9 7 3 5 4
        }


        // other Wya to solve this if the Array is sorted
//        int[] arr = {1, 2, 3, 4, 5};
//
//        int start = 0, end = arr.length - 1;
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//        System.out.println(Arrays.toString(arr));
    }
}
