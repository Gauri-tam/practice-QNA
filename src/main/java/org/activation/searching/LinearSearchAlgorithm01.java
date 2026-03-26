package org.activation.searching;

public class LinearSearchAlgorithm01 {

    public static void main(String[] args){

        int[] arr = {10, 60, 30, 40, 50, 70, 20, 80, 90};
        int k = 30;
        int count = 0;



        for (int num : arr) {
            count ++;
            if (num == k) {
                System.out.println("Given Number was found at count " + count);
            }
        }
    }

}
