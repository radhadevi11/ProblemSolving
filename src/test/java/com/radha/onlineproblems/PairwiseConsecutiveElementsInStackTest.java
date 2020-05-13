package com.radha.onlineproblems;

import org.apache.commons.lang3.mutable.MutableBoolean;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PairwiseConsecutiveElementsInStackTest {



    @Test
    public void testPopulateEvenPairDifferencesIsOne() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        List<Integer> evenPAirDifferences = new ArrayList<>(Arrays.asList(2, 5));
        Stack<Integer> numbers = new Stack<>();
        numbers.push(2);
        numbers.push(1);

       elements.findDifferenceAddToPairDiff(evenPAirDifferences, 2, 1);

        assertThat(evenPAirDifferences).containsExactly(2, 5, 1);

    }

    @Test
    public void testPopulateEvenPairDifferencesIsNotOne() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        List<Integer> evenPAirDifferences = new ArrayList<>(Arrays.asList(2, 5));
        Stack<Integer> numbers = new Stack<>();
        numbers.push(2);
        numbers.push(1);

        elements.findDifferenceAddToPairDiff(evenPAirDifferences, 5, 1);

        assertThat(evenPAirDifferences).containsExactly(2, 5, 4);

    }

    @Test
    public void populateOddPairDifferencesIsOne() {

        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        List<Integer> oddPairDifferences = new ArrayList<>(Arrays.asList(2, 5));
        Stack<Integer> numbers = new Stack<>();
        numbers.push(2);
        numbers.push(1);

       elements.findDifferenceAddToPairDiff(oddPairDifferences, 2, 1);

        assertThat(oddPairDifferences).containsExactly(2, 5, 1);
    }

    @Test
    public void populateOddPairDifferencesIsNotOne() {

        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        List<Integer> oddPairDifferences = new ArrayList<>(Arrays.asList(2, 5));
        Stack<Integer> numbers = new Stack<>();
        numbers.push(2);
        numbers.push(1);

        elements.findDifferenceAddToPairDiff(oddPairDifferences, 5, 1);

        assertThat(oddPairDifferences).containsExactly(2, 5, 4);
    }

    @Test
    public void testGetPairwiseConsecutiveDifferenceListWithEvenNoOfElements() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);

        assertThat(elements.getPairwiseConsecutiveDifferenceList(numbers)).containsExactly(1, 1);

    }

    @Test
    public void testGetPairwiseConsecutiveDifferenceListWithOddNoOfElements() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(5);
        numbers.push(10);
        numbers.push(8);
        numbers.push(5);

        assertThat(elements.getPairwiseConsecutiveDifferenceList(numbers)).containsExactly(2, 4);

    }

    @Test
    public void testGetPairwiseConsecutiveDifferenceListWithOneElement() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);

        assertThatThrownBy(() -> elements.getPairwiseConsecutiveDifferenceList(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("can not find pair difference with one element");

    }

    @Test
    public void testGetPairwiseConsecutiveDifferenceListWithEmptyStack() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();

        assertThatThrownBy(() -> elements.getPairwiseConsecutiveDifferenceList(numbers))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("can not find pair difference with empty stack");

    }

    @Test
    public void testisPairWiseConsecutive() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);

        assertThat(elements.isPairWiseConsecutive(numbers)).isEqualTo(true);
    }

    @Test
    public void testIsPairWiseNonConsecutive() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(5);
        numbers.push(3);
        numbers.push(4);

        assertThat(elements.isPairWiseConsecutive(numbers)).isEqualTo(false);
    }

    @Test
    public void testGetPoppedElementForNonConsecutivePair() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        MutableBoolean isPairWiseConsecutive = new MutableBoolean(true);
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);

        assertThat(elements.getPoppedElement(5, numbers, isPairWiseConsecutive)).isEqualTo(1);
        assertThat(isPairWiseConsecutive).isEqualTo(new MutableBoolean(false));
    }

    @Test
    public void testGetPoppedElementForConsecutivePair() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        MutableBoolean isPairWiseConsecutive = new MutableBoolean(true);
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);

        assertThat(elements.getPoppedElement(2, numbers, isPairWiseConsecutive)).isEqualTo(1);
        assertThat(isPairWiseConsecutive).isEqualTo(new MutableBoolean(true));
    }

    @Test
    public void testIsPairWiseConsecutiveWithoutUsingListForEvenNoOfPairs() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);

        assertThat(elements.isPairWiseConsecutiveWithoutUsingList(numbers)).isEqualTo(true);
    }

    @Test
    public void testNotPairWiseConsecutiveWithoutUsingListForEvenNoOfPairs() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(5);
        numbers.push(3);
        numbers.push(4);

        assertThat(elements.isPairWiseConsecutiveWithoutUsingList(numbers)).isEqualTo(false);
    }

    @Test
    public void testNotPairWiseConsecutiveWithoutUsingListForOddNoOfPairs() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(5);
        numbers.push(3);
        numbers.push(4);
        numbers.push(8);

        assertThat(elements.isPairWiseConsecutiveWithoutUsingList(numbers)).isEqualTo(false);
    }

    @Test
    public void testIsPairWiseConsecutiveWithoutUsingListForOddNoOfPairs() {
        PairwiseConsecutiveElementsInStack elements = new PairwiseConsecutiveElementsInStack();
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(8);

        assertThat(elements.isPairWiseConsecutiveWithoutUsingList(numbers)).isEqualTo(true);
    }
}