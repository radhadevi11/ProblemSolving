package com.radha.onlineproblems;

import java.util.ArrayList;
import java.util.List;

class MatrixZero {
    List<Position> getAllZerosPositionList (int[][] numbers) {
        /*
        Step 1: Find zero in the array
        Step 2: if zero found
                    2.1: put the position in the list
       Step3: return list

         */
        List<Position> zeroPositionList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == 0) {
                    zeroPositionList.add(new Position(i, j));
                }
            }
        }
        return zeroPositionList;
    }

    void convertAllPositionValuesToZeros (List<Position> zeroPositionList,
                                          int[][] numbers) {
        /*
        Step 1: For each position in the list
                    1.1: makeCurrentRowValueZero
                    1.2: makeCurrentColValueZero
         */
        for(Position position : zeroPositionList) {
            int rowNum = position.getRow();
            int ColNum = position.getColumn();
            makeCurrentRowValuesZero (numbers, rowNum, numbers[rowNum].length);
            makeCurrentColValuesZero (numbers, ColNum, numbers.length);
        }
    }

    void makeCurrentColValuesZero(int[][] numbers, int colNum, int rowSize) {
        for (int i =0; i < rowSize; i++) {
            if(numbers[i][colNum] != 0) {
                numbers[i][colNum] = 0;
            }
        }
    }

    void makeCurrentRowValuesZero(int[][] numbers, int rowNum, int colSize) {
        for(int i = 0; i < colSize; i++) {
            if(numbers[rowNum][i] != 0) {
                numbers[rowNum][i] = 0;
            }
        }
    }

    int[][] findZerosAndMakeZeroToTheAllPosition (int[][] numbers) {
        /*
        Step 1:  getAllZerosPositionList
        Step 2: convertAllPositionValuesToZeros
        Step 3: return the array
         */
        List<Position> allZerosPositionList = getAllZerosPositionList(numbers);
        convertAllPositionValuesToZeros(allZerosPositionList, numbers);
        return numbers;
    }
}

