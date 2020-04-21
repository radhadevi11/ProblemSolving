package com.radha.onlineproblems;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KthSmallestTest {

    @Test
    public void testIsExpectedMinWithEmptyMap() {
        KthSmallest kthSmallest = new KthSmallest();
        Map<Integer, Integer> numberMap = new HashMap<>();

        boolean actual = kthSmallest.isExpectedMin(numberMap, 5, Integer.MAX_VALUE);

        assertEquals(true, actual);


    }

    @Test
    public void testIsExpectedMinWithNonEmptyMap() {
        KthSmallest kthSmallest = new KthSmallest();
        Map<Integer, Integer> numberMap = new HashMap<>();
        numberMap.put(5, 5);

        boolean actual = kthSmallest.isExpectedMin(numberMap, 5, Integer.MAX_VALUE);

        assertEquals(false, actual);


    }

    @Test
    public void testIsExpectedMinWithGreaterThanMin() {
        KthSmallest kthSmallest = new KthSmallest();
        Map<Integer, Integer> numberMap = new HashMap<>();
        numberMap.put(2, 2);

        boolean actual = kthSmallest.isExpectedMin(numberMap, 5, 4);

        assertEquals(false, actual);


    }

    @Test
    public void testIsExpectedMinWithLessThanMin() {
        KthSmallest kthSmallest = new KthSmallest();
        Map<Integer, Integer> numberMap = new HashMap<>();
        numberMap.put(2, 2);

        boolean actual = kthSmallest.isExpectedMin(numberMap, 3, 4);

        assertEquals(true, actual);


    }

    @Test
    public void testFindMinExceptInTheMapWithEmptyMap() {
        KthSmallest kthSmallest = new KthSmallest();
        Map<Integer, Integer> numberMap = new HashMap<>();
        int[] numbers = new int[]{5, 4 , 7, 2, 8, 1};

        int actual = kthSmallest.findMinExceptInTheMap(numberMap, numbers);

        assertEquals(1, actual);
    }

    @Test
    public void testFindMinExceptInTheMapWithNonEmptyMap() {
        KthSmallest kthSmallest = new KthSmallest();
        Map<Integer, Integer> numberMap = new HashMap<>();
        numberMap.put(1, 1);
        int[] numbers = new int[]{5, 4 , 7, 2, 8, 1};

        int actual = kthSmallest.findMinExceptInTheMap(numberMap, numbers);

        assertEquals(2, actual);
    }

    @Test
    public void testFindSmallest2() {
       KthSmallest kthSmallest = new KthSmallest();
        int[] numbers = new int[]{5, 4 , 7, 2, 8, 1};

        int actual = kthSmallest.findKthSmallest(3, numbers);

        assertEquals(4, actual);
    }
}
