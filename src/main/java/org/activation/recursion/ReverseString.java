package org.activation.recursion;

public class ReverseString {

    public static void main(String[] args){
        String str = "Hello";
        String reversed = reverseString(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString(String str) {
        // return reverseHelper(str, str.length() - 1);  // Using a helper method for clarity

        // Recursive method to reverse a string
        // Base case: if the string is null or empty, return it as is
        if (str == null || str.isEmpty() || str.length() <= 1){  // Base condition
            return str;
        }

        return  reverseString(str.substring(1)) + str.charAt(0);  // Recursive case
    }

    private static String reverseHelper(String str, int i) {
        if (i < 0) {
            return ""; // Base case: if index is less than 0, return empty string
        }
        // Recursive case: get the character at index i and append it to the reversed substring
        return str.charAt(i) + reverseHelper(str, i - 1);
    }
}
