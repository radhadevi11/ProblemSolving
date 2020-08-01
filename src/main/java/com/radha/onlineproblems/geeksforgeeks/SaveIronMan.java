package com.radha.onlineproblems.geeksforgeeks;

public class SaveIronMan {
    boolean isPalindromeWithSpecialCharacter(String word) {
        String wordWithoutSpecialChar = word.replaceAll("[^a-zA-Z0-9]", "");
        AnagramPalindrome palindrome = new AnagramPalindrome();
        String word1 = wordWithoutSpecialChar.toLowerCase();
        System.out.println(word1);

        return palindrome.canMakePalindrome(word1);
    }
}
