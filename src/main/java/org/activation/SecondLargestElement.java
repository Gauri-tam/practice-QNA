package org.activation;

public class SecondLargestElement {
    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8, 15};
        int lasgest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > lasgest){
                secondLargest = lasgest;
                lasgest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != lasgest){  // without this logic you get 10 as an output that
               secondLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element: " + secondLargest);
    }
}
