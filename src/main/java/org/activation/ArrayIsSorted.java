package org.activation;

public class ArrayIsSorted {

    public static void main(String[] args){

        int[] array = {3, 5, 7, 8, 9}; // true
//        int[] array = {6, 3, 7, 2}; // false

        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i+1]){
                isSorted = true;
            }else {
                isSorted = false;
            }
        }

        if(isSorted){
            System.out.println("this Array is sorted ");
        }else {
            System.out.println("this Array is not sorted ");
        }

    }
}
