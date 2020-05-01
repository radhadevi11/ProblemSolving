package com.radha.onlineproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class RotateArrayByNElement {

    List<Integer> getRotatedList(int noOfRotation, int[] elements) {
        List<Integer> rotatedList = new ArrayList<>();
        IntStream.range(noOfRotation, elements.length)
                .forEach((position) -> rotatedList.add(elements[position]));

        IntStream.range(0, noOfRotation)
                .forEach((position) -> rotatedList.add(elements[position]));
        return rotatedList;
    }

    void printRotatedArray (int noOfRotation, int[] elements) {
        getRotatedList(noOfRotation, elements).stream()
                .forEach(System.out::println);
    }
}

