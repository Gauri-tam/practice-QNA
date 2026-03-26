package org.activation.array;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 1, 9, 10, 4, 1};

        duplicates(arr);
    }

    private static void duplicates(int[] arr) {
        int[] duplicate = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[i] == arr[j]) {
                    duplicate[index] = arr[i];
                    System.out.println("Duplicate Elements: " + duplicate[index]);
                    break;
                }
            }
        }

        System.out.print("Duplicate Elements: " + duplicate.length);

        for (int i = 0; i < index; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}
