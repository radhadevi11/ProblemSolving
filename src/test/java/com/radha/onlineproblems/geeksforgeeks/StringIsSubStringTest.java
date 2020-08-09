package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringIsSubStringTest {

    @Test
    public void getIndexOfXInS() {
        StringIsSubString stringIsSubString = new StringIsSubString();
        assertThat(stringIsSubString.getIndexOfXInS("abc", "bd")).isEqualTo(-1);
    }
    @Test
    public void getIndexOfXInS2() {
        StringIsSubString stringIsSubString = new StringIsSubString();
        assertThat(stringIsSubString.getIndexOfXInS("geeksforgeeks", "for")).isEqualTo(5);
    }
}