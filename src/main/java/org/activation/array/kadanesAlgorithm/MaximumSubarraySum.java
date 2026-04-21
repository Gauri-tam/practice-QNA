package org.activation.array.kadanesAlgorithm;

public class MaximumSubarraySum {

    /**
     Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     Output: 6
     Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     Example 2:

     Input: nums = [1]
     Output: 1
     Explanation: The subarray [1] has the largest sum 1.
     Example 3:

     Input: nums = [5,4,-1,7,8]
     Output: 23
     Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     * */
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int largestSum = maxSubArraySum(arr);
        System.out.println(largestSum);

//        Math.max(res, currSum); // hint
    }

    private static int maxSubArraySum(int[] arr) {
        int res = arr[0];
         for (int i = 0 ; i < arr.length; i++) {
             int currSum = 0;
             for (int j = i; j < arr.length; j++) {
                 currSum += arr[j];

//                res = Math.max(res, currSum);
                 if (currSum > res) {
                     res = currSum;
                 }
             }
         }
         return res;
    }
}
