package com.radha.onlineproblems.expression;

public class InvalidExpressionException extends Exception{
    private int startingPos;

    public InvalidExpressionException(int startingPos) {
        super("Invalid character at "+startingPos);
        this.startingPos = startingPos;
    }
}
