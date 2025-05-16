package org.activation;

public class EvenAndOddInArray {

    public static  void main(String[] any){
        int[] array = {3, 5, 6, 7, 3, 2};

        int even = 0;
        int odd = 0;
        for (int i = 0; i< array.length; i++){
            if (array[i]%2 == 0){
                even++;
            }else {
                odd++;
            }
        }

        System.out.println("Even : " + even);
        System.out.println("Odd : " + odd);
    }
}
