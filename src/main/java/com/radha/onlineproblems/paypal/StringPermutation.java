package com.radha.onlineproblems.paypal;
/*
cat
*************
findCombinations
add into set
return set
****************
findCombinations(word)
	if word has 1 character
		add the character into set
		return set
	combinations = findCombinations(substring)
	for each combination
	   	result = concateCurChar
		add result to set
	return set
******************************
cancateCurChar(curChar, word)
	for i = 0 to word length times
		insert curChar in the ith position
		add into set
	return set
********************************
 */

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
    Set<String> getAllPermutation(String word) {
        if(word.length() == 1) {
            return new HashSet<>(Collections.singleton(word));
        }
        Set<String> permutationsSoFar = getAllPermutation(word.substring(1));
        return getCurPermutations(word.charAt(0), permutationsSoFar);
    }

     Set<String> getCurPermutations(char curChar, Set<String> permutationsSoFar) {
        Set<String> permutations = new HashSet<>();
        for(String curWord : permutationsSoFar) {
            permutations.addAll(concatenateCurChar(curChar, curWord));
        }
        return permutations;
     }

     Set<String> concatenateCurChar(char curChar, String word) {
        Set<String> combinations =  new HashSet<>();
        for (int i = 0; i <= word.length(); i++) {
            combinations.add(new StringBuilder(word).insert(i, curChar).toString());
        }
        return combinations;

     }
}
