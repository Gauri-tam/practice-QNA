package org.activation.bitManipulation;

public class ArmstrongNumber {
//    public static void main(String[] args) {
//
//    }

    public static void main(String[] args) {

        int n = 153; // its Armstrong Number 1634
        int num = n;
        int temp = 0;
        int count = 0;

        // get the count of the given number
        for (int i = 0; i < num ; i++) {
            count = num % 10;
        }

        while (0 < num) {
            int rem = num % 10 ;
            for ( int i = 0; i < count; i++){

            }
            int prod = rem * rem * rem ;
            temp += prod;
            num /= 10;
        }

        if (temp == n) {
            System.out.println("its Armstrong NUmber!");
        } else {
            System.out.println("Sorry its Not :(");
        }
    }
}
