package org.activation.array;

public class ReverseEvenNumbers {

    /**
     * Reverse only even numbers
     * Input:
     * [1,2,3,4,5,6]
     *
     * Output:
     * [1,6,3,4,5,2]
     * */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        reverseEvenNumber(arr);

        for(int num: arr){
            System.out.print(num+ " ");
        }
    }

    private static void reverseEvenNumber(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n-1;

        // think about every possibility
        while (left < right) {

            // check the left is the even (starting element )  || move left to next even
            while (left < right && arr[left] % 2 != 0 ) {
                left++;
            }

            // check the right is the even ( ending  element ) || move right to previous even
            while (left < right && arr[right] % 2 != 0 ) {
                right--;
            }

            // swap the number
            if(arr[left] % 2 == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            left++;
            right--;

        }
    }
}
