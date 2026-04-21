package org.activation.recursion;

public class Factorial01 {

    public static void main(String[] args) {
        int num = 5;

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }

    private static int factorial(int num) {

        if (num ==0){
            return 1;
        }
        System.out.println("num: " + num);
        return num * factorial(num-1);
    }
}
