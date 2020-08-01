package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramTest {

    @Test
    public void isAnagram() {
        Anagram anagram = new Anagram();
        assertThat(anagram.isAnagram("geeksforgeeks", "forgeeksgeeks")).isTrue();

    }

    @Test
    public void isNotAnagram() {
        Anagram anagram = new Anagram();
        assertThat(anagram.isAnagram("allergy", "allergic")).isFalse();

    }

    @Test
    public void isAnagramDifferentLen() {
        Anagram anagram = new Anagram();
        assertThat(anagram.isAnagram("allergy", "allergi")).isFalse();

    }
}