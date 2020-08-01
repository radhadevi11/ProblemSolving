package com.radha.onlineproblems.bytes;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringRotationTest {

    @Test
    public void isRotationOfGiven() {
        StringRotation rotation = new StringRotation();
        Assertions.assertThat(rotation.isRotationOfGiven("apple", "leapp"))
                .isEqualTo(true);
    }
    @Test
    public void isRotationOfGivenLengthNotEqual() {
        StringRotation rotation = new StringRotation();
        Assertions.assertThat(rotation.isRotationOfGiven("apple", "leappl"))
                .isEqualTo(false);
    }

    @Test
    public void isRotationOfGivenLengthNotRotationString() {
        StringRotation rotation = new StringRotation();
        Assertions.assertThat(rotation.isRotationOfGiven("apple", "lleap"))
                .isEqualTo(false);
    }
}