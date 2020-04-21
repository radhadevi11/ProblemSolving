package com.radha.onlineproblems;

import java.util.HashSet;
import java.util.Set;

public class MaxDistanceBetweenSameElement {
    /*
            look an element
        if you already processed the element
            look for next element
        otherwise
            find the all occurances of the element
            and calculate the max distance distance
            mark the element as processed
        return maximum among the maximum

        1 1 2 2 2 1

        Step 0: create a hashSet set max as MIN_VALUE
        Step 1: For each element in the given array
                    1.1: if set does not contains the current element
                            1.1.1: calculateMaxDistance()
                            1.1.2: if the result of calculateMaxDistance() is greater than max
                                        1.1.2.1: set max as result
                            1.1.3: put the element in the set
       Step 2: return max

       */
    int getMaxDistanceBetweenSameElement(int[] array) {
        Set<Integer> numbersSet = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(! numbersSet.contains(array[i])) {
                int result = calculateMaxDistance(i, array, array[i]);
                if(result > max) {
                    max = result;
                }
                numbersSet.add(array[i]);
            }
        }
        return max;
    }

    private int calculateMaxDistance(int fromPosition, int[] array, int numberToFind) {
        /*
        calculateMaxDistance(startingPosition, numbers, numberToFind)
        Step 1: set max as MIN_VALUE
        Step 2: For each element from startingPosition+1
                    2.1: if the element is equal to numberToFind
                                2.2: subtract current position from startingPosition
                                2.3: if the result is greater than max
                                            2.3.1: set max as result
       Step 3: return max
         */
        int max = Integer.MIN_VALUE;
        for(int i = fromPosition+1; i < array.length; i++) {
            if(array[i] == numberToFind) {
                int indexDistance = i - fromPosition;
                if(indexDistance > max) {
                    max = indexDistance;
                }
            }
        }
        return max;

    }
    /*


hshSet => [1]
max =>5
currentElement => 1
calculateMaxDistance => 5

hshSet => [1, 2]
max =>5
currentElement => 2
calculateMaxDistance => 2



       startingPosition = 0
       numbersMap =  1 1 2 2 2 1
       numberToFind = 1
       max = min value
       currentPosition = 1
       result = 1

       startingPosition = 0
       numbersMap =  1 1 2 2 2 1
       numberToFind = 1
       max = 5
       currentPosition = 5
       result =  5 - 0 => 5

       startingPosition = 2
       numbersMap =  1 1 2 2 2 1
       numberToFind = 2
       max = min value
       currentPosition = 3
       result =  3 - 2 => 1

       startingPosition = 2
       numbersMap =  1 1 2 2 2 1
       numberToFind = 2
       max = 2
       currentPosition = 4
       result =  4 - 2 => 2



     */
}
