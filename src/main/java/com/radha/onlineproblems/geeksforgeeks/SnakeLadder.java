package com.radha.onlineproblems.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnakeLadder {
    /*
    try 1-6 in the dice
    find which number reach the highest destination
    reach the destination
    increment no Of throws by 1
     */
    int getNoOfThrows(Map<Integer, Integer> snakeLadderPosition, int source) {
        /*
        Step  1: if source = 30
                        return 0
        Step 2: set maxSoFar = getMaxSoFar ()
        Step 3:result = call  getNoOfThrows(snakeLadderPosition, maxSoFar)
        Step 4:return result + 1

         */
        if(source == 30) {
            return 0;
        }
        else {
            int maxSoFar = getMaximumPossiblePosition(snakeLadderPosition, source);
            int result = getNoOfThrows(snakeLadderPosition, maxSoFar);
            return result+1;
        }
    }
    int getMaximumPossiblePosition(Map<Integer, Integer> snakeLadderPosition,
                                   int curPosition) {
        /*
        Step 0: set maxSoFar to curPosition
        Step 1: For each cell from curPosition+1 to curPosition+6
                        if current cell = 30
                            return maxSoFar as 30
                         if  snakeLadderPosition contains current cell and the value is greater than maxSoFar
                                    set  maxSoFar as  value
                        `else  if  current cell value > maxSoFar
                                            set maxSoFar as  current cell value
      Step 2:  return maxSoFar
         */
        int maxSoFar = curPosition;
        for (int i = curPosition + 1; i <= curPosition+6; i++) {
            if (i == 30) {
                return 30;
            }
            if(snakeLadderPosition.containsKey(i) &&
                    snakeLadderPosition.get(i) > maxSoFar) {
                maxSoFar = snakeLadderPosition.get(i);
            }
            if(i > maxSoFar && !snakeLadderPosition.containsKey(i)) {
                maxSoFar = i;
            }
        }
        return maxSoFar;
    }
    Map<Integer, Integer> getSnakeLadderPosition(int noOfSnakesAndLadders) {
        HashMap<Integer, Integer> snakeLadderPosition = new HashMap<>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < noOfSnakesAndLadders; i++) {
            snakeLadderPosition.put(s.nextInt(), s.nextInt());
        }
        return snakeLadderPosition;
    }

    public static void main(String[] args) {
        SnakeLadder ladder = new SnakeLadder();
        Scanner s = new Scanner(System.in);
        int noOfSnakesAndLadders = s.nextInt();
        System.out.println(ladder.getNoOfThrows(ladder.getSnakeLadderPosition(noOfSnakesAndLadders), 1));
    }


}
