package com.radha.onlineproblems.geeksforgeeks;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
Step 1: if the length of both word is not equal return false
Step 2: convertStringToSet()
Step 3: find isAnagram()

 */
public class Anagram {
    Set<Character> convertStringToSet(String word) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            characterSet.add(word.charAt(i));
        }
        return characterSet;
    }

    boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        Set<Character> word1Characters = convertStringToSet(word1);
        return isAnagram(word2, word1Characters);
    }

    private boolean isAnagram(String word, Set<Character> characterSet) {
        /*
        for each character in word
            if characterSet not contains character
                return false

        return true
         */
        for (int i = 0; i < word.length(); i++) {
            if (!characterSet.contains(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        Anagram a = new Anagram();
        for (int i = 0; i < t; i++) {
            String word1 = s.next();
            String word2 = s.next();
            if (a.isAnagram(word1, word2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
