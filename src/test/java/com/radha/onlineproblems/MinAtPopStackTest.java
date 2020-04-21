package com.radha.onlineproblems;

import com.radha.onlineproblems.MinAtPopStack;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class MinAtPopStackTest {

    @Test
    public void testPutElementInTheCorrectPositionInsertInTheFirst() {
        /*
        possibleMinimumList => [0, 0, 1]
         */
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);

        min.putElementInTheCorrectPosition(0);

        assertThat(min.getPossibleMinimumList()).containsExactly(0,1);

    }

    @Test
    public void testPutElementInTheCorrectPositionInsertInTheMiddle() {
        /*
        possibleMinimumList => [0, 0, 1]
         */
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(3);

        min.putElementInTheCorrectPosition(2);

        assertThat(min.getPossibleMinimumList()).containsExactly(1, 2, 3);

    }




    @Test
    public void testInsertElementInTheFirst() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);

        min.insertElement(0, 0, min.possibleMinimumList.size()-1);

        assertThat(min.getPossibleMinimumList()).containsExactly(0, 1);

    }

    @Test
    public void testInsertElementInTheLast() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(2);

        min.insertElement(3, 0, min.possibleMinimumList.size()-1);

        assertThat(min.getPossibleMinimumList()).containsExactly(1, 2, 3);

    }

    @Test
    public void testInsertElementInTheMiddle() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(2);
        min.possibleMinimumList.add(4);

        min.insertElement(3, 0, min.possibleMinimumList.size()-1);

        assertThat(min.getPossibleMinimumList()).containsExactly(1, 2, 3, 4);

    }

    @Test
    public void testInsertExistingElementInTheMiddle() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(2);
        min.possibleMinimumList.add(3);
        min.possibleMinimumList.add(4);

        min.insertElement(3, 0, min.possibleMinimumList.size()-1);

        assertThat(min.getPossibleMinimumList()).containsExactly(1, 2, 3, 3, 4);

    }

    @Test
    public void testPushInEmptyStack() {
        MinAtPopStack min = new MinAtPopStack();
        min.push(5);
        assertThat(min.numbers).containsExactly(5);
        assertThat(min.possibleMinimumList).containsExactly(5);
    }

    @Test
    public void testPushNonEmptyStack() {
        MinAtPopStack min = new MinAtPopStack();
        min.push(5);
        min.push(6);
        assertThat(min.numbers).containsExactly(5, 6);
        assertThat(min.possibleMinimumList).containsExactly(5);
    }

    @Test
    public void testPushNonEmptyStackWithSmallestElement() {
        MinAtPopStack min = new MinAtPopStack();
        min.push(5);
        min.push(6);
        min.push(1);
        assertThat(min.numbers).containsExactly(5, 6, 1);
        assertThat(min.possibleMinimumList).containsExactly(1, 5);
    }

    @Test
    public void testPrintMinAtPop () {
        MinAtPopStack min = new MinAtPopStack();
        min.push(5);
        min.push(6);
        min.push(1);

        min.printMinAtPop();
        min.printMinAtPop();
        min.printMinAtPop();

    }

    @Test
    public void testPrintMinAtPopLargeStack () {
        MinAtPopStack min = new MinAtPopStack();
        min.push(43);
        min.push(6);
        min.push(1);
        min.push(2);
        min.push(5);
        min.push(1);

        min.printMinAtPop();
        min.printMinAtPop();
        min.printMinAtPop();
        min.printMinAtPop();
        min.printMinAtPop();
        min.printMinAtPop();

    }

    @Test
    public void testPrintMinAtPopInEmptyStack () {
        MinAtPopStack min = new MinAtPopStack();

        assertThatThrownBy(() ->  min.printMinAtPop())
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Stack is empty ");

    }

    @Test
    public void testGetPositionToInsertElementGreaterThanMid() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(3);
        min.possibleMinimumList.add(6);

        assertThat(min.getPositionToInsertElement(5)).isEqualTo(2);
    }

    @Test
    public void testGetPositionToInsertElementLessThanMid() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(3);
        min.possibleMinimumList.add(6);

        assertThat(min.getPositionToInsertElement(2)).isEqualTo(1);
    }

    @Test
    public void testGetPositionToInsertElementEqualToMid() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(3);
        min.possibleMinimumList.add(6);

        assertThat(min.getPositionToInsertElement(3)).isEqualTo(2);
    }

    @Test
    public void testGetPositionToInsertElementInTheBegining() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(3);
        min.possibleMinimumList.add(6);

        assertThat(min.getPositionToInsertElement(0)).isEqualTo(0);
    }

    @Test
    public void testGetPositionToInsertElementInTheEnd() {
        MinAtPopStack min = new MinAtPopStack();
        min.possibleMinimumList.add(1);
        min.possibleMinimumList.add(3);
        min.possibleMinimumList.add(6);

        assertThat(min.getPositionToInsertElement(7)).isEqualTo(3);
    }




}