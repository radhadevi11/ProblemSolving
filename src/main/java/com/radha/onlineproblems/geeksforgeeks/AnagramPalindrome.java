package com.radha.onlineproblems.geeksforgeeks;
/*
convertWordToMap()
if word length is even
    canMakePalindrome(true, map)
else
    canMakePalindrome(false, map)
 */

import java.util.HashMap;
import java.util.Map;

public class AnagramPalindrome {
    Map<Character, Integer> convertWordToMap(String word){
        Map<Character, Integer> charWithOccurrence = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            if(charWithOccurrence.putIfAbsent(word.charAt(i), 1) != null) {
                charWithOccurrence.replace(word.charAt(i),
                        charWithOccurrence.get(word.charAt(i)) + 1);
            }
        }
        return  charWithOccurrence;

    }
    boolean canMakePalindrome(String word) {
        Map<Character, Integer> charWithOccurrence = convertWordToMap(word);
        if(word.length() % 2 == 0) {
            return canMakePalindrome(charWithOccurrence, true);
        }
        return canMakePalindrome(charWithOccurrence, false);
    }

    boolean canMakePalindrome(Map<Character, Integer> charWithOccurrence, boolean isEvenNoOfLength) {
        /*
        for each entry in the map
            if isEvenNoOfLength
                charOccurrence is not even return false
            otherwise
                make isEvenNoOfLength to true
        return false
         */
        for (Character character : charWithOccurrence.keySet()) {
            if(charWithOccurrence.get(character) % 2 != 0){
                if(isEvenNoOfLength) {
                    return false;
                }
                else {
                    isEvenNoOfLength = true;
                }
            }

        }
        return true;

    }
}
