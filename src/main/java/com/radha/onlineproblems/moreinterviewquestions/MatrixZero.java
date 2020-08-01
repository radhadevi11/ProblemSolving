package com.radha.onlineproblems.moreinterviewquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.IntStream;

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

    void processZeroPositions (int[][] numbers, BiConsumer<Integer, Integer> zeroPositionConsumer) {
        /*
        Step 1: Find zero in the array
        Step 2: if zero found
                    2.1: put the position in the list
       Step3: return list

         */
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                    zeroPositionConsumer.accept(i, j);
            }
        }
    }

    void storeZeroRowsAndColumns(int[][] numbers) {
        Set rowSet = new HashSet<>();
        Set columnSet = new HashSet<>();
        processZeroPositions(numbers, (i, j) -> {
            rowSet.add(i);
            columnSet.add(j);
        });
        IntStream.range(0, numbers.length)
                .filter(rowSet::contains)
                .forEach(row -> IntStream.range(0, numbers.length)
                        .filter(columnSet::contains)
                        .forEach(column -> numbers[row][column] = 0));
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
           numbers[i][colNum] = 0;
        }
    }

    void makeCurrentRowValuesZero(int[][] numbers, int rowNum, int colSize) {
        for(int i = 0; i < colSize; i++) {
                numbers[rowNum][i] = 0;
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

