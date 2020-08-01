package com.radha.onlineproblems.bytes;

/*
alphaDecoding(int startPos, String str)
        if  startPos == last character position
                    print the character 1 time
                    return
        if startPos >= str length
                    return
        otherwise
        get character at startPos
                if the character's adjacent character is number
                            printCharacterNTimes();
                            call alphaDecoding(startPos + 2, str)
                otherwise
                            print the character one time
 */

public class StringLengthDecoding {
    void alphaEncoding (int startPos, String str) {
        if(startPos == str.length() - 1) {
            System.out.print(str.charAt(startPos));
            return;
        } if(startPos >= str.length()) {
            return;
        }
        char curChar = str.charAt(startPos);
        char nextChar = str.charAt(startPos + 1);
        if(Character.isDigit(nextChar)) {
            printCharacterNTimes(Integer.parseInt(nextChar+""), curChar);
            alphaEncoding(startPos+2, str);
        } else {
            System.out.print(curChar);
            alphaEncoding(startPos+1, str);
        }
    }

    private void printCharacterNTimes(int n, char c) {
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}

