package com.radha.onlineproblems.wordproblems;

import java.util.Scanner;

public class OptimalGame {
/*
getInput =>
        -get no of test case,
        -length of binary string
        - get string
processInput =>
            - result = findMaxNoPair()
            -getWinner(result)
displayResult =>

 */
    public static void main(String[] args) {
        OptimalGame optimalGame = new OptimalGame();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t; i++) {
            int n =  s.nextInt();
            String  str = s.next();
            System.out.println(optimalGame.getWinner(n, str));
        }
    }

     int getPairCount(int n, String str) {
         int zeroCount = 0;
         int oneCount = 0;
       for(int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == '0') {
               zeroCount++;
           } else {
               oneCount++;
           }
       }
       return Math.min(zeroCount, oneCount);
     }

     String getWinner(int n, String str) {
        int leastCount = getPairCount(n, str);
        if(leastCount % 2 == 0) {
            return "Joe";
        }else {
            return "John";
        }
    }
}
