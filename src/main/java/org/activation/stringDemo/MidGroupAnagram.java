package org.activation.stringDemo;

import java.util.*;

public class MidGroupAnagram {

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Grouped anagrams: " + groupAnagrams(input));
        /* Output:
        [
          ["eat","tea","ate"],
          ["tan","nat"],
          ["bat"]
        ]
        */
    }
    //mid level String Question and Answers with the Example of them in java on the chat.deepAI.com Anagram

    private static List<List<String>> groupAnagrams(String[] str) {

        if (str.length == 0) return new ArrayList<>(); // array

        Map<String, List<String>> map = new HashMap<>();

        for (String s : str){

            char[] chars  = s.toCharArray();  // convert String to Char Array

            Arrays.sort(chars); // sort the char array

            String key = String.valueOf(chars); // convert char array to String

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>()); // if the kay is not in the map
            }

            map.get(key).add(s); // add the string to the list of the kay
        }

        return new ArrayList<>(map.values());
    }
}
