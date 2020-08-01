package com.radha.onlineproblems.geeksforgeeks;

import java.util.Collections;
import java.util.stream.Collectors;

public class StringSort {
    String sortDescendingOrder(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
