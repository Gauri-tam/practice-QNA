package org.activation.recursion;

public class FibonacciNumber01 {

    public static void main(String[] args) {
        int n = 10;
        int result = fibbonacci(n);

        System.out.println("result: " + result);
    }

    private static int fibbonacci(int n) {

        // base case
        if (n == 0 || n == 1) {
            return n;
        }

        // recursive case
        return fibbonacci(n - 1) + fibbonacci(n - 2);
    }
}
