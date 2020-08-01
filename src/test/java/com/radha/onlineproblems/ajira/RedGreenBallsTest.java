package com.radha.onlineproblems.ajira;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RedGreenBallsTest {
    @Test
    public void testIsGoodRowForBadRow(){
        String[][] balls = {{"G", "R"} ,{"R", "G"}};
        RedGreenBalls obj = new RedGreenBalls(2, balls);

        boolean actual = obj.isGoodRow(0);

        assertEquals(false, actual);

    }

    @Test
    public void testIsGoodRowForGoodRow(){
        String[][] balls = {{"G", "R"} ,{"R", "G"}};
        RedGreenBalls obj = new RedGreenBalls(2, balls);

        boolean actual = obj.isGoodRow(1);

        assertEquals(true, actual);

    }

    @Test
    public void testSwap(){
        String[][] balls = {{"G", "R"} ,{"R", "G"}};
        RedGreenBalls obj = new RedGreenBalls(2, balls);

        obj.swap(0,1);

        String[][] expected = {{"R", "G"} ,{ "G", "R"}};
        Assert.assertArrayEquals(expected, obj.balls);

    }

    @Test
    public void testMakeRowGoodForBadRow(){
        String[][] balls = {{"G", "R"} ,{"R", "G"}};
        RedGreenBalls obj = new RedGreenBalls(2, balls);

        int actual = obj.makeRowGood(0);

        assertEquals(1, actual);
    }
    @Test
    public void testMakeRowGoodForGoodRow(){
        String[][] balls = {{"G", "R"} ,{"R", "G"}};
        RedGreenBalls obj = new RedGreenBalls(2, balls);

        int actual = obj.makeRowGood(1);

        assertEquals(0, actual);
    }

    @Test
    public void testMakeRowGoodForBadArray(){
        String[][] balls = {{"R", "R", "R"} ,{"R", "R", "R"},{"R", "R", "R"}};
        RedGreenBalls obj = new RedGreenBalls(3, balls);

        int actual = obj.makeRowGood(0);

        assertEquals(-1, actual);
    }
}