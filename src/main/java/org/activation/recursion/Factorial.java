package org.activation.recursion;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example number
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    /**
     * Calculates the factorial of a given number using recursion.
     *
     * @param n the number to calculate the factorial for
     * @return the factorial of n
     */
    public static long factorial(int n) {
        if (n <= 1) {
            return 1; // Base case
        }
        return n * factorial(n - 1); // Recursive case
    }
}
