package com.radha.onlineproblems.geeksforgeeks;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SaveIronManTest {

    @Test
    public void isPalindromeWithSpecialCharacter() {
        SaveIronMan saveIronMan = new SaveIronMan();
        Assertions.assertThat(saveIronMan.isPalindromeWithSpecialCharacter("I am :IronnorI Ma, i")).isTrue();
    }

    @Test
    public void isPalindromeWithSpecialCharacterWithNumber() {
        SaveIronMan saveIronMan = new SaveIronMan();
        Assertions.assertThat(saveIronMan.isPalindromeWithSpecialCharacter("I1 am :IronnorI1 Ma, i")).isTrue();
    }

    @Test
    public void isNotPalindromeWithSpecialCharacterWithNumber() {
        SaveIronMan saveIronMan = new SaveIronMan();
        Assertions.assertThat(saveIronMan.isPalindromeWithSpecialCharacter("1I am :IronnorI Ma, icd1")).isFalse();
    }
}