package org.activation;

public class FindAllPairsWithAGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 2};
        int target = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);  // 3 + 3 = 6 (if duplicate 3s existed)
                }
            }
        }
    }
}
