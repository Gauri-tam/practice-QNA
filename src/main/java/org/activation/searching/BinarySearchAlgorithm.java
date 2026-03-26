package org.activation.searching;

import java.util.Collections;
import java.util.List;

public class BinarySearchAlgorithm {

    public static void main (String[] args) {

       int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
       int k = 12;

        System.out.println(":::::::::::::::::::::::::::");

//        Collections.binarySearch( arr, k);

        if (binarySearch(arr, k) != -1){
            System.out.println("Number is found!");
        } else {
            System.out.println("Number is Not found!");
        }

        System.out.println(":::::::::::::::::::::::::::");

    }

    public static int binarySearch(int[] arr, int key) {
        int mid = 0; // mid element               0  1  2  3   4   5   6   7   8   9  last element | length -1 | 10 - 1 = 9
        int low = 0;  // lower position of array [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
        int high = arr.length - 1; // arr[9] where will be the lase element

        while (low <= high) {
            mid = low + (high - low) / 2;  // 0 + (9 - 0) / 2 | 4.5  = 4 also this is the

            if (arr[mid] == key) {
                System.out.println("::"+arr[mid]);
                return mid;
            }

            if(arr[mid] > key) {
                high = mid - 1; // low 0 - 1 = -1 so we have to add mid that is manage the pointer.
//                System.out.println(":':"+high);
            } else if (arr[mid] < key) {
                low = mid + 1;
//                System.out.println("::."+low);
            }

        }

        return -1;
    }

    /*Binary search should not use a for loop like this because:

        low and high are already controlling the search space.

        The loop variable i is completely unnecessary.

        When low and high change, the for loop still increments i, which can cause logical confusion.
     */
    public static int binarySearchWithForLoop(int[] arr, int key) {
        int mid = 0; // mid element               0  1  2  3   4   5   6   7   8   9  last element | length -1 | 10 - 1 = 9
        int low = 0;  // lower position of array [2, 5, 8, 12, 16, 23, 38, 56, 72, 91]
        int high = arr.length - 1; // arr[9] where will be the lase element

        for (int i = low; i <= high; i++) {
            mid = low + (high - low) / 2;  // 0 + (9 - 0) / 2 | 4.5  = 4

            if (arr[mid] == key) {
                System.out.println("::"+arr[mid]);
                return mid;
            }

            if(arr[mid] > key) {
                high = mid - 1; //   high = low - 1 = 0 - 1 = -1 so we have to add mid that is manage the pointer.
//                System.out.println(":':"+high);
            } else if (arr[mid] < key) {
                low = mid + 1;
//                System.out.println("::."+low);
            }
        }
        return -1;
    }
}
