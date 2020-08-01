package com.radha.onlineproblems.expression;

import java.util.Objects;

public class BinaryExpression extends AbstractExpression{
    private Expression leftExpression;
    private char operator;
    private Expression rightExpression;

    public BinaryExpression(Expression leftExpression, char operator, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.operator = operator;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BinaryExpression)) return false;
        BinaryExpression that = (BinaryExpression) o;
        return operator == that.operator &&
                leftExpression.equals(that.leftExpression) &&
                rightExpression.equals(that.rightExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftExpression, operator, rightExpression);
    }

    @Override
    public String toString() {
        return  ""+leftExpression +
                 operator +
                 rightExpression;
    }
}
