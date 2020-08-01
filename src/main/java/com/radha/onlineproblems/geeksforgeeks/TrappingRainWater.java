package com.radha.onlineproblems.geeksforgeeks;

public class TrappingRainWater {
    int getUnitOfTrappedWater(int[] heightOfBlocks) {
        /*
        Step 0: set trappedWatter = 0
        Step 1: Get the 1st block height
        Step 2: Get the last block height
        Step 3: Find the minimum among those height
        Step 4: For each block except 1st and last
                        if the height is less than minimum height
                                    find the remaining gap
                                    add it to trapped water
        Step 5: return trappedWater

         */
        int trappedWater = 0;
        int minHeight = getMinHeight( heightOfBlocks[0],
                heightOfBlocks[heightOfBlocks.length - 1]);
        for(int i = 1; i < heightOfBlocks.length - 2; i++) {
            if(heightOfBlocks[i] < minHeight) {
                trappedWater += minHeight - heightOfBlocks[i];
            }
        }
        return trappedWater;
    }

    private int getMinHeight(int firstBlockHeight, int lastBlockHeight) {
        return firstBlockHeight < lastBlockHeight ? firstBlockHeight : lastBlockHeight;
    }
}
