package org.activation.stringDemo;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] newArgs) {
        String str = "swiss";  // "Problem"  // "swiss"  // "madam"  // "There is No Problem"

        // using the strsub method
        String demo = removeDuplicates(str);
        String hashSetString = removeDuplicatesHashSet(str);

        System.out.println("Without additional data structure: " + demo);
        System.out.println("Using HashSet with Data structure: " + hashSetString);

    }

    // Without additional data structure
    // Time complexity O(n^2)
    private static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Using HashSet with Data structure
    // Time complexity O(n)
    private static String removeDuplicatesHashSet(String str) {
        Set<Character> characterSet = new HashSet<>();  // Maintains insertion order
        for (char c : str.toCharArray()){
            characterSet.add(c);
        }

        StringBuilder result = new StringBuilder();    // collecting the characters without repeating it
        for(char c : characterSet){                    // adding the Character set to the result
            result.append(c);
        }
        return result.toString();                      // Convert StringBuilder to String
    }
}
