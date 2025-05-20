package org.activation.stringDemo;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char[] charArray = str.toCharArray();  // convert String to the char array
        Map<Character, Integer> frequency = new HashMap<>();

        // Build frequency map
        for (char c : charArray) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        // Find first character with frequency 1

        for (char c : charArray) {

            if (frequency.get(c) == 1) {
                System.out.println(c);
            }
        }
    }
}
