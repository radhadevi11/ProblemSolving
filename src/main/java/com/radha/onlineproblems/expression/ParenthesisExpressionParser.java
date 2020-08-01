package com.radha.onlineproblems.expression;

public class ParenthesisExpressionParser implements ExpressionParser<ParenthesisExpression> {


    @Override
    public ParenthesisExpression parse(String s, int startingPos) throws InvalidExpressionException {
        //if it does not start with open paren, then return null
        //otherwise, get the string within the close paren
        //see if that string is an abstract expression
        AbstractExpressionParser abstractExpressionParser = new AbstractExpressionParser();
        if (s.charAt(startingPos) == '(') {
            int closeParenPos = s.indexOf(')', startingPos+1);
            Expression expression = abstractExpressionParser.parse(s.substring(startingPos + 1, closeParenPos));
            return new ParenthesisExpression(expression);
        }
        return null;
    }
}
