package com.radha.onlineproblems.expression;

public class BinaryExpressionParser implements ExpressionParser<BinaryExpression> {
    @Override
    public BinaryExpression parse(String s, int startingPos) throws InvalidExpressionException {
        //a + b + c
        //extract string till the first operator char
        //see if that string is a negatedExpr
        //if not see if it is a para expre
        //if not see if it is a simple exp
        //make that the left expression


     /*   leftExpression  = handleNegatedExpression(leftStr);
        if(leftExpression == null) {
            leftExpression = handleParaExpression(s, startingPos);
            if(leftExpression == null) {
                leftExpression = handleSimpleExpression(s, startingPos);
            }
        }*/
        AbstractExpressionParser abstractExpressionParser = new AbstractExpressionParser();
        int firstOperatorCharPosition  = getTillFirstOperatorCharPosition(startingPos, s);
        if(firstOperatorCharPosition == -1) {
            return null;
        }
        String leftStr = s.substring(startingPos, firstOperatorCharPosition);
        Expression leftExpression;
        leftExpression = abstractExpressionParser.parse(leftStr);
        String rightStr = s.substring(firstOperatorCharPosition+1);
        Expression rightExpression = abstractExpressionParser.parse(rightStr);
        char operator = s.charAt(firstOperatorCharPosition);
        return new BinaryExpression(leftExpression, operator, rightExpression);
        //extract string to the right of operator char
        //see if it is any expression and assign to right expression
    }

      int getTillFirstOperatorCharPosition(int startingPos, String s) {
        for (int i = startingPos; i < s.length() ; i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                return i;
            }
        }
        return -1;
    }
}
