package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;

public class SnakeLadderTest {

    @Test
    public void getNoOfThrows() {
    }

    @Test
    public void testGetMaxSoFarReach30() {
        SnakeLadder ladder = new SnakeLadder();
        assertThat(ladder.getMaximumPossiblePosition(new HashMap<>(), 28)).isEqualTo(30);
    }

    @Test
    public void testGetMaxSoFarWithoutLadder() {
        SnakeLadder ladder = new SnakeLadder();
        assertThat(ladder.getMaximumPossiblePosition(new HashMap<>(), 20)).isEqualTo(26);
    }

    @Test
    public void testGetMaxSoFarWithLadder() {
        SnakeLadder ladder = new SnakeLadder();
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        snakeLadderPosition.put(20, 29);
        assertThat(ladder.getMaximumPossiblePosition(snakeLadderPosition, 18)).isEqualTo(29);
    }

    @Test
    public void testGetMaxSoFarWithSnake() {
        SnakeLadder ladder = new SnakeLadder();
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        snakeLadderPosition.put(20, 10);
        assertThat(ladder.getMaximumPossiblePosition(snakeLadderPosition, 18)).isEqualTo(24);
    }

    @Test
    public void testGetMaxSoFarWithSnakeAtEnd() {
        SnakeLadder ladder = new SnakeLadder();
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        snakeLadderPosition.put(20, 10);
        snakeLadderPosition.put(24, 8);
        assertThat(ladder.getMaximumPossiblePosition(snakeLadderPosition, 18)).isEqualTo(23);
    }

    @Test
    public void testGetNoOfThrowsWithNoSnakesAndLadder() {
        SnakeLadder ladder = new SnakeLadder();
        assertThat(ladder.getNoOfThrows(new HashMap<>(), 1)).isEqualTo(5);
    }

    @Test
    public void testGetNoOfThrowsWithLadder() {
        SnakeLadder ladder = new SnakeLadder();
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        snakeLadderPosition.put(11, 26);
        snakeLadderPosition.put(3, 22);
        snakeLadderPosition.put(5, 8);
        snakeLadderPosition.put(20, 29);

        assertThat(ladder.getNoOfThrows(snakeLadderPosition, 1)).isEqualTo(3);
    }

    @Test
    public void testGetNoOfThrowsWithLadderAndSnake() {
        SnakeLadder ladder = new SnakeLadder();
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        snakeLadderPosition.put(11, 26);
        snakeLadderPosition.put(3, 22);
        snakeLadderPosition.put(5, 8);
        snakeLadderPosition.put(20, 29);
        snakeLadderPosition.put(27, 1);
        snakeLadderPosition.put(21, 9);

        assertThat(ladder.getNoOfThrows(snakeLadderPosition, 1)).isEqualTo(3);
    }

    @Test
    public void testGetNoOfThrowsWithTwoLadderInSameRow() {
        SnakeLadder ladder = new SnakeLadder();
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        snakeLadderPosition.put(11, 26);
        snakeLadderPosition.put(3, 22);
        snakeLadderPosition.put(5, 8);
        snakeLadderPosition.put(20, 29);
        snakeLadderPosition.put(27, 1);
        snakeLadderPosition.put(21, 9);
        snakeLadderPosition.put(23, 28);
        snakeLadderPosition.put(25, 30);

        assertThat(ladder.getNoOfThrows(snakeLadderPosition, 1)).isEqualTo(2);
    }

}