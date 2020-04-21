package com.radha.onlineproblems;

import com.radha.onlineproblems.DetectUniqueCountOfNumbers;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class DetectUniqueCountOfNumbersTest {

    @Test
    public void hasUniqueOccurrence() {
        DetectUniqueCountOfNumbers countOfNumbers = new DetectUniqueCountOfNumbers();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(1, 2);
        numMap.put(2, 3);
        numMap.put(3, 4);

        boolean actual = countOfNumbers.hasUniqueOccurrence(numMap);

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void hasNoUniqueOccurrence() {
        DetectUniqueCountOfNumbers countOfNumbers = new DetectUniqueCountOfNumbers();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(1, 2);
        numMap.put(2, 3);
        numMap.put(3, 2);

        boolean actual = countOfNumbers.hasUniqueOccurrence(numMap);

        assertThat(actual).isEqualTo(false);
    }

    @Test
    public void hasUniqueOccurrenceInTheArray() {
        DetectUniqueCountOfNumbers countOfNumbers = new DetectUniqueCountOfNumbers();
        int[] numbers = new int[]{1, 2, 2, 1, 1, 3};

        boolean actual = countOfNumbers.hasUniqueOccurrenceInTheArray(numbers);

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void hasNoUniqueOccurrenceInTheArray() {
        DetectUniqueCountOfNumbers countOfNumbers = new DetectUniqueCountOfNumbers();
        int[] numbers = new int[]{1, 2, 2, 1, 1, 3, 4};

        boolean actual = countOfNumbers.hasUniqueOccurrenceInTheArray(numbers);

        assertThat(actual).isEqualTo(false);
    }
}
