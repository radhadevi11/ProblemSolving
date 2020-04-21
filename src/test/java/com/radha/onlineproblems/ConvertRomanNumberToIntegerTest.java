package com.radha.onlineproblems;

import com.radha.onlineproblems.ConvertRomanNumberToInteger;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class ConvertRomanNumberToIntegerTest {

    @Test
    public void getEquivalentIntegerForRomanStringForSingleCharacter() {
        ConvertRomanNumberToInteger convertRomanNumberToInteger = new ConvertRomanNumberToInteger();

        int actual = convertRomanNumberToInteger.getEquivalentIntegerForRomanString("V");

        assertThat(actual).isEqualTo(5);
    }

    @Test
    public void getEquivalentIntegerForRomanStringForTwoCharacters() {
        ConvertRomanNumberToInteger convertRomanNumberToInteger = new ConvertRomanNumberToInteger();

        int actual = convertRomanNumberToInteger.getEquivalentIntegerForRomanString("XI");

        assertThat(actual).isEqualTo(11);
    }

    @Test
    public void getEquivalentIntegerForRomanStringForTwoCharactersDecreasingOrder () {
        ConvertRomanNumberToInteger convertRomanNumberToInteger = new ConvertRomanNumberToInteger();

        int actual = convertRomanNumberToInteger.getEquivalentIntegerForRomanString("IX");

        assertThat(actual).isEqualTo(9);
    }

}