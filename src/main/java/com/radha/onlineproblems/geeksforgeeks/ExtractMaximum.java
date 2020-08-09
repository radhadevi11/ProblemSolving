package com.radha.onlineproblems.geeksforgeeks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMaximum {
     /*
    set max to minValue
    set numericString to "0"
    for each character in a the string
        if char value is between 48 to 57
            concatenate with numericString
        otherwise
            value = convert numericString to Integer
            if the value is greater than max
                set max as value
                set numericString to "0"
    return max


     */

    int getMaxNum(String s) {
        //100klh564abc365bg
        int maxSoFar  = Integer.MIN_VALUE;
        StringBuilder numericString = new StringBuilder("0");
        for(int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if(curChar >= 48 && curChar <= 57) {
                numericString.append(curChar);
            } else {
                int value = Integer.parseInt(numericString.toString());
                maxSoFar = Math.max(value, maxSoFar);
                numericString = new StringBuilder("0");
            }
        }
        return maxSoFar;
    }
    int getMaxSumWithBuiltInMethod(String s) {
        Matcher matcher = Pattern.compile("(\\d+)").matcher(s);
        while (matcher.find()) {
            System.out.println("match=" + matcher.group(1));
        }
        String[] splittedNumString = s.split("[^\\d+]");

        int maxSoFar = Integer.MIN_VALUE;
        System.out.println("splittedNumString = "+splittedNumString.length);
        for(String curString : splittedNumString) {
            System.out.println("curString = "+ curString);
            int value = Integer.parseInt(curString);
            maxSoFar = Math.max(value, maxSoFar);
        }
        return maxSoFar;

    }

}
