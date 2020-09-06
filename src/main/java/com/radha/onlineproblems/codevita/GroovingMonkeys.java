package com.radha.onlineproblems.codevita;
/*
getInput
    - noOfMonkeys
    - getPositionPatternList
    - getInitialMonkeyList

getTimeMonkeysToReachInitialPosition(initialMonkeyList)
    - monkeyListAfterExchange = initialMonkeyList
    - timeSoFar = 0
    - while true
        - monkeyListAfterExchange = getMonkeyListAfterExchange(monkeyListAfterExchange)
        - increment timeSoFar by 1
        - if initialMonkeyList and listAfterExchange are same
               return timeSoFar

getMonkeyListAfterExchange(noOfMonkeys, curMonkeyList, positionPatternList)
    - create monkeyListAfterExchange
    - for i = 0 to noOfMonkeys
        - positionToChange = positionPatternList[i] - 1
        - monkeyListAfterExchange[positionToChange] = curMonkeyList[i]

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroovingMonkeys {
    int getTimeMonkeysToReachInitialPosition(List<Character> initialMonkeyList, int noOfMonkeys,
                                             List<Integer> positionPatternList) {
        List<Character> monkeyListAfterExchange = initialMonkeyList;
        int timeSoFar = 0;
        while (true) {
            //System.out.println("TimesoFar "+timeSoFar);
            System.out.println(initialMonkeyList + ":" + monkeyListAfterExchange);
            monkeyListAfterExchange = getMonkeyListAfterExchange(monkeyListAfterExchange,
                    noOfMonkeys,
                    positionPatternList);
            timeSoFar += 1;
            //System.out.println(initialMonkeyList + ":" + monkeyListAfterExchange);
            if(initialMonkeyList.equals(monkeyListAfterExchange) ) {
                return timeSoFar;
            }
        }
    }

     List<Character> getMonkeyListAfterExchange(List<Character> curMonkeyList, int noOfMonkeys, List<Integer> positionPatternList) {
        List<Character> monkeyListAfterExchange = getInitialMonkeyList(noOfMonkeys);
        //System.out.println("monkeyListAfterExchange "+ monkeyListAfterExchange);
        for(int i = 0; i < noOfMonkeys; i++) {
           // System.out.println("i = "+i);
            int positionToChange = positionPatternList.get(i) - 1;
            //System.out.println("Position to change "+positionToChange);
            monkeyListAfterExchange.set(positionToChange, curMonkeyList.get(i));
        }
        return monkeyListAfterExchange;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfMonkeys = s.nextInt();
        GroovingMonkeys groovingMonkeys = new GroovingMonkeys();
        List<Integer> positionPatternList = groovingMonkeys.getPositionPatternList(noOfMonkeys);
        List<Character> initialMonkeyList = groovingMonkeys.getInitialMonkeyList(noOfMonkeys);
        System.out.println(groovingMonkeys.getTimeMonkeysToReachInitialPosition(initialMonkeyList, noOfMonkeys,
                positionPatternList));
    }

     List<Character> getInitialMonkeyList(int noOfMonkeys) {
        List<Character> initialMonkeyList = new ArrayList<>();
        for(int i = 65; i < 65 + noOfMonkeys; i++) {
            initialMonkeyList.add(((char)i));
        }
        return initialMonkeyList;
    }

     List<Integer> getPositionPatternList(int noOfMonkeys) {
        Scanner s = new Scanner(System.in);
        List<Integer> positionPatternList = new ArrayList<>();
        for(int i = 0; i < noOfMonkeys; i++) {
            positionPatternList.add(s.nextInt());
        }
        return positionPatternList;
    }
}
