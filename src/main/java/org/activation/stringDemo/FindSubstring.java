package org.activation.stringDemo;

public class FindSubstring {

    public static void main(String[] newArgs) {
        String str = "There is No Problem";
        String sbustr = "Problem";
        boolean found = false;

        // using the strsub method
        int index = strsub(str, sbustr);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }

    }

    public static int strsub(String str1, String str2) {
        int str1Length = str1.length(); // 18
        int str2Length = str2.length(); // 7

        for (int i = 0; i <= str1Length - str2Length; i++) {
            int j = 0;
            while (j < str2Length && str1.charAt(i + j) == str2.charAt(j)) {
                j++;
            }
            if (j == str2Length) {
                return i; // Return the starting index of the substring
            }
        }

        return -1;
    }
}
