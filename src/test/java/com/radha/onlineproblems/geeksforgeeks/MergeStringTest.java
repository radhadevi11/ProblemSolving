package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeStringTest {

    @Test
    public void mergeStrings() {
        MergeString mergeString = new MergeString();
        assertThat(mergeString.mergeStrings("Hello", "Bye")).isEqualTo("HBeylelo");
    }

    @Test
    public void mergeStrings2() {
        MergeString mergeString = new MergeString();
        assertThat(mergeString.mergeStrings("abx", "efg")).isEqualTo("aebfxg");
    }
    @Test
    public void mergeStringsEmptyString() {
        MergeString mergeString = new MergeString();
        assertThat(mergeString.mergeStrings("", "efg")).isEqualTo("efg");
    }
}