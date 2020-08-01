package com.radha.onlineproblems.moreinterviewquestions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OnesAndZerosTest {
    @Test
    public void testGetFirstIndexOfZero(){
        int[] a = new int[]{1,1,1,1,1,1,1,0,0,0,0};
        OnesAndZeros obj = new OnesAndZeros();

        int actual = obj.getFirstIndexOfZero(a.length, a);

        assertEquals(7, actual);


    }
    @Test
    public void testGetFirstIndexOfZeroWithNonZeroInput(){
        int[] a = new int[]{1,1,1,1,1,1,1};
        OnesAndZeros obj = new OnesAndZeros();

        int actual = obj.getFirstIndexOfZero(a.length, a);

        assertEquals(-1, actual);


    }

    @Test
    public void testGetFirstIndexOfZeroWithZeroInput(){
        int[] a = new int[]{0,0,0};
        OnesAndZeros obj = new OnesAndZeros();

        int actual = obj.getFirstIndexOfZero(a.length, a);

        assertEquals(0, actual);


    }

    @Test
    public void testGetFirstIndexOfZeroWithEmptyInput(){
        int[] a = new int[]{};
        OnesAndZeros obj = new OnesAndZeros();

        int actual = obj.getFirstIndexOfZero(a.length, a);

        assertEquals(-1, actual);


    }

    @Test
    public void testGetCountOfZero(){
        int[] a = new int[]{1,1,1,1,1,1,1,0,0,0,0};
        OnesAndZeros obj = new OnesAndZeros();

        int actual = obj.getCountOfZeros(a.length, a);

        assertEquals(4, actual);


    }

    @Test
    public void testGetCountOfZeroWithNonZeroInput(){
        int[] a = new int[]{1,1,1,1,1,1,1};
        OnesAndZeros obj = new OnesAndZeros();

        int actual = obj.getCountOfZeros(a.length, a);

        assertEquals(0, actual);


    }





}