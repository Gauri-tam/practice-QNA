package org.activation.recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "racecar";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    private static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true; // Base case
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1); // Recursive case
    }
}
