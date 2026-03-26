package org.activation.array;

public class ReverseArray {

    /**
     * Input: arr[] = [1, 4, 3, 2, 6, 5]
     * Output:  [5, 6, 2, 3, 4, 1]
     * Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.
     *
     * Input: arr[] = [4, 5, 1, 2]
     * Output: [2, 1, 5, 4]
     * Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.
     * */

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6, 5};

//        for (int i = arr.length -1  ; i >= 0 ; i--) {
//            System.out.print(arr[i] + " ");
//        }

        // also we can do this
        // add the pointer to it like we can switch the first and the last element
        reverstArray(arr);
    }

    private static void reverstArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+ " ");
        }
    }
}
