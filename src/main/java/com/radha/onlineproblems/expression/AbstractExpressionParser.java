package com.radha.onlineproblems.expression;

public class AbstractExpressionParser implements ExpressionParser<AbstractExpression>{

    private NegatedExpressionParser negatedExpressionParser = new NegatedExpressionParser();
    private ParenthesisExpressionParser parenthesisExpressionParser = new ParenthesisExpressionParser();
    private BinaryExpressionParser binaryExpressionParser = new BinaryExpressionParser();
    private SimpleExpressionParser simpleExpressionParser = new SimpleExpressionParser();

    @Override
    public AbstractExpression parse(String s, int startingPos) throws InvalidExpressionException {

         NegatedExpression negatedExpression = negatedExpressionParser.parse(s, 0);
        if(negatedExpression != null) {
            return negatedExpression;
        }
        ParenthesisExpression parenthesisExpression = parenthesisExpressionParser.parse(s, 0);
        if(parenthesisExpression != null) {
            return parenthesisExpression;
        }
        BinaryExpression binaryExpression = binaryExpressionParser.parse(s, 0) ;
        if(binaryExpression != null){
            return binaryExpression;
        }

        SimpleExpression simpleExpression = simpleExpressionParser.parse(s, 0);
        if(simpleExpression != null) {
            return simpleExpression;
        }
        throw new InvalidExpressionException(startingPos);
    }
}
