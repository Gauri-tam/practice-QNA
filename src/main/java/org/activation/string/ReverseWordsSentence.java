package org.activation.string;

public class ReverseWordsSentence {

    /**
     * Reverse words in a sentence
     * Input:
     * "I love Java"
     *
     * Output:
     * "Java love I"
     * */

    public static void main(String[] args) {

        String srt = "I hate or love Java";

        // convert string into string[] by splitting
        String[] string = srt.split("\\s+");

        // create a rev String Array
        String[] temp = new String[string.length];
        int index = temp.length - 1 ;

        // add Element fist into last
        for (int i = 0 ; i < string.length; i++) {
            System.out.print(string[i] + " ");
            System.out.println(index);
            if (index >= 0 ) {
                temp[index] = string[i];
                index--;
            }
        }
        System.out.println();

        // print Reverse Array
        for (String string1 : temp ) {
            System.out.print(string1 + " ");
        }

    }
}
