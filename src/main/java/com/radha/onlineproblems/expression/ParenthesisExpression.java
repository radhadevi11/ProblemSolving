package com.radha.onlineproblems.expression;

import java.util.Objects;

public class ParenthesisExpression extends AbstractExpression{
    private Expression expression;

    public ParenthesisExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParenthesisExpression)) return false;
        ParenthesisExpression that = (ParenthesisExpression) o;
        return Objects.equals(expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expression);
    }

    @Override
    public String toString() {
        return "(" + expression +
                ")";
    }
}
