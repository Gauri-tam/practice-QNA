package org.activation;

public class FindMissingNum {

    public static void main(String[] args){
        int[] arr = {1, 2, 4, 5, 6};

        int n = arr.length + 1;  // we have to add one more element
        int total = n * (n + 1) / 2; // 6 * (6 + 1) / 2

//        System.out.println(total);  // 21

        int sum = 0; // collecting the sum of all element

        for (int num: arr){
            sum += num;
        }

//        System.out.println(sum); // 18

        int missing = total - sum;
        System.out.println("Missing number: " + missing);
    }
}
