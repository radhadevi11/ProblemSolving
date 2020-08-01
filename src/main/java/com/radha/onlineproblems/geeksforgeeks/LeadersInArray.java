package com.radha.onlineproblems.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {
    List<Integer> getLeaders(int[] numbers) {
        /*
        Step 0: create list called  leaders
        Step 1: For each element in the numbers fromStartPos
        Step 2: if isLeader()
                        add it to leaders
        Step 3: add last element in leaders
        Step 3: return leaders

         */
        List<Integer> leaders = new ArrayList<>();
        for(int i = 0; i < numbers.length - 1; i++) {
            if(isLeader(numbers[i], i, numbers)) {
                leaders.add(numbers[i]);
            }
        }
        leaders.add(numbers[numbers.length-1]);
        return leaders;
    }

     boolean isLeader(int number, int startPos, int[] numbers) {
        for(int i = startPos+1; i < numbers.length; i++) {
            if(numbers[i] > number) {
                return false;
            }
        }
        return true;
    }
    List<Integer> getLeadersLessTimeComplexity(int[] numbers) {
        /*
         create list called  leaders
         add the last element in leaders
        Set maxSoFar as last element in numbers
        For each number in numbers from reverse
                    if  it is greater than maxSoFar
                            add the element in leaders
                            Set maxSoFar as this element
         */
        List<Integer> leaders = new ArrayList<>();
        int lastNum = numbers[numbers.length - 1];
        int maxSoFar = lastNum;
        leaders.add(lastNum);
        for(int i = numbers.length - 2; i >= 0; i--) {
            int curElemnet = numbers[i];
            if(curElemnet >= maxSoFar) {
                leaders.add(0, curElemnet);
                maxSoFar = curElemnet;
            }
        }
        return leaders;
    }
}
