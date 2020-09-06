package com.radha.onlineproblems.paypal;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinsRequiredTest {

    @Test
    public void getMinNoOfCoins() {
        CoinsRequired coinsRequired = new CoinsRequired();
        int[] coins = {25, 10, 5};
        assertThat(coinsRequired.getMinNoOfCoins(coins, 30, 0, Arrays.stream(coins).max().getAsInt())).isEqualTo(2);
    }
    @Test
    public void getMinNoOfCoins2() {
        CoinsRequired coinsRequired = new CoinsRequired();
        int[] coins = {9, 6, 5, 1};
        assertThat(coinsRequired.getMinNoOfCoins(coins, 11, 0, Arrays.stream(coins).max().getAsInt())).isEqualTo(3);
    }
    @Test
    public void getMinNoOfCoins3() {
        CoinsRequired coinsRequired = new CoinsRequired();
        int[] coins = {9, 6, 5, 3};
        assertThat(coinsRequired.getMinNoOfCoins(coins, 11, 0, Arrays.stream(coins).max().getAsInt())).isEqualTo(3);
    }

    @Test
    public void findNextMaximum() {
        CoinsRequired coinsRequired = new CoinsRequired();
        assertThat(coinsRequired.findNextMaximum(new int[] {20, 15, 6, 18}, 18)).isEqualTo(15);
    }
    @Test
    public void findNoNextMaximum() {
        CoinsRequired coinsRequired = new CoinsRequired();
        assertThat(coinsRequired.findNextMaximum(new int[] {20, 15, 6, 18}, 6)).isEqualTo(-2147483648);
    }
}