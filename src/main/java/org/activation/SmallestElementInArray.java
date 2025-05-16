package org.activation;

import java.util.Arrays;

public class SmallestElementInArray {

    public static void main(String[] args){
        int[] array= {3, 5, 6, 2, 4, 6};
        int smallest = array[0];
        for (int i = 0; i< array.length-1; i++){
            if (array[i] < smallest){
                smallest = array[i];
            }
        }

        System.out.println("Smallest Element in Array : " + smallest); // 2 is the smallest number in the array;
    }
}
