package org.activation;

import java.util.Arrays;

public class RootedArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // output = {5, 1, 2, 3, 4};
        int last = array[array.length - 1];  // getting the last Element 5

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
            System.out.println(array[i] + " ");   // getting first element except last one
        }
        array[0] = last;  // add the last Element with on the first position

//        for (int i = arr.length - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = last;

        System.out.println(Arrays.toString(array));
    }
}
