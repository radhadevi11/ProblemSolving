package com.radha.onlineproblems.codevita;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class BookArrangementsTest {

    @Test
    public void getPossibleArrangements() {
        BookArrangements bookArrangements = new BookArrangements();
        Assertions.assertThat(bookArrangements.getPossibleArrangements(4)).isEqualTo(9);
    }
    @Test
    public void getPossibleArrangements2() {
        BookArrangements bookArrangements = new BookArrangements();
        Assertions.assertThat(bookArrangements.getPossibleArrangements(6)).isEqualTo(265);
    }
}