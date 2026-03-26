package org.activation.array;

public class ReverseOnlyEvenNumbers {

    /**
     * Reverse only even numbers
     * Input:
     * [1,2,3,4,5,6]

     * Output:
     * [1,6,3,4,5,2]
     * */
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        reverseEvenNum(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }

    private static void reverseEvenNum(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n - 1;

        while (left < right) {
            if (arr[left] % 2 != 0) {
                left++;
            }

            if (arr[right] % 2 != 0) {
                right--;
            }

            if (arr[left] % 2 == 0 && arr[right] % 2 == 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            left++;
            right--;
        }

    }
}
