package com.radha.onlineproblems.geeksforgeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/*
Apple
Axe
 */
public class UncommonCharacters {
    Set<Character> convertStringToSet(String word) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characterSet.add(word.charAt(i));
        }
        return characterSet;
    }

    List<Character> getUnCommonCharacter(String s1, String s2) {
        Set<Character> s1CharactersWithOccurrence = convertStringToSet(s1);
        Set<Character> s2CharactersWithOccurrence = convertStringToSet(s2);
        List<Character> unCommonCharacters = new ArrayList<>();
        unCommonCharacters.addAll(getUnCommonCharacter(s1CharactersWithOccurrence, s2));
        unCommonCharacters.addAll(getUnCommonCharacter(s2CharactersWithOccurrence, s1));
        return unCommonCharacters;
    }
    List<Character> getUnCommonCharacter(Set<Character> characterSet, String s) {
        List<Character> unCommonCharacters = new ArrayList<>();
        for(int i = 0; i < s.length(); i++) {
            if(! characterSet.contains(s.charAt(i))) {
                unCommonCharacters.add(s.charAt(i));
            }
        }
        return unCommonCharacters;
    }

}
