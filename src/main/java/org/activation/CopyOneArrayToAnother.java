package org.activation;

public class CopyOneArrayToAnother {
    public static void main(String[] args){
        int[] array = {3, 5, 2, 7, 2};

        int[] newArray = new int[array.length];

        for(int i = 0; i< array.length; i++){
            newArray[i] = array[i];
        }


        System.out.println("new array: ");
        for(int i = 0; i< newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
