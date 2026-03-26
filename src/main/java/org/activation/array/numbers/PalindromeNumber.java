package org.activation.array.numbers;

public class PalindromeNumber {

    public static void main(String[] args) {
        int num = 122;  // try 121
        int temp = 0;

        for (int i = 0; i < num; i++){
            int rem = 0;
            int prod = 1;
            rem = num % 10;
            prod *= rem;
            temp += prod;
        }

        if (temp == num ){
            System.out.println("This number is the palindrome number! ");
        } else {
            System.out.println("its Not :( ");
        }
    }
}
