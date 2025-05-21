package org.activation.stringDemo;

public class Palindrome {

    public static void main(String[] args) {
        String str = "madam"; // madam
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        if (str.equals(reversedStr)) {  // dont use == for string comparison
            System.out.println("the string is a palindrome");
        } else {
            System.out.println("the string is not a palindrome");
        }
    }
}
