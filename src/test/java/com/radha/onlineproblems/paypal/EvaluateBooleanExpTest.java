package com.radha.onlineproblems.paypal;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EvaluateBooleanExpTest {

    @Test
    public void getEvaluatedResult() {
        EvaluateBooleanExp evaluateBooleanExp = new EvaluateBooleanExp();
        assertThat(evaluateBooleanExp.getEvaluatedResult("1A0B1")).isEqualTo(1);
    }
    @Test
    public void getEvaluatedResult2() {
        EvaluateBooleanExp evaluateBooleanExp = new EvaluateBooleanExp();
        assertThat(evaluateBooleanExp.getEvaluatedResult("1C1B1B0A0")).isEqualTo(0);
    }

    @Test
    public void doLogicalOperation() {
        EvaluateBooleanExp evaluateBooleanExp = new EvaluateBooleanExp();
        assertThat(evaluateBooleanExp.doLogicalOperation('A', 1, 0)).isEqualTo(0);
        assertThat(evaluateBooleanExp.doLogicalOperation('B', 1, 0)).isEqualTo(1);
        assertThat(evaluateBooleanExp.doLogicalOperation('C', 1, 0)).isEqualTo(1);
    }
}