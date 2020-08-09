package com.radha.onlineproblems.geeksforgeeks;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class UncommonCharactersTest {

    @Test
    public void getUnCommonCharacter() {
        UncommonCharacters uncommonCharacters = new UncommonCharacters();
        Assertions.assertThat(uncommonCharacters.getUnCommonCharacter("characters","alphabets")).contains('b','c','l', 'p', 'r');
    }
}

