package com.radha.onlineproblems.paypal;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class AppleOrangeTest {

    @Test
    public void printNoOfPossibleAppleAndOrange() {
        AppleOrange appleOrange = new AppleOrange();
        appleOrange.printNoOfPossibleAppleAndOrange(new int[] {-2, 2, 1}, new int[] {5, -6}, 7, 11, 5, 15);
    }

    @Test
    public void getNoOfPossibleFruits() {
        AppleOrange appleOrange = new AppleOrange();
        Assertions.assertThat(appleOrange.getNoOfPossibleFruits(new int[] {-2, 2, 1}, 7, 11,5)).isEqualTo(1);
    }

    @Test
    public void isInRange() {
        AppleOrange appleOrange = new AppleOrange();
        Assertions.assertThat(appleOrange.isInRange(10, 7, 11,5)).isFalse();
    }
}