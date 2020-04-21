package com.radha.onlineproblems;

import com.radha.onlineproblems.LongestDistinctCharacter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class LongestDistinctCharacterTest {

    @Test
    public void getLongestDistinctCharacter() {
        LongestDistinctCharacter character = new LongestDistinctCharacter();

        int actual = character.getLongestDistinctCharacter("abababcdefababcdab");

        assertThat(actual).isEqualTo(6);
    }

    @Test
    public void getLongestDistinctCharacter2() {
        LongestDistinctCharacter character = new LongestDistinctCharacter();

        int actual = character.getLongestDistinctCharacter("geeksforgeeks");

        assertThat(actual).isEqualTo(7);
    }
    @Test
    public void getLongestDistinctCharacter3() {
        LongestDistinctCharacter character = new LongestDistinctCharacter();

        int actual = character.getLongestDistinctCharacter("abapqr");

        assertThat(actual).isEqualTo(5  );
    }
}