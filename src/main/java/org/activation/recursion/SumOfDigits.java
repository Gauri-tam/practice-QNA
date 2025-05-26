package org.activation.recursion;

public class SumOfDigits {

    public static void main(String[] args){
        int number = 12345; // Example number
        System.out.println("Sum of digits in " + number + " is: " + sumOfDigits(number));
    }

    private static String sumOfDigits(int number) {
        if (number < 10) {
            return String.valueOf(number); // Base case: single digit it returns 1
        }
        // Recursive case: sum the last digit and the sum of the remaining digits
        return String.valueOf(number % 10 + Integer.parseInt(sumOfDigits(number / 10)));
    }
}
