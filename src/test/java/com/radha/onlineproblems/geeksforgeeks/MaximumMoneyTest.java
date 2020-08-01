package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaximumMoneyTest {

    @Test
    public void testGetMaximumMoneyWithOddNoOfHouses() {
        MaximumMoney maximumMoney = new MaximumMoney();
        assertThat(maximumMoney.getMaximumMoney(5, 5)).isEqualTo(15);
        assertThat(maximumMoney.getMaximumMoney(15, 2)).isEqualTo(16);
    }

    @Test
    public void testGetMaximumMoneyWithEvenNoOfHouses() {
        MaximumMoney maximumMoney = new MaximumMoney();
        assertThat(maximumMoney.getMaximumMoney(8, 5)).isEqualTo(20);
        assertThat(maximumMoney.getMaximumMoney(16, 2)).isEqualTo(16);
    }
    @Test
    public void testGetMaximumMoneyWithOneHouse() {
        MaximumMoney maximumMoney = new MaximumMoney();
        assertThat(maximumMoney.getMaximumMoney(1, 5)).isEqualTo(5);
    }
}