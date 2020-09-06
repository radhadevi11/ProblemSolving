package com.radha.onlineproblems.paypal;
/*
declare array called mergeArray
mergeArrayCurIndex = 0
curPosArr1 = 0
curPosArr2 = 0
while reach the last element of any of the arrays
    - find small element among arr1 and arr2 current element
    - if small element is present in array 1
        increment curPosArr1 by 1
    - otherwise
        increment curPosArr2 by 1
    - add that element in the mergeArray
    - increment mergeArrayCurIndex by 1
- addRemainingElements(arr1, arr2, curPosArr2, curPosArr1)

addRemainingElements()
    if both array reach it's end
        return mergeArray
     if arr1 reached it's end
        - addElements(arr2, mergeArray, curPosArr2)
        - return mergeArray
     otherwise
        - addElements(arr1, mergeArray, curPosArr1)
        - return mergeArray
 */

public class MergeTwoSortedArray {
    int[] getMergedArray(int[] array1, int[] array2) {
        int[] mergeArray = new int[array1.length + array2.length];
        int mergeArrayCurIndex  = 0;
        int array1CurPos = 0;
        int array2CurPos = 0;
        while(array1CurPos < array1.length && array2CurPos < array2.length) {
            if(array1[array1CurPos] < array2[array2CurPos]) {
                mergeArray[mergeArrayCurIndex++] = array1[array1CurPos];
                array1CurPos++;

            } else {
                mergeArray[mergeArrayCurIndex++] = array2[array2CurPos];
                array2CurPos++;
            }

        }
        return addRemainingElements(array1, array2, array1CurPos, array2CurPos, mergeArray, mergeArrayCurIndex);
    }

     int[] addRemainingElements(int[] array1, int[] array2, int array1CurPos, int array2CurPos, int[] mergeArray,
                                       int mergeArrayCurIndex) {
        if(array1CurPos >= array1.length && array2CurPos >= array2.length) {
            return mergeArray;
        } if(array1CurPos == array1.length) {
            addElements(array2, mergeArray, array2CurPos, mergeArrayCurIndex);
        } if(array2CurPos == array2.length) {
            addElements(array1, mergeArray, array1CurPos, mergeArrayCurIndex);
        }
        return mergeArray;
    }

     void addElements(int[] array, int[] mergeArray, int startPosition, int mergeArrayCurIndex) {
        for(int i = startPosition; i < array.length; i++) {
            mergeArray[mergeArrayCurIndex++] = array[i];
        }
    }
}
