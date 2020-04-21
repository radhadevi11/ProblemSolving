package com.radha.onlineproblems;

import static org.junit.Assert.*;

import com.radha.onlineproblems.ArrayPuzzle;
import org.junit.Test;


public class ArrayPuzzleTest {
    static
    {
        System.out.println("static block: Runs when class is loaded");
    }
    @Test
    public void testRemoveDuplicate(){
        int[] numbers = {1,2,5,2,1,3};
        int[] expected = {1,2,5,3};
        ArrayPuzzle arrayPuzzle = new ArrayPuzzle();

        int[] actual = arrayPuzzle.removeDuplicate(numbers);


        assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveDuplicate2() {
        int[] numbers = {1,2,2,5,2,1,3,3};
        int[] expected = {1,2,5,3};
        ArrayPuzzle arrayPuzzle = new ArrayPuzzle();

        int[] actual = arrayPuzzle.removeDuplicate2(numbers);


        assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveDuplicate2ForEmptyArray() {
        int[] numbers = {};
        int[] expected = {};
        ArrayPuzzle arrayPuzzle = new ArrayPuzzle();

        int[] actual = arrayPuzzle.removeDuplicate2(numbers);


        assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveDuplicateUsingMap() {
        int[] numbers = {1,2,2,5,2,1,3,3};
        int[] expected = {1,2,5,3};
        ArrayPuzzle arrayPuzzle = new ArrayPuzzle();

        int[] actual = arrayPuzzle.removeDuplicateUsingMap(numbers);
        System.out.println("length="+actual.length);
        for(int i : actual){
            System.out.println(i);
        }


        assertArrayEquals(expected, actual);
    }
}