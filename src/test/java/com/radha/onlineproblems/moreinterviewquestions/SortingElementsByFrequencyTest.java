package com.radha.onlineproblems.moreinterviewquestions;

import com.radha.onlineproblems.moreinterviewquestions.SortingElementsByFrequency;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class SortingElementsByFrequencyTest {

    @Test
    public void testGetElementsWithFrequency() {
        SortingElementsByFrequency elements = new SortingElementsByFrequency();
        Map<Integer, Integer> elementsWithFrequency = new HashMap<>();
        elementsWithFrequency.put(5, 1);
        elementsWithFrequency.put(9, 3);
        elementsWithFrequency.put(4, 1);

        Assertions.assertThat(elements.getElementsWithFrequency
                 (new int[] {9, 9, 9, 5, 4})).containsAllEntriesOf(elementsWithFrequency);
    }

    @Test
    public void printElementsFromHighToLowFrequency() {
        Map<Integer, Integer> elementsWithFrequency = new HashMap<>();
        elementsWithFrequency.put(5, 1);
        elementsWithFrequency.put(9, 3);
        elementsWithFrequency.put(4, 1);
        SortingElementsByFrequency elements = new SortingElementsByFrequency();

        elements.printElementsFromHighToLowFrequency(elementsWithFrequency);
    }

    @Test
    public void testPrintSortedElementsByFrequency() {
        SortingElementsByFrequency elements = new SortingElementsByFrequency();
        elements.printSortedElementsByFrequency(new int[] {5, 2, 1, 2, 5, 8});
    }
}