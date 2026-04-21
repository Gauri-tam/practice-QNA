package org.activation.array;

public class PrimeNumbersArray {

    public static void main(String[] args) {

        int num = 10;

        // if we start from the i = 0 it will return the 0, 1, 2, 3, 5, 7 but we only need this 2, 3, 5, 7
        for (int i = 2; i <= num; i++){
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
