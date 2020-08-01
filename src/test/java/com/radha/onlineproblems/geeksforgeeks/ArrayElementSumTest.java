package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayElementSumTest {

    @Test
    public void isSumEqualToK() {
        ArrayElementSum sum = new ArrayElementSum();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(10, 10);
        numMap.put(3, 3);
        numMap.put(15, 15);
        numMap.put(7, 7);
        int[] numbers = new int[]{10, 3, 15, 7};

        boolean actual = sum.isSumEqualToK(17, numMap, numbers);

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void isSumNotEqualToK() {
        ArrayElementSum sum = new ArrayElementSum();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(10, 10);
        numMap.put(3, 3);
        numMap.put(15, 15);
        numMap.put(8, 8);
        int[] numbers = new int[]{10, 3, 15, 8};

        boolean actual = sum.isSumEqualToK(17, numMap, numbers);

        assertThat(actual).isEqualTo(false);
    }


    @Test
    public void isSumOfElementsEqualToK() {
        ArrayElementSum sum = new ArrayElementSum();
        int[] numbers = new int[]{10, 3, 15, 7};

        boolean actual = sum.isSumOfElementsEqualToK(17, numbers);

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void isSumOfElementsNotEqualToK() {
        ArrayElementSum sum = new ArrayElementSum();
        int[] numbers = new int[]{10, 3, 15, 8};

        boolean actual = sum.isSumOfElementsEqualToK(17, numbers);

        assertThat(actual).isEqualTo(false);
    }

}