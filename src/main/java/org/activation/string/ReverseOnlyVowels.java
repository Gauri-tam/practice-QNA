package org.activation.string;

public class ReverseOnlyVowels {

    /**
    * Reverse only vowels in a string
     * Input:
     * hello or gauri
     *<P></P>
     * Output:
     * holle or giuro
     *<P></P>
     * Learn:
     * 1. two pointers
     * 2. conditional swapping
    * */

    public static void main(String[] arr) {
        String str = "Gauri";

        String sort = str.toLowerCase();
        System.out.println(sort);

        int n = sort.length();
        char[] charArr = sort.toCharArray();
        String vowels = "aeiou";

        // this the index
        int left = 0;
        int right = charArr.length - 1;

        while (left < right) {

            // by the String
            boolean isLeftVowel =
                    vowels.indexOf(Character.toLowerCase(charArr[left])) != -1;

            boolean isRightVowel =
                    vowels.indexOf(Character.toLowerCase(charArr[right])) != -1;
//            Collections

//            System.out.println(charArr[left]);
//            System.out.println(charArr[right]);
//            System.out.println(isLeftVowel && isRightVowel);
//            System.out.println(isRightVowel);
            System.out.println("-------------------");

            if (isLeftVowel && isRightVowel) {
                char temp = charArr[left];
                charArr[left] = charArr[right];
                charArr[right] = temp;

                left++;
                right--;
            }else {
                if (!isLeftVowel)  left++;
                if (!isRightVowel) right--;
            }
        }

        for (int i = 0; i< charArr.length; i++)
            System.out.print(charArr[i] + " ");
    }

}
