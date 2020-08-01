package com.radha.onlineproblems.moreinterviewquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SortingElementsByFrequency {
    void printElementsFromHighToLowFrequency (Map<Integer, Integer>
                                                      elementsWithFrequency) {
        elementsWithFrequency.entrySet()
                .stream()
                .sorted((entry1, entry2) -> {
                    if (entry1.getValue().equals(entry2.getValue())) {
                        return entry1.getKey().compareTo(entry2.getKey());
                    }
                    return - entry1.getValue().compareTo(entry2.getValue()) ;
                });
               /* .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach((entry) -> System.out.println(entry.getKey()));*/
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
