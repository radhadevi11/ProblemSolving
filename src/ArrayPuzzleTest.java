import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Arrays;


public class ArrayPuzzleTest {
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
}