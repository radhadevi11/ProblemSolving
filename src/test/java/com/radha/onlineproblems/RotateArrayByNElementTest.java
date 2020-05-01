package com.radha.onlineproblems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateArrayByNElementTest {

    @Test
    public void testGetRotatedList() {
        RotateArrayByNElement rotateArrayByNElement = new RotateArrayByNElement();

        assertThat(rotateArrayByNElement.getRotatedList(2,
                new int[]{1, 5, 3, 2, 6})).containsExactly(3, 2, 6, 1, 5);
    }

    @Test
    public void printRotatedArray() {
        RotateArrayByNElement  rotateArrayByNElement = new RotateArrayByNElement();

        rotateArrayByNElement.printRotatedArray(3,
                new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20});
    }
}