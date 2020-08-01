package com.radha.onlineproblems.moreinterviewquestions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraElementTest {
    @Test
    public void testIsSameElement(){
        ExtraElement extraElement = new ExtraElement();

        assertEquals(true, extraElement.isSameElement(4, 4));
    }

    @Test
    public void testNotIsSameElement(){
        ExtraElement extraElement = new ExtraElement();

        assertEquals(false, extraElement.isSameElement(3, 4));
    }

    @Test
    public void testFindIndexOfExtraElementWithLessComplexity() {
        ExtraElement extraElement = new ExtraElement();
        int[] array1 = {2, 4, 6, 8, 9, 10};
        int[] array2 = {2, 4, 6, 8, 10};

        int indexOfExtraElement = extraElement.findIndexOfExtraElement(array1, array2, array1.length);
        assertEquals(4, indexOfExtraElement);
    }

    @Test
    public void testFindIndexOfExtraElementInTheLastPositionWithLessComplexity() {
        ExtraElement extraElement = new ExtraElement();
        int[] array1 = {2, 4, 6, 8, 10, 12};
        int[] array2 = {2, 4, 6, 8, 10};

        int indexOfExtraElement = extraElement.findIndexOfExtraElement(array1, array2, array1.length);
        assertEquals(5, indexOfExtraElement);
    }
}