package com.radha.onlineproblems;

import java.util.ArrayList;
import java.util.List;

public class LongestDistinctCharacter {
    int getLongestDistinctCharacter(String s) {
       /*
       Step 0: create list of character
       Step 1: create a variable max and set to MIN_VALUE
       Step 2: For each character in s
                    2.1: if the list contains the character
                            2.1.1: get the size of the list
                            2.1.2: If the size is greater than max
                                        2.1.2.1: assign max to size
                            2.1.3: Remove all the character from the list
                            2.1.4: put the character in the list
                   2.2: otherwise
                            2.2.1: put the character in the list

      Step 3: return max

        */
        List<Character> distinctCharacters = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if(distinctCharacters.contains(curChar)){
                System.out.println("Not Distinct Character:"+curChar);
                int listSize = distinctCharacters.size();
                if(listSize > max) {
                    max = listSize;
                }
                System.out.println("List before removing: "+distinctCharacters);
                distinctCharacters.clear();
                distinctCharacters.add(curChar);
                System.out.println("List after removing:"+ distinctCharacters);
            }else {
                System.out.println("Distinct Character:"+curChar);
                distinctCharacters.add(curChar);
                System.out.println("List after adding curChar:"+distinctCharacters);
            }
            System.out.println("Max so far:"+max);
            System.out.println("-----------------------------------");
        }

        int listSize = distinctCharacters.size();
        if(listSize > max) {
            max = listSize;
        }

        return max;
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

/*
Step 0: create a character and position map
Step 1: For each character from startPosition
            if it is a last character and the character not in the map
                    return size of the map + 1
            if it is a last character and the character present in the map
                    return size of the map
            if the map contains the character
                    return the size of map
            otherwise
                    put the character and it's position into the map

      abapqr

      startPosition 1
      endPosition 5

 */
