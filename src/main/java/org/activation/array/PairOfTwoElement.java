package org.activation.array;

public class PairOfTwoElement {

    /**
     * Input: arr[] = [0, -1, 2, -3, 1], target = -2
     * Output: true
     * Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
     *<P></P>
     * Input: arr[] = [1, -2, 1, 0, 5], target = 0
     * Output: false
     * Explanation: There is no pair with sum equals to given target.
     * */

    public static void main(String[] args){
        int[] arr = {1, -2, 1, 0, 5};
        int key = 0;

        boolean sum = sumOfTwo(arr, key);
        System.out.println(sum);
    }

    private static boolean sumOfTwo(int[] arr, int key) {

        for (int i = 0; i < arr.length-1; i++) {
            if ( arr[i] + arr[i+1] == key){
                return true;
            }
        }
        return false;
    }
}
