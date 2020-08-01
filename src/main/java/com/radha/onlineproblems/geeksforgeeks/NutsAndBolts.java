package com.radha.onlineproblems.geeksforgeeks;

import java.util.*;
import java.util.stream.Collectors;

public class NutsAndBolts {
    static List<Character> nutsAndBoltsElement = Arrays.asList('!', '#',  '$', '%', '&', '*',  '@',  '^',  '~');

    Set<Character>  convertArrayToSet (char[] elements) {
        Set<Character> elementSet = new HashSet<>();
        for(char element : elements) {
            elementSet.add(element);
        }
        return elementSet;
    }
    /*
    for each element in the list
            if nuts contains the element and bolt contains the element
                    add it to the nut and bolt array
return nut and bolt array
     */

    void mapNutsWithBolts (Set<Character> nuts, Set<Character> bolts) {
        final StringBuilder stringBuilder = new StringBuilder();
        String resultString = nutsAndBoltsElement.stream()
                .filter(curElement -> nuts.contains(curElement) && bolts.contains(curElement))
                .map(curElement -> curElement.toString())
                .collect(Collectors.joining(" "));
        System.out.println(resultString);
        System.out.println(resultString);
    }

}
