package com.radha.onlineproblems.geeksforgeeks;
/*
while reach the end of string or the first character of x does not present in the string
    curIndex = find the index of x's 1st character in s
    if x is found
        then return the index
    Otherwise
        find index of x's 1st character from curIndex + 1

 */
/*
S = geeksForgeeks
x = far
 */
public class StringIsSubString {
    int getIndexOfXInS(String s, String x) {
        if(s.length() < x.length()) {
            return -1;
        }
        if(s.indexOf(x.charAt(0)) == -1) {
            return -1;
        }
        int fromIndex = 0;
        int firstCharIndexOfx = 0;
        while (fromIndex <= s.length() - x.length() ||
                (firstCharIndexOfx  != -1 )){
            if(s.startsWith(x, firstCharIndexOfx)){
                return firstCharIndexOfx;
            }
            fromIndex +=  1;
            firstCharIndexOfx = s.indexOf(x.charAt(0), fromIndex);

        }
        return -1;
    }
}
