package com.radha.onlineproblems.bytes;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EveryWordIsPalindromeTest {

    @Test
    public void isAllWordNotPalindrome() {
        EveryWordIsPalindrome palindrome = new EveryWordIsPalindrome();
        assertThat(palindrome.isEveryWordPalindrome("my name is java")).isFalse();
    }
    @Test
    public void isOneWordNotPalindrome() {
        EveryWordIsPalindrome palindrome = new EveryWordIsPalindrome();
        assertThat(palindrome.isEveryWordPalindrome("liril civic noon sky")).isFalse();
    }

    @Test
    public void isEveryWordPalindrome() {
        EveryWordIsPalindrome palindrome = new EveryWordIsPalindrome();
        assertThat(palindrome.isEveryWordPalindrome("mom mam liril radar")).isTrue();
    }

    @Test
    public void isNotPalindrome() {
        EveryWordIsPalindrome palindrome = new EveryWordIsPalindrome();
        assertThat(palindrome.isPalindrome("abc")).isFalse();
    }
    @Test
    public void isPalindrome() {
        EveryWordIsPalindrome palindrome = new EveryWordIsPalindrome();
        assertThat(palindrome.isPalindrome("abcba")).isTrue();
    }
}