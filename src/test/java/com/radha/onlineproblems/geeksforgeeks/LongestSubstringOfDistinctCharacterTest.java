package com.radha.onlineproblems.geeksforgeeks;

import com.radha.onlineproblems.geeksforgeeks.LongestSubstringOfDistinctCharacter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestSubstringOfDistinctCharacterTest {


    @Test
    public void testGetSizeOfLongestSubString() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacter("abapqr")).isEqualTo(5);
    }

    @Test
    public void testGetSizeOfLongestSubStringComplexExample() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacter("abababcdefababcdab")).isEqualTo(6);
    }

    @Test
    public void testGetSizeOfLongestSubStringComplexExample2() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacter("geeksforgeeks")).isEqualTo(7);
    }

    @Test
    public void testGetSizeOfLongestSubStringNonDuplicateCharacter() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacter("abcde")).isEqualTo(5);
    }

    @Test
    public void testGetSizeOfLongestSubStringWithLessTimeComplexity() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity("abapqr")).isEqualTo(5);
    }

    @Test
    public void testGetSizeOfLongestSubStringWithLessTimeComplexityComplexExample() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity("abababcdefababcdab")).isEqualTo(6);
    }

    @Test
    public void testGetSizeOfLongestSubStringWithLessTimeComplexityComplexExample2() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity("geeksforgeeks")).isEqualTo(7);
    }

    @Test
    public void testGetSizeOfLongestSubStringWithLessTimeComplexityNonDuplicateCharacter() {
        LongestSubstringOfDistinctCharacter character = new LongestSubstringOfDistinctCharacter();

        assertThat(character.getSizeOfLongestSubstringWithDistinctCharacter("abcde")).isEqualTo(5);
    }


}