package com.radha.onlineproblems.geeksforgeeks;
/*
get input
trim the string
concatenate %20 which each space
 */

public class URLify {
    String convertToURLString(String s) {
        return s.trim().replaceAll(" ","%20");

    }




}
