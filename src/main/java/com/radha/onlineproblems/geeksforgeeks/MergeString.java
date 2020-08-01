package com.radha.onlineproblems.geeksforgeeks;

public class MergeString {
    /*
    find minimum length and longest string
    create result
        append alternate char of word1 and word2
        append remaining char of longest string and return
     */
    String mergeStrings(String word1, String word2) {
        if(word1.length() == 0 || word2.length() == 0 ) {
         return word1 + word2;
        }
        int minLength = Math.min(word1.length(), word2.length());
        String bigString = word1.length() > word2.length() ? word1 : word2;

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return result.append(bigString.substring(minLength)).toString();
    }
}
