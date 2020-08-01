package com.radha.onlineproblems.moreinterviewquestions;

public class FloorInSortedArrayBinarySearch {
    int getIndexOfFloorInSortedArray(int[] numbers, int floorValue, int startPosition,
                                     int endPosition) {
        /*
        Step 1: If startPosition equal to endPosition
                            return getIndexOfFloorWhenStartPosEqualToEndPos()
        Step 2: Otherwise
                            find midPosition
                           if  floorValue equal to value in the  midPosition
                                return midPosition
                           if  floorValue greater than the value in the  midPosition
                                   return getIndexOfFloorInSortedArray(mid+1,  endPosition)
                           otherwise
                                  return getIndexOfFloorInSortedArray( startPosition, mid)
         */
       if (startPosition == endPosition) {
                  return getIndexOfFloorWhenStartPosEqualToEndPos(floorValue,
                          numbers[startPosition], startPosition);
       }
       else {
           int midPosition = (startPosition + endPosition) / 2;
           if(floorValue == numbers[midPosition]) {
               return midPosition;
           }
           if (floorValue > numbers[midPosition]) {
               return getIndexOfFloorInSortedArray(numbers, floorValue,
                       midPosition + 1, endPosition);
           }
           return getIndexOfFloorInSortedArray(numbers, floorValue,
                   startPosition, midPosition);
       }

    }

     int getIndexOfFloorWhenStartPosEqualToEndPos(int floorValue, int number, int startPosition) {
        /*
        if  the value in the startPosition is equal to floorValue
                    return startPosition
       Otherwise
                    return startPosition - 1
         */
        return floorValue == number ? startPosition : startPosition - 1;
    }

    int getIndexOfFloor (int[] numbers, int floorValue) {
        return getIndexOfFloorInSortedArray(numbers, floorValue, 0, numbers.length);
    }

}
