package com.radha.onlineproblems.expression;

public class SimpleExpressionParser implements ExpressionParser<SimpleExpression>{
    @Override
    public SimpleExpression parse(String s, int startingPos) {
        //it should start with a-z
        char c = s.charAt(startingPos);
        if (c >= 'a' && c <= 'z') {
            return new SimpleExpression(c);
        }
        return null;
    }
}
