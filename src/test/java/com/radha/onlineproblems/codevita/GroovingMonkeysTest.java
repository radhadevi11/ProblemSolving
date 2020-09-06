package com.radha.onlineproblems.codevita;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class GroovingMonkeysTest {

    @Test
    public void getTimeMonkeysToReachInitialPosition() {
        GroovingMonkeys groovingMonkeys = new GroovingMonkeys();
        Assertions.assertThat(groovingMonkeys.getTimeMonkeysToReachInitialPosition(Arrays.asList('A', 'B', 'C'),
                3,
                Arrays.asList(3, 2, 1))).isEqualTo(2);
    }

    @Test
    public void getMonkeyListAfterExchange() {
        GroovingMonkeys groovingMonkeys = new GroovingMonkeys();
        Assertions.assertThat(groovingMonkeys.getMonkeyListAfterExchange(Arrays.asList('A', 'B', 'C'),
                3,
                Arrays.asList(3, 2, 1))).containsExactly('C', 'B', 'A');
    }
}