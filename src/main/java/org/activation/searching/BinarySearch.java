package org.activation.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int key = 40;


        if (binarySearch(arr, key) != -1) {
            System.out.println("Number Founded!");
        } else {
            System.out.println("Number not Founded!");
        }
    }

    public static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length -1 ;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2; // 4 + (4 - 4) / 2 = 2  mid = 2
            count++;
            System.out.println("count:::::::::"+count + " and mid is "+ mid);

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {  // if the mid is > key
                high = mid - 1;    // 3 = 4-1 = 3
                System.out.println("mid - 1");
            } else {
                low = mid + 1;    // 5 = 4+1 = 5
                System.out.println("mid + 1");
            }
        }
        return -1;
    }
}
