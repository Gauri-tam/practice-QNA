package org.activation.array;

public class ArrayIsPalindrome {

    /**
     * Check if array is palindrome
     * Input:
     * [1,2,3,2,1]

     * Output:
     * true

     * Pattern:
     * left++
     * right--*/


    // we can check it like first element and the last element and also
    // we can do like reverse the arr and check if it is same or not -> ( may be it is )
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1};

        if (checkArrPalindrome(arr)) {
            System.out.println("it is Palindrome Array!");
        } else {
            System.out.println("it is Not Palindrome Array!");
        }
    }

    private static boolean checkArrPalindrome(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {

            System.out.println(arr[left] + " "+ arr[right]);

            if (arr[left] != arr[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
