package com.radha.onlineproblems.expression;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParenthesisExpressionParserTest {

    @Test
    public void parse() throws InvalidExpressionException {
        ParenthesisExpressionParser parser = new ParenthesisExpressionParser();
        Assertions.assertThat(parser.parse("a+(b)", 2)).isEqualTo(new ParenthesisExpression
                (new SimpleExpression('b')));

    }

    @Test
    public void parseNestedParanExp() throws InvalidExpressionException {
        ParenthesisExpressionParser parser = new ParenthesisExpressionParser();
        Assertions.assertThat(parser.parse("a+(b+(-c))", 2)).isEqualTo(new ParenthesisExpression
                (new BinaryExpression(new SimpleExpression('b'), '+',
                        new ParenthesisExpression(new NegatedExpression(new SimpleExpression('c'))))));

    }

    @Test
    public void parseNestedParanExp0thPos() throws InvalidExpressionException {
        ParenthesisExpressionParser parser = new ParenthesisExpressionParser();
        Assertions.assertThat(parser.parse("(b+(-c))", 0)).isEqualTo(new ParenthesisExpression
                (new BinaryExpression(new SimpleExpression('b'), '+',
                        new ParenthesisExpression(new NegatedExpression(new SimpleExpression('c'))))));

    }


    @Test
    public void parseInvalid() throws InvalidExpressionException {
        ParenthesisExpressionParser parser = new ParenthesisExpressionParser();
        assertNull(parser.parse("a+b", 0));
    }

}