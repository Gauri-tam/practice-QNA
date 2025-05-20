package org.activation.stringDemo;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {

        String str = "Tambakhe";

        Arrays.sort(str.toCharArray()); // sorting the String

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i)+ " ");
        }
    }
}
