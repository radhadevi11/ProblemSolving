package com.radha.onlineproblems.codevita;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CollectingCandiesTest {

    @Test
    public void getMinimumTime() {
        CollectingCandies candies = new CollectingCandies();
        Assertions.assertThat(candies.getMinimumTime(Arrays.asList(10, 20, 30, 40))).isEqualTo(190);
    }
}