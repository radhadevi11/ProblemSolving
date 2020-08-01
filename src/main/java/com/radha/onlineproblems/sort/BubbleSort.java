package com.radha.onlineproblems.sort;

public class BubbleSort {
    void swap(int[] elements, int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
    void sort(int[] elements) {
        for(int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[i] > elements[j]) {
                    swap(elements, i, j);
                }
            }
        }
    }
    void printBubbleSortedArray(int[] elements) {
        sort(elements);
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }
}
