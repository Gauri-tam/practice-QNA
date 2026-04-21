package org.activation.searching;

public class FindMinByLinearSearch {

    public static void main(String[] args) {
        int[] arr = {15, 6, 1, 2, 3, 4, 7};
//        int[] arr = {3, 1, 2};

        bestWayToFindMin(arr);
    }

    // may be but
    private static void findMin(int[] arr) {
        int smallest = 0;
        for (int i = 0; i < arr.length -1; i++) {
            System.out.println(arr[i]);

            System.out.println(arr[i] > arr[i + 1]);
                if (arr[i] > arr[i + 1] ) {
                    smallest = arr[i + 1];
                }
        }
        System.out.println("Smallest element in the array " + smallest);
    }

    // best way
    private static void bestWayToFindMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length -1; i ++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest one " + min);
    }
}
