package com.radha.onlineproblems.expression;

import java.util.Objects;

public class SimpleExpression extends AbstractExpression{
    private char variable;

    public SimpleExpression(char variable) {
        this.variable = variable;
    }

    public SimpleExpression(String expression, int startPosition) {
        this.variable = expression.charAt(startPosition);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleExpression)) return false;
        SimpleExpression that = (SimpleExpression) o;
        return variable == that.variable;
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable);
    }

    @Override
    public String toString() {
        return ""+ variable ;
    }
}
