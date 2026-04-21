package org.activation.array;

public class ReverseArrayGroups {
    
    /**
     * Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8], k = 3
     * Output: [3, 2, 1, 6, 5, 4, 8, 7]
     * Explanation: Elements is reversed: [1, 2, 3] → [3, 2, 1], [4, 5, 6] → [6, 5, 4], and the last group [7, 8](size < 3) is reversed as [8, 7]. 
     *<p></p>
     * Input: arr[] = [1, 2, 3, 4, 5], k = 3
     * Output: [3, 2, 1, 5, 4]
     * Explanation: First group consists of elements 1, 2, 3. Second group consists of 4, 5.
     *<P></P>
     * Input: arr[] = [5, 6, 8, 9], k = 5
     * Output: [9, 8, 6, 5]
     * Explanation: Since k is greater than array size, the entire array is reversed.
     * */
    
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
//        reverseArray(arr);
        reverseGroups(arr, k);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    private static void reverseGroups(int[] arr, int k) {
        int n = arr.length;

        for (int i = 0; i < n ; i += k) { //i += k this will give you the 0, 3, 6

            int left = i;
            int right = Math.min(i + k - 1, n - 1); //This prevents array index out of bounds. // reverse the array

            System.out.println("left"+ left);
            System.out.println("right"+ right);
            while (left < right){

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }

        }
    }

    private static void reverseArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++)
            temp[i] = arr[n-i-1];

        for (int i = 0; i< arr.length; i++)
            System.out.print(temp[i] + " ");
    }
}
