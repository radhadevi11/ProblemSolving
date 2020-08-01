package com.radha.onlineproblems.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;



public class ConvertRomanNumberToInteger {
    private static Map<Character, Integer> romanLetterWithNumber;
        static {
            romanLetterWithNumber = new HashMap<>();
            romanLetterWithNumber.put('I', 1);
            romanLetterWithNumber.put('V', 5);
            romanLetterWithNumber.put('X', 10);
            romanLetterWithNumber.put('L', 50);
            romanLetterWithNumber.put('C', 100);
            romanLetterWithNumber.put('D', 500);
            romanLetterWithNumber.put('M', 1000);
        }
    int getEquivalentIntegerForRomanString (String s) {
      /*
        Step 0: set result to 0
        Step 1: if the length of s is 1
                    return corresponding value for the one character
        Step 1: For each character in the string from reverse to before starting character
                    1.1: if the currentCharacter's value is less than or equal adjacent character value
                            add currentCharacter's value adjacent character value
                            add currentCharacter's value adjacent character value assign it to result
                    1.2: otherwise
                            subtract currentCharacter's value adjacent character value  assign it to result
        Step 3: return result

         */

        int result = 0;
        if(s.length() == 1){
            return romanLetterWithNumber.get(s.charAt(0));
        }
        for(int i = s.length()-1; i > 0; i--) {
            char curChar = s.charAt(i);
            char adjacentCharacter = s.charAt(i - 1);
            Integer curCharValue = romanLetterWithNumber.get(curChar);
            Integer adjacentCharValue = romanLetterWithNumber.get(adjacentCharacter);
            if(curCharValue <= adjacentCharValue) {
                result = curCharValue + adjacentCharValue;
            }
            else {
                result = curCharValue - adjacentCharValue;
            }
        }
        return result;
    }
}
