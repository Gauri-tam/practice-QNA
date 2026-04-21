package org.activation.array;

public class SecondMinElementInArray {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 3, 6, 0};

        secondMinElement(arr);
    }

    private static void secondMinElement(int[] arr) {
        int min = arr[0];
        int secondMin = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            }
        }
        System.out.println("Min Element : " + min);
        System.out.println("Second Min: " + secondMin);
    }
}
