package org.activation;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3};
        int[] temp = new int[arr.length];
        int j = 0;

        System.out.println(arr.length);

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[arr.length - 1];  // without this line you only get the 1 2

        for (int i = 0; i < j; i++) {
           System.out.print(temp[i] + " ");
        }
    }
}
