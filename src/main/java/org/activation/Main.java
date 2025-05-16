package org.activation;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 3, 6};

        int max = array[0];

        for (int i = 0; i < array.length-1; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("largest Element in the Array : " + max );
    }
}