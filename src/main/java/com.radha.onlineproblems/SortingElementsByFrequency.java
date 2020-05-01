package com.radha.onlineproblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortingElementsByFrequency {
    void printElementsFromHighToLowFrequency (Map<Integer, Integer>
                                                      elementsWithFrequency) {
        elementsWithFrequency.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach((entry) -> System.out.println(entry.getKey()));
    }

    Map<Integer, Integer> getElementsWithFrequency (int[] elements) {
        Map<Integer, Integer>  elementsWithFrequency = new HashMap<>();
        Arrays.stream(elements)
                .forEach((element) -> {
                    if(elementsWithFrequency.containsKey(element)) {
                        elementsWithFrequency.replace(element,
                                elementsWithFrequency.get(element) + 1);
                    }
                    elementsWithFrequency.putIfAbsent(element, 1);

                });
        return elementsWithFrequency;
    }

    void printSortedElementsByFrequency (int[] elements) {
        printElementsFromHighToLowFrequency(getElementsWithFrequency(elements));
    }
}
