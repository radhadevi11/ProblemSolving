package com.radha.onlineproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputePondSizes {
    /*
    Step 1: set count to 1
    Step 2: search left diagonal
                2.1: if 0 is found
                        2.1.1: computePondSize(currentPosition)
                        2.1.2: add the result of computePondSize with count
    Step 3: search right diagonal
                3.1: if 0 is found
                        3.1.1: computePondSize(currentPosition)
                        3.1.2: add the result of computePondSize with count
    Step 4: search horizontally
                4.1: if 0 is found
                        4.1.1: computePondSize(currentPosition)
                        4.1.2: add the result of computePondSize with count
   Step 5: search vertically
                5.1: if 0 is found
                        5.1.1: computePondSize(currentPosition)
                        5.1.2: add the result of computePondSize with count
     Step 6: return count

     */
    int computePondSize(Position curPosition, int[][] plotOfLand, int rowSize, int colSize,
                        Map<Position, Integer> positionMap){
        int count = 1;

        Position leftDiagonalPosition = new Position(curPosition.getRow()+1, curPosition.getColumn() - 1);
        if(isValidZero(leftDiagonalPosition, rowSize, colSize, positionMap, plotOfLand)){
            int pondSize = computePondSize(leftDiagonalPosition, plotOfLand, rowSize, colSize, positionMap);
            count += pondSize;
        }

        Position rightDiagonalPosition = new Position(curPosition.getRow()+1, curPosition.getColumn() + 1);
        if(isValidZero(rightDiagonalPosition, rowSize, colSize, positionMap, plotOfLand)){
            int pondSize = computePondSize(rightDiagonalPosition, plotOfLand, rowSize, colSize, positionMap);
            count += pondSize;
        }

        Position horizontalPosition = new Position(curPosition.getRow(), curPosition.getColumn() + 1);
        if(isValidZero(horizontalPosition,  rowSize, colSize, positionMap, plotOfLand)){
            int pondSize = computePondSize(horizontalPosition, plotOfLand, rowSize, colSize, positionMap);
            count += pondSize;
        }

        Position verticalPosition = new Position(curPosition.getRow() + 1, curPosition.getColumn());
        if(isValidZero(verticalPosition, rowSize, colSize, positionMap, plotOfLand)){
            int pondSize = computePondSize(verticalPosition, plotOfLand, rowSize, colSize, positionMap);
            count += pondSize;
        }
        positionMap.put(curPosition, 0);
        return count;



    }


    boolean isValidZero(Position position, int rowSize, int colSize, Map<Position, Integer> positionMap,
                        int[][] plotOfLand){
        /*
    Step 1: isValidPosition and If the position contains 0 and the position is not in the map
                1.1: add the position into the map
                1.2: return true
    Step 2: return false
     */
        int row = position.getRow();
        int col = position.getColumn();
        if(isValidPosition(row, col, rowSize, colSize)
                && plotOfLand[row][col] == 0
                && !positionMap.containsKey(position)){
            return true;
        }
        return false;
    }


    boolean isValidPosition(int row, int col, int rowSize, int colSize){
        /*
    Step 1: if row is less than rowSize and column is less than colSize
                1.1: return true
    Step 2: return false
     */
        return (row < rowSize && col < colSize) && (row > -1 && col > -1);
    }
    List<Integer> getPondSizeList(int[][] plotOfLand, int rowSize, int colSize) {
        /*
    Step 0: Create resultList and positionMap
    Step 1: For each row in the plotOfLand
                Step 1.1: For each element in the row
                            1.1.1: if isValidZero
                                    1.1.1.1 : add the current position into positionMap
                                    1.1.2.2 : computePondSize with currentPosition
                                    1.1.2.3 : Add the result of  computePondSize() to resultList
     */

        List<Integer> resultList = new ArrayList<>();
        Map<Position, Integer> positionMap = new HashMap<>();
        for(int i = 0; i < rowSize; i++){
            for (int j = 0; j < colSize; j++){

                Position currentPosition = new Position(i, j);
                if(isValidZero(currentPosition, rowSize, colSize, positionMap, plotOfLand)){
                    //positionMap.put(currentPosition, 0);
                    int pondSize = computePondSize(currentPosition, plotOfLand, rowSize, colSize, positionMap);
                    resultList.add(pondSize);
                }
            }
        }
        return resultList;

    }


}
