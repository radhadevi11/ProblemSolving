package com.radha.onlineproblems.expression;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;

public class SimpleExpressionParserTest {

    @Test
    public void testParse() {
        SimpleExpressionParser parser = new SimpleExpressionParser();
        assertThat(parser.parse("a+b", 0)).isEqualTo(new SimpleExpression('a'));
    }

    @Test
    public void testParseInvalidExpression() {
        SimpleExpressionParser parser = new SimpleExpressionParser();
        assertNull(parser.parse("a+b", 1));

    }
}