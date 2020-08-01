package com.radha.onlineproblems.geeksforgeeks;

public class EggDropPuzzle {
    int attempts;
    int getNumberOfAttempts(int noOfEggs, int noOfFloors) {
        /*
            Step 1: if last floor is 1
		                    return attempts
            Step 2: otherwise
                    attempts = lastFloor - 2 + attempts
            Step 3: return attempts
         */
        int lastFloor = getLastFloorUntilAllEggBreaks(noOfEggs - 1, noOfFloors);
        if (lastFloor == 1) {
            return attempts;
        }
        attempts += lastFloor - 2;
        return attempts;
    }

    int getLastFloorUntilAllEggBreaks (int noOfEggs, int lastFloor) {
        /*
            Step 1: if noOfEggs is 0 or lastFloor <= 1
                    1.1: return lastFloor
            Step 2: find midFloor and increment attempt by 1
            Step 3: reduce noOfEggs by 1
            Step 4: call getMidFloorUntilAllEggBreaks(noOfEggs, midFloor)
         */
        if (noOfEggs == 0) {
            return lastFloor;
        }
        if(lastFloor <= 1) {
            return 1;
        }
        attempts++;
        return getLastFloorUntilAllEggBreaks( noOfEggs - 1, lastFloor / 2);
    }
}
