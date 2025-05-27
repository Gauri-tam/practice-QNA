package org.activation.recursion;

public class PrintAscending {
    public static void main(String[] args){
        int n = 10; // Example number
        System.out.println("Printing numbers from " + n + " to 1:");
        printAscending(n);
    }

    private static void printAscending(int n) {
        if (n < 1){
            return; // Base case: stop when n is less than 1
        }
        printAscending(n -1); // Recursive call with n - 1
        System.out.println(n); // Print the current number
    }
}
