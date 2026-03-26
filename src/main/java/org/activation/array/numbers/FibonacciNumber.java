package org.activation.array.numbers;

public class FibonacciNumber {

    public static void main(String[] args) {
        int num1 = 0, num2 = 1, num3 = 0;
        int key = 10;
        for (int i = 0; i < key; i++) {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;

            System.out.println(num3);
        }
    }
}
