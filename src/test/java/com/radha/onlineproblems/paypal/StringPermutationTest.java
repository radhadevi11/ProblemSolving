package com.radha.onlineproblems.paypal;

import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class StringPermutationTest {

    @Test
    public void getAllPermutation() {
        StringPermutation stringPermutation = new StringPermutation();
        Set<String> permutations = stringPermutation.getAllPermutation("cat");
        System.out.println(permutations);
        assertThat(permutations.size()).isEqualTo(6);
    }

    @Test
    public void getCurPermutations() {
        StringPermutation stringPermutation = new StringPermutation();
        assertThat(stringPermutation.getCurPermutations('t', new HashSet<>(Collections.singleton("a")))).contains("at", "ta");
    }

    @Test
    public void concatenateCurChar() {
        StringPermutation stringPermutation = new StringPermutation();
        assertThat(stringPermutation.concatenateCurChar('c', "at")).contains("cat", "act", "atc");
    }
}