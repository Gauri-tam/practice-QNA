package org.activation.stringDemo;

public class CharacterCount {

    public static void main(String[] args) {
        String input = "programming";
        char target = 'm';
        System.out.println("Occurrences of '" + target + "': " +
                countOccurrences(input, target));
    }

    private static String countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == target){
                count++;
            }
        }
        return String.valueOf(count);
    }
}
