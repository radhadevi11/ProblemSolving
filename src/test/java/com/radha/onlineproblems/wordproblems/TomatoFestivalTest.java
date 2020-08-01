package com.radha.onlineproblems.wordproblems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TomatoFestivalTest {

    @Test
    public void getNoOfWaysToChangeNoOfTomatoesWithMaxNum() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.
                getNoOfWaysToChangeNoOfTomatoesWithnoOfDigits(8)).isEqualTo(33322L);
    }
    @Test
    public void getNoOfWaysToChangeNoOfTomatoesWithMaxNum5Digits() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.
                getNoOfWaysToChangeNoOfTomatoesWithnoOfDigits(10)).isEqualTo(3332222L);
    }

    @Test
    public void getNoOfWaysToChangeNoOfTomatoesWithMaxNum12Digits() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.
                getNoOfWaysToChangeNoOfTomatoesWithnoOfDigits(4)).isEqualTo(3);
    }

    @Test
    public void getNoOfWaysToChangeNoOfTomatoes() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.
                getNoOfWaysToChangeNoOfTomatoes("3012", 1)).isEqualTo(4);
    }

    @Test
    public void getNoOfWaysToChangeNoOfTomatoes5Digits() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.
                getNoOfWaysToChangeNoOfTomatoes("55555", 2)).isEqualTo(3332223);
    }
    @Test
    public void getNoOfWaysToChangeNoOfTomatoes12Digits() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.
                getNoOfWaysToChangeNoOfTomatoes("3012", 3)).isEqualTo(333222260);
    }



    @Test
    public void concatenateMwithKTimes() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.concatenateMwithKTimes("3012", 1)).isEqualTo("3012");
    }

    @Test
    public void concatenateMwith3Times() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.concatenateMwithKTimes("3012", 3)).isEqualTo("301230123012");
    }

    @Test
    public void testIsValueConvertableWithLeastNumString() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.isValueConvertable("3001", "12341234")).isEqualTo(false);
    }
    @Test
    public void testIsValueConvertableWithRepeatedString() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.isValueConvertable("30013001", "12341234")).isEqualTo(false);
    }
    @Test
    public void testIsValueConvertableWithRepeatedStringInPlace() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.isValueConvertable("12345678", "12341234")).isEqualTo(true);
    }

    @Test
    public void testIsValueConvertableRepetedDigitInNumString() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.isValueConvertable("99033", "99456")).isEqualTo(true);
    }

    @Test
    public void testIsValueConvertableRepetedDigitInNumString2() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.isValueConvertable("6002", "9841")).isEqualTo(true);
    }

    @Test
    public void testGetValidNoOfWaysToChangeNoOfTomatoesWithNoOfDigits() {
        TomatoFestival tomatoFestival = new TomatoFestival();
        assertThat(tomatoFestival.getValidNoOfWaysToChangeNoOfTomatoesWithNoOfDigits(3, "9841")).isEqualTo(3);
    }
}