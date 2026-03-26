package org.activation.searching;

public class FindMaxByLinearSearch {

    public static void main(String[] args) {
        int[] arr = {15, 6, 1, 2, 3, 4, 7};

//        int max = findMax(arr);
//        System.out.println(max);
        findMax(arr);
    }

    // best way to compare with the each iteration with the max element
    private static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length -1 ; i ++) {
            if (max < arr[i] ) {
                max = arr[i];
            }
        }
        System.out.println("Largest Element: "+ max);
    }
}
