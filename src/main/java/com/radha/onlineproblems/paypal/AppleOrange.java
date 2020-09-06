package com.radha.onlineproblems.paypal;
/*
 getNoOfPossibleApple(appleDistanceArray, houseStartPosition, houseEndPosition, appleTreeLocation)
    - set count to 0
    - for each  appleDistance
           isInRange(distance, appleTreeLocation, houseStartPosition, houseEndPosition)
           increment count by 1
    - return count

    isInRange(distance, treeLocation, houseStartPosition, houseEndPosition)
        - if the sum of distance and treeLocation is in the range of house position
                return true
        - return false
 */

public class AppleOrange {
    void printNoOfPossibleAppleAndOrange(int[] appleDistanceArray, int[] orangeDistanceArray,
                                         int houseStartPosition, int houseEndPosition,
                                         int appleTreeLocation, int orangeTreeLocation) {
        int possibleAppleCount = getNoOfPossibleFruits(appleDistanceArray, houseStartPosition,
                houseEndPosition, appleTreeLocation);
        int possibleOrangeCount = getNoOfPossibleFruits(orangeDistanceArray, houseStartPosition,
                houseEndPosition, orangeTreeLocation);
        System.out.println(possibleAppleCount + " "+ possibleOrangeCount);

    }

    int getNoOfPossibleFruits(int[] distanceArray, int houseStartPosition, int houseEndPosition, int treeLocation) {
        int count = 0;
        for (int i = 0; i < distanceArray.length; i++) {
            if(isInRange(distanceArray[i], houseStartPosition, houseEndPosition, treeLocation)) {
                count++;
            }
        }
        return count;
    }

     boolean isInRange(int distance, int houseStartPosition, int houseEndPosition, int treeLocation) {
        int landingLocation = distance + treeLocation;
        return landingLocation >= houseStartPosition && landingLocation <= houseEndPosition;
    }
}
