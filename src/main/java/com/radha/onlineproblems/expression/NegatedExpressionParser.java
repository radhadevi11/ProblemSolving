package com.radha.onlineproblems.expression;

public class NegatedExpressionParser implements ExpressionParser<NegatedExpression>{
    private SimpleExpressionParser simpleExpressionParser = new SimpleExpressionParser();
    private ParenthesisExpressionParser parenthesisExpressionParser = new ParenthesisExpressionParser();
    @Override
    public NegatedExpression parse(String s, int startingPos) throws InvalidExpressionException {
         //if it does not start with minus, then return null
        //otherwise, see if it is followed by a paranthesisExpression
        //if not see if it is followed by a simpleExpression

        if (s.charAt(startingPos) == '-') {
            NegatedExpression result = handleParanExpression(s, startingPos);
            return  result == null? handleSimpleExpression(s, startingPos): result;
        }
        return null;
    }

    private  NegatedExpression handleParanExpression(String s, int startingPos) throws InvalidExpressionException {
        ParenthesisExpression paranExpression = parenthesisExpressionParser.parse(s, startingPos + 1);
        if (paranExpression == null) {
            return null;
        }
        return new NegatedExpression(paranExpression);
    }

    private  NegatedExpression handleSimpleExpression(String s, int startingPos) throws InvalidExpressionException {
        SimpleExpression simpleExpr = simpleExpressionParser.parse(s, startingPos + 1);
        if (simpleExpr == null) {
            throw new InvalidExpressionException(startingPos);
        }
        return  new NegatedExpression(simpleExpr);
    }
}
