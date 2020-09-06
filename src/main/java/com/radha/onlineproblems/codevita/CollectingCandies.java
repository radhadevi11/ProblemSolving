package com.radha.onlineproblems.codevita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectingCandies {
    /*
    getInput
        - noOfBoxes
        - getCandiesCountPerBox(noOfBoxes)
    getMinimumTime()
        - collectionTimeSoFar = 1st box candy count + 2nd box candy count
        - lastBoxCollectionTime = 1st box candy count + 2nd box candy count
        - for each candy count from 3rd box
            - lastBoxCollectionTime +=  curBoxCandyCount
            -  collectionTimeSoFar += lastBoxCollectionTime
        - return collectionTimeSoFar

    printOutput
        - collectionTimeSoFar
     */

    List<Integer> getCandiesCountPerBox(int noOfBoxes) {
        List<Integer> candiesCountPerBox = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < noOfBoxes; i++) {
            candiesCountPerBox.add(s.nextInt());
        }
        return candiesCountPerBox;
    }

    int getMinimumTime( List<Integer> candiesCountPerBox) {
        int collectionTimeSoFar = candiesCountPerBox.get(0) + candiesCountPerBox.get(1);
        int lastBoxCollectionTime = collectionTimeSoFar;
        for(int i = 2; i < candiesCountPerBox.size(); i++) {
            lastBoxCollectionTime += candiesCountPerBox.get(i);
            collectionTimeSoFar += lastBoxCollectionTime;
        }
        return collectionTimeSoFar;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CollectingCandies candies = new CollectingCandies();
        System.out.println("No of Test cases");
        int noOfTestCase = s.nextInt();
        for(int i = 0; i < noOfTestCase; i++) {
            System.out.println("no of boxes");
            int noOfBoxes = s.nextInt();
            if (noOfBoxes == 1) {
                System.out.println("no of candies per box");
                System.out.println(s.nextInt());
            } else {
                System.out.println("no of candies per box");
                List<Integer> candiesCountPerBox = candies.getCandiesCountPerBox(noOfBoxes);
                System.out.println(candies.getMinimumTime(candiesCountPerBox));
            }

        }

    }

}
