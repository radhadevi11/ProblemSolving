package com.radha.onlineproblems.paypal;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoSortedArrayTest {

    @Test
    public void getMergedArray() {
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        Assertions.assertThat(mergeTwoSortedArray.getMergedArray(new int[] {1, 3, 5}, new int[] {2, 4, 6}))
                .containsExactly(1, 2, 3, 4, 5, 6);
    }

    @Test
    public void getMergedArray2() {
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        Assertions.assertThat(mergeTwoSortedArray.getMergedArray(new int[] {1, 3, 5}, new int[] {2, 4, 6, 8}))
                .containsExactly(1, 2, 3, 4, 5, 6, 8);
    }

    @Test
    public void getMergedArray3() {
        MergeTwoSortedArray mergeTwoSortedArray = new MergeTwoSortedArray();
        Assertions.assertThat(mergeTwoSortedArray.getMergedArray(new int[] {1, 3, 5, 10}, new int[] {2, 4, 6}))
                .containsExactly(1, 2, 3, 4, 5, 6, 10);
    }




}