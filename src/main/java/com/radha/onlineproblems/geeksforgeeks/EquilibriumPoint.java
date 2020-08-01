package com.radha.onlineproblems.geeksforgeeks;

public class EquilibriumPoint {
    /*
    for each number
        find sum of elements before
        find sum of elements after
        if both are equal
                return the position
     */
    int getEquilibriumPoint(int[] numbers) {
        /*
        Step 0; if numbers has 1 element
                            return 1
        Step 1: for each element in numbers
                        1.1: sumOfElementsBeforeI = getSumOfElements()
                        1.2:sumOfElementsAfterI = getSumOfElements()
                        1.3: if sumBeforeNum equal to sumAfterNum
                                    1.4: return element position
        Step 2: return -1
         */
        if(numbers.length == 1) {
            return 1;
        }
        for (int i = 1; i < numbers.length; i++) {
            int sumOfElementsBeforeI = getSumOfElements(0, i, numbers);
            int sumOfElementsAfterI = getSumOfElements(i+1, numbers.length, numbers);
            if(sumOfElementsBeforeI == sumOfElementsAfterI) {
                return i+1;
            }
        }
        return -1;
    }

     int getSumOfElements(int startPos, int endPos, int[] numbers) {
        int sum = 0;
        for(int i = startPos; i < endPos; i++) {
            sum += numbers[i];
        }
        return sum;
    }

}
