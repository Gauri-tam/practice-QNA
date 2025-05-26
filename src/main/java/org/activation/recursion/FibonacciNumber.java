package org.activation.recursion;

public class FibonacciNumber {
    public static void main(String[] args){
        int n = 10; // Example number
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

        /*
        * if we start it form 0, 1 than the number is the 34
        * if stating from 1, 2 that it is teh 55 */
    }

    private static int fibonacci(int n) {
       if (n == 0 || n == 1){ // Base condition
           return n;
       }

        return fibonacci(n - 1) + fibonacci( n -2);  // Recursive case 17
    }
}
