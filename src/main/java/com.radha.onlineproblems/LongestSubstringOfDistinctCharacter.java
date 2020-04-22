package com.radha.onlineproblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringOfDistinctCharacter {


    int getSizeOfLongestSubstringWithDistinctCharacter (String subString) {
        /*
        Step 1: create curString
        Step 2: For each character in the subString
                    2.1: if curString not contains current character
                            2.1.1: concatenate curChar with curString
                    2.2: Otherwise
                            2.2.1: call getSizeOsLongestSubstringWithDistinctCharacter with
                                    substring starts from indexOf curCharPosition + 1
                            2.2.2: compare the return value with curString length and return the maximum
       Step 3: return curString length

         */
        String curString = "";
        for(int i = 0; i < subString.length(); i++) {
            char curChar = subString.charAt(i);
            if (curString.indexOf(curChar) == -1) {
                curString += curChar;
            }
            else {
                int startPosition = subString.indexOf(curChar) + 1;
                int maxLengthSoFar = getSizeOfLongestSubstringWithDistinctCharacter(subString.substring(startPosition));
                if(maxLengthSoFar > curString.length()) {
                    return maxLengthSoFar;
                }
                else{
                    return curString.length();
                }
            }
        }
        return curString.length();
    }

    int getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity (String subString) {

         /*

         * The complexity of indexOf method is O(n)
         * We need the index of a character to check whether the character is existing in the substring
                 and also to create new substring
         * So the overall complexity of getSizeOfLongestSubstringWithDistinctCharacter() is O(n^2)
         * To reduce the complexity we can use map which can hold the character and it's corresponding position
         * The complexity of containsKey and get method is O(1)
         * So the overall complexity of getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity() is O(n)

         ************************************************************

        Step 1: create charPositionMap
        Step 2: For each character in the subString
                    2.1: if charPositionMap not contains current character
                            2.1.1: put curChar in charPositionMap
                    2.2: Otherwise
                            2.2.1: call getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity with
                                    substring starts from position of duplicate character
                            2.2.2: compare the return value with charPositionMap size and return the maximum
       Step 3: return charPositionMap size

         */
        Map<Character, Integer> charPositionMap = new HashMap<>();
        for(int i = 0; i < subString.length(); i++) {
            char curChar = subString.charAt(i);
            if (!charPositionMap.containsKey(curChar)) {
                charPositionMap.put(curChar, i);
            }
            else {
                int maxLengthSoFar = getSizeOfLongestSubstringWithDistinctCharacterWithLessTimeComplexity(
                        subString.substring(charPositionMap.get(curChar)+1));
                if(maxLengthSoFar > charPositionMap.size()) {
                    return maxLengthSoFar;
                }
                else{
                    return charPositionMap.size();
                }
            }
        }
        return charPositionMap.size();
    }


    /*
    abapqr

    a
    bapqr=call(bapqr)
    return bapqr

    b
    apqr=call(apqr)
    return bapqr

    a
    pqr=call(pqr)
    return apqr

    p
    qr=call(qr)
    return pqr

    q
    r=(call(r)
    return qr

    r
    return r

    MADAM
    MAD
    DAM

    M
    set(DAM) = call(ADAM)
    return (DAM)

    A
    set(DAM) = (DAM)
    return (DAM)

    D
    set(AM) = call(AM)
    return (DAM)

    A
    set(M) = call(M)
    return (AM)

    M
    set(M)

    abcapqrs

    a
    set(b, c, a, p, q , r, s)=call("bcapqrs")
    7

    b
   c a pq r s call("capqrs")
    7

    c
    a p q r s call("apqrs")
    6

    positions

    p
    call(ositions)
    ptions

    o
    call(sitions)
    tions

    s
    call(itions)
    return tions

    i
    call(tions)
    return tions

    t
    call(ions)
    return tions

    i
    call(ons)
    return ions

    o
    call(ns)
    return o,n,s

    n
    set[s] = call(s)
    return n,s

    return s
     */

}


