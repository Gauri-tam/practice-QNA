package org.activation.array;

public class SecondLargeElementArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 9, 10};

        secondLargeElement(arr);
    }

    private static void secondLargeElement(int[] arr) {
        int max = arr[0];
        int secondLarge = arr[0];

        for (int i = 0; i < arr.length; i ++) {

            if (max < arr[i]) {
                secondLarge = max;
                max = arr[i];
            }
        }
        System.out.println("Large Element: " + max);
        System.out.println("Second Large: " + secondLarge);
    }
}
