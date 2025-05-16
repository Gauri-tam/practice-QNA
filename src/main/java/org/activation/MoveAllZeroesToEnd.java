package org.activation;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    public static void main(String[] args){
        int[] array= {0, 1, 0, 3, 12};
        System.out.println("ary.lgt: " + array.length);

        int index = 0; // How dose it now its length

        for (int i = 0; i < array.length; i++){
            if(array[i] != 0){
               array[index++] = array[i];
            }
        }

        while (index < array.length){
            array[index++] = 0;
        }

        System.out.println(Arrays.toString(array));
    }
}
