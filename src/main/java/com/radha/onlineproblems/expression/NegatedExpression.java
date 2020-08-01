package com.radha.onlineproblems.expression;

import java.util.Objects;

public class NegatedExpression extends AbstractExpression{
    private Expression expression;

    public NegatedExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NegatedExpression)) return false;
        NegatedExpression that = (NegatedExpression) o;
        return expression.equals(that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression);
    }

    @Override
    public String toString() {
        return "-" + expression ;
    }
}
