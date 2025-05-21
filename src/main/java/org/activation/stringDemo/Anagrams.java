package org.activation.stringDemo;

import java.util.Arrays;

public class Anagrams {
    // two string are Anagrams =  str1 = "listen" and str2 = "silent" contain same character

    public static void main(String[] newArgs){
        String str= "listen";
        String str2 = "silent";

        if(str.length() != str2.length()){
            System.out.println("not and anagrams");
        }

//        char[] charArray = str.toCharArray();
//        char[] charArray2 = str2.toCharArray();

//        // sort the char array
//        Arrays.sort(charArray);
//        Arrays.sort(charArray2);
//
//        if (Arrays.equals(charArray, charArray2)){  // chatArray and charArray2 are equal and chat
//            // charArray.equals(charArray2) is not correct
//            System.out.println("the two strings are anagrams");
//        }else {
//            System.out.println("the two strings are not anagrams");
//        }

        Anagrams anagrams = new Anagrams();
        boolean result = anagrams.areAnagrams(str, str2);
        if (result) {
            System.out.println("The two strings are anagrams");
        } else {
            System.out.println("The two strings are not anagrams");
        }

    }

    // using nested loop
    public boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[256]; // Assuming ASCII characters

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}
