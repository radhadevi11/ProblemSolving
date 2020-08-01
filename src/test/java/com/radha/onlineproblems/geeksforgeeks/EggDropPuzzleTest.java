package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EggDropPuzzleTest {

    @Test
    public void getNumberOfAttempts() {
        EggDropPuzzle eggDropPuzzle = new EggDropPuzzle();
        assertThat(eggDropPuzzle.getNumberOfAttempts(2, 10)).isEqualTo(4);
    }

    @Test
    public void getNumberOfAttemptsAlreadyReachesLastFloor() {
        EggDropPuzzle eggDropPuzzle = new EggDropPuzzle();
        assertThat(eggDropPuzzle.getNumberOfAttempts(5, 10)).isEqualTo(3);
    }

    @Test
    public void getLastFloorUntilAllEggBreaks() {
        EggDropPuzzle eggDropPuzzle = new EggDropPuzzle();
        assertThat(eggDropPuzzle.getLastFloorUntilAllEggBreaks(1, 10)).isEqualTo(5);
    }

    @Test
    public void getLastFloorUntilAllEggBreaksReachesLastFloor() {
        EggDropPuzzle eggDropPuzzle = new EggDropPuzzle();
        assertThat(eggDropPuzzle.getLastFloorUntilAllEggBreaks(3, 10)).isEqualTo(1);
    }
}