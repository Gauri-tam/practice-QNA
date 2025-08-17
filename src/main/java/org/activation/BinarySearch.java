package org.activation;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {1, 2, 4, 5, 7, 9, 11};

        System.out.println(binarySearch(array, 9));
    }

    public static int binarySearch(int[] numbers, int numberToFind) {

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {

            int middlePosition = (low + high) / 2;
            int middleNumber = numbers[middlePosition];


            if (middleNumber == numberToFind) {
                return middleNumber;
            } else if (numberToFind < numberToFind) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}
