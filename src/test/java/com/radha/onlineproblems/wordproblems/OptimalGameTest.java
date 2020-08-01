package com.radha.onlineproblems.wordproblems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OptimalGameTest {

    @Test
    public void getWinner() {
        OptimalGame optimalGame = new OptimalGame();
        assertThat(optimalGame.getWinner(3,"101")).isEqualTo("John");
        assertThat(optimalGame.getWinner(5,"11010")).isEqualTo("Joe");
    }
}