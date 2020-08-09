package com.radha.onlineproblems.geeksforgeeks;


import java.util.HashSet;
import java.util.Set;

public class KAnagram {
    Set<Character> convertStringToSet(String word) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characterSet.add(word.charAt(i));
        }
        return characterSet;
    }

    boolean isAnagram(String word1, String word2, int k) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Set<Character> word1Characters = convertStringToSet(word1);
        return isAnagram(word2, word1Characters, k);
    }

    private boolean isAnagram(String word, Set<Character> characterSet, int k) {
        /*
        for each character in word
            if characterSet not contains character
                return false

        return true
         */
        int limit = 0;
        for (int i = 0; i < word.length(); i++) {
            if (!characterSet.contains(word.charAt(i))){
                if(limit > k) {
                    return false;
                }
                else {
                    limit++;
                }

            }
        }
        return true;
    }

}
