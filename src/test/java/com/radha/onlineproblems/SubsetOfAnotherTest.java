package com.radha.onlineproblems;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SubsetOfAnotherTest {

    @Test
    public void testIsSubset() {
        SubsetOfAnother subset = new SubsetOfAnother();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(1, 1);
        numMap.put(2, 2);
        numMap.put(7, 7);
        numMap.put(20, 20);
        numMap.put(3, 3);
        numMap.put(6, 6);
        int[] b = new int[]{1, 3, 20};

        boolean actual = subset.isSubset(numMap, b);

        assertEquals(actual, true);
    }

    @Test
    public void testNotIsSubset() {
        SubsetOfAnother subset = new SubsetOfAnother();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(1, 1);
        numMap.put(2, 2);
        numMap.put(7, 7);
        numMap.put(20, 20);
        numMap.put(3, 3);
        numMap.put(6, 6);
        int[] b = new int[]{1, 3, 20, 15};

        boolean actual = subset.isSubset(numMap, b);

        assertEquals(actual, false);
    }
}
