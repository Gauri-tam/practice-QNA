package org.activation;

public class SumOfAllElementInArray {
    public static  void main(String[] args){
        int[] array= {3, 6, 5, 2, 7, 2};
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of all element: " + sum);
    }
}
