package com.radha.onlineproblems.paypal;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ZigZagArrayTest {

    @Test
    public void printZigZagArray() {
        ZigZagArray zigZagArray = new ZigZagArray();
        int[] numbers = {4, 3, 7, 8, 6, 2, 1};
        zigZagArray.printZigZagArray(numbers, 7);
    }
    @Test
    public void printZigZagArray2() {
        ZigZagArray zigZagArray = new ZigZagArray();
        int[] numbers = {1, 4, 3, 2};
        zigZagArray.printZigZagArray(numbers, 4);
    }
    @Test
    public void printZigZagArray3() {
        ZigZagArray zigZagArray = new ZigZagArray();
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        zigZagArray.printZigZagArray(numbers, 7);
    }

    @Test
    public void swap() {
        ZigZagArray zigZagArray = new ZigZagArray();
        int[] numbers = {1, 2};
        zigZagArray.swap(numbers, 0, 1);
        assertThat(numbers).containsExactly(2, 1);
    }

    @Test
    public void isElementNotInZigZagOrderForEvenPos() {
        ZigZagArray zigZagArray = new ZigZagArray();
        assertThat(zigZagArray.isElementInZigZagOrder(4, 3, 0)).isFalse();
    }
    @Test
    public void isElementInZigZagOrderForEvenPos() {
        ZigZagArray zigZagArray = new ZigZagArray();
        assertThat(zigZagArray.isElementInZigZagOrder(4, 7, 0)).isTrue();
    }
    @Test
    public void isElementNotInZigZagOrderForOddPos() {
        ZigZagArray zigZagArray = new ZigZagArray();
        assertThat(zigZagArray.isElementInZigZagOrder(4, 3, 1)).isTrue();
    }
    @Test
    public void isElementInZigZagOrderForOddPos() {
        ZigZagArray zigZagArray = new ZigZagArray();
        assertThat(zigZagArray.isElementInZigZagOrder(4, 7, 3)).isFalse();
    }

}