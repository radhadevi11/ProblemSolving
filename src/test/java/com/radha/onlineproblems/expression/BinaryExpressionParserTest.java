package com.radha.onlineproblems.expression;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

public class BinaryExpressionParserTest {

    @Test
    public void getTillFirstOperatorPosition() {
        BinaryExpressionParser binaryExpressionParser = new BinaryExpressionParser();
        assertThat(binaryExpressionParser.getTillFirstOperatorCharPosition(0, "a+b")).isEqualTo(1);
    }
    public void getTillFirstNoOperatorPosition() {
        BinaryExpressionParser binaryExpressionParser = new BinaryExpressionParser();
        assertThat(binaryExpressionParser.getTillFirstOperatorCharPosition(0, "a")).isEqualTo(-1);
    }
    @Test
    public void parse() throws InvalidExpressionException {
        BinaryExpressionParser binaryExpressionParser = new BinaryExpressionParser();
        assertThat(binaryExpressionParser.parse("a+b", 0)).isEqualTo(new BinaryExpression(
                new SimpleExpression('a'), '+', new SimpleExpression('b')
        ));
    }
    @Test
    public void parseComplexExp() throws InvalidExpressionException {
        BinaryExpressionParser binaryExpressionParser = new BinaryExpressionParser();
        assertThat(binaryExpressionParser.parse("a+(b-c)", 0)).isEqualTo(new BinaryExpression(
                new SimpleExpression('a'), '+', new ParenthesisExpression(new BinaryExpression
                (new SimpleExpression('b'), '-', new SimpleExpression('c')))));

    }
    @Test
    public void parseInvalidBinaryExp() throws InvalidExpressionException {
        BinaryExpressionParser binaryExpressionParser = new BinaryExpressionParser();
        assertNull(binaryExpressionParser.parse("a", 0));

    }
}