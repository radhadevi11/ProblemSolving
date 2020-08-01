package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramPalindromeTest {

    @Test
    public void testCanMakePalindromeWithMapOddLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        Map<Character, Integer> charWithOccurrence = new HashMap<>();
        charWithOccurrence.put('m', 2);
        charWithOccurrence.put('o', 1);
        assertThat(palindrome.canMakePalindrome(charWithOccurrence, false)).isTrue();

    }

    @Test
    public void testCanNotMakePalindromeWithMapOddLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        Map<Character, Integer> charWithOccurrence = new HashMap<>();
        charWithOccurrence.put('a', 1);
        charWithOccurrence.put('b', 1);
        charWithOccurrence.put('c', 3);
        assertThat(palindrome.canMakePalindrome(charWithOccurrence, false)).isFalse();

    }

    @Test
    public void testCanMakePalindromeWithMapEvenLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        Map<Character, Integer> charWithOccurrence = new HashMap<>();
        charWithOccurrence.put('n', 2);
        charWithOccurrence.put('o', 2);
        assertThat(palindrome.canMakePalindrome(charWithOccurrence, true)).isTrue();

    }

    @Test
    public void testCanNotMakePalindromeWithMapEvenLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        Map<Character, Integer> charWithOccurrence = new HashMap<>();
        charWithOccurrence.put('a', 2);
        charWithOccurrence.put('b', 2);
        charWithOccurrence.put('c', 1);
        charWithOccurrence.put('d', 1);
        assertThat(palindrome.canMakePalindrome(charWithOccurrence, true)).isFalse();

    }

    @Test
    public void testCanMakePalindromeWithWordOddLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        assertThat(palindrome.canMakePalindrome("geeksogeeks")).isTrue();
    }

    @Test
    public void testCanNotMakePalindromeWithWordOddLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        assertThat(palindrome.canMakePalindrome("geeksforgeeks")).isFalse();
    }

    @Test
    public void testCanMakePalindromeWithWordEvenLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        assertThat(palindrome.canMakePalindrome("geeksffgeeks")).isTrue();
    }

    @Test
    public void testCanNotMakePalindromeWithWordEvenLength() {
        AnagramPalindrome palindrome = new AnagramPalindrome();
        assertThat(palindrome.canMakePalindrome("geeksfegfgeeks")).isFalse();
    }


}