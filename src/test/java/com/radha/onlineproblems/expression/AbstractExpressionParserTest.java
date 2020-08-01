package com.radha.onlineproblems.expression;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AbstractExpressionParserTest {

    @Test
    public void parseNegatedExp() throws InvalidExpressionException {
        AbstractExpressionParser parser = new AbstractExpressionParser();
        assertThat(parser.parse("-a", 0)).isEqualTo(new NegatedExpression(new SimpleExpression('a')));

    }
    @Test
    public void parseNegatedParanExp() throws InvalidExpressionException {
        AbstractExpressionParser parser = new AbstractExpressionParser();
        assertThat(parser.parse("-(a+b)", 0)).isEqualTo(new NegatedExpression
                (new ParenthesisExpression
                        (new BinaryExpression
                                (new SimpleExpression('a'), '+', new SimpleExpression('b')))));

    }

    @Test
    public void parseParanExp() throws InvalidExpressionException {
        AbstractExpressionParser parser = new AbstractExpressionParser();
        assertThat(parser.parse("(a+b)", 0)).isEqualTo(new ParenthesisExpression
                        (new BinaryExpression
                                (new SimpleExpression('a'), '+', new SimpleExpression('b'))));

    }
    @Test
    public void parseBinaryExp() throws InvalidExpressionException {
        AbstractExpressionParser parser = new AbstractExpressionParser();
        assertThat(parser.parse("a+b", 0)).isEqualTo (new BinaryExpression
                        (new SimpleExpression('a'), '+', new SimpleExpression('b')));

    }
    @Test
    public void parseSimpleExp() throws InvalidExpressionException {
        AbstractExpressionParser parser = new AbstractExpressionParser();
        assertThat(parser.parse("a", 0)).isEqualTo (new SimpleExpression('a'));

    }
    @Test
    public void parseInvalidExp() {
        AbstractExpressionParser parser = new AbstractExpressionParser();
        assertThatThrownBy(() -> parser.parse("----", 0))
                .isInstanceOf(InvalidExpressionException.class)
                .hasMessage("Invalid character at 0");

    }

}