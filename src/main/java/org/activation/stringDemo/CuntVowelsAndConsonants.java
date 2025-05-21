package org.activation.stringDemo;

import java.util.Arrays;

public class CuntVowelsAndConsonants {

    public static void main(String[] newArgs) {
        String str = "Problem";

        // using the strsub method
        countVowelsAndConsonants(str);

        //output
//        Vowels: 2
//        Consonants: 5

    }

    private static void countVowelsAndConsonants(String str) {

        int vowels = 0, consonants = 0;
        String vowelsStr = "aeiouAEIOU";


        for (char c: str.toCharArray()){
            if (Character.isLetter(c)){
                if(vowelsStr.indexOf(c) != -1){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
