package com.radha.onlineproblems.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {

    @Test
    public void testSwap() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] elements = {2, 1};

        bubbleSort.swap(elements, 0, 1);

        assertThat(elements).containsExactly(1, 2);


    }

    @Test
    public void testSort() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] elements = {2, 1, 5, 3, 6};

        bubbleSort.sort(elements);

        assertThat(elements).containsExactly(1, 2, 3, 5, 6);
    }

    @Test
    public void printBubbleSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] elements = {2, 1, 5, 3, 6};

        bubbleSort.printBubbleSortedArray(elements);

        assertThat(elements).containsExactly(1, 2, 3, 5, 6);
    }
}