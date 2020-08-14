package com.radha.onlineproblems.codevita;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class BankCompareTest {

    @Test
    public void calculateEMI() {
        BankCompare bankCompare = new BankCompare();
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        Assertions.assertThat(decimalFormat.format(bankCompare
                .calculateEMI(10000, Arrays.asList(5, 5), Arrays.asList(10.0, 11.0), 2)))
                .isEqualTo("120394.7");

    }

    @Test
     public void getTotalEMI() {
        BankCompare bankCompare = new BankCompare();
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        Assertions.assertThat(decimalFormat.format(bankCompare.getTotalEMI(100, 10, 1))).isEqualTo("176.1");
    }
}