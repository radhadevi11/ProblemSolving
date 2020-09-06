package com.radha.onlineproblems.paypal;
/*
int result = 0th index character
for each character from 1 to length
     operation = ith character
     num = i+1th numberCharacter
     result = doLogicalOperation(operation, res, num)
 */
public class EvaluateBooleanExp {
    int getEvaluatedResult(String expression) {
        int result = expression.charAt(0);
        for(int i = 1; i < expression.length() - 1; i += 2) {
            result = doLogicalOperation(expression.charAt(i), result,
                    Integer.parseInt(expression.charAt(i+1)+""));

        }
        return result;
    }

    int doLogicalOperation(char operation, int num1, int num2) {
        if(operation == 'A') {
            return num1 & num2;
        }
        if(operation == 'B') {
            return num1 | num2;
        }
        if(operation == 'C') {
            return num1 ^ num2;
        }
        return -1;
    }

}
