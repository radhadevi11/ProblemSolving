package com.radha.onlineproblems.geeksforgeeks;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EquilibriumPointTest {

    @Test
    public void getEquilibriumPoint() {
        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        assertThat(equilibriumPoint.getEquilibriumPoint( new int[] {7, 2, 3, 4, 5}))
                .isEqualTo(3);
    }
    @Test
    public void getEquilibriumPointWith1Element() {
        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        assertThat(equilibriumPoint.getEquilibriumPoint( new int[] {7}))
                .isEqualTo(1);
    }

    @Test
    public void getNoEquilibriumPoint() {
        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        assertThat(equilibriumPoint.getEquilibriumPoint( new int[] {7,2,1,2}))
                .isEqualTo(-1);
    }

    @Test
    public void getSumOfElementsBeforeI() {
        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        assertThat(equilibriumPoint.getSumOfElements(0, 4, new int[] {1, 2, 3, 4, 5}))
                .isEqualTo(10);
    }

    @Test
    public void getSumOfElementsAfterI() {
        EquilibriumPoint equilibriumPoint = new EquilibriumPoint();
        assertThat(equilibriumPoint.getSumOfElements(2, 5, new int[] {1, 2, 3, 4, 5}))
                .isEqualTo(12);
    }
}