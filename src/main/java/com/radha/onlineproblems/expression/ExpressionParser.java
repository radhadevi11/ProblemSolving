package com.radha.onlineproblems.expression;

public interface ExpressionParser<T extends Expression> {
    T parse(String s, int startingPos) throws InvalidExpressionException;
    default T parse(String s) throws InvalidExpressionException {
        return parse(s, 0);
    }
}
