package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExtractMaximumTest {

    @Test
    public void getMaxNum() {
        ExtractMaximum extractMaximum = new ExtractMaximum();
        assertThat(extractMaximum.getMaxNum("100klh564abc365bg")).isEqualTo(564);
        assertThat(extractMaximum.getMaxNum("abvhd9sdnkjdfs")).isEqualTo(9);
        assertThat(extractMaximum.getMaxNum("abchsd0sdhs")).isEqualTo(0);
    }

    @Test
    public void getMaxSumWithBuiltInMethod() {
        ExtractMaximum extractMaximum = new ExtractMaximum();
        assertThat(extractMaximum.getMaxSumWithBuiltInMethod("100klh564abc365bg")).isEqualTo(564);
        assertThat(extractMaximum.getMaxSumWithBuiltInMethod("abvhd9sdnkjdfs")).isEqualTo(9);
        assertThat(extractMaximum.getMaxSumWithBuiltInMethod("abchsd0sdhs")).isEqualTo(0);
    }
}