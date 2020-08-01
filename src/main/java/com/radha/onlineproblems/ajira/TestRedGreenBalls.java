package com.radha.onlineproblems.ajira;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RedGreenBalls {
    int n;
    String[][] balls;

    RedGreenBalls(int n, String[][] balls) {
        this.n = n;
        this.balls = balls;
    }

    boolean isGoodRow(int rowNum){
        for(int i = 0; i < n; i++){
            if(balls[rowNum][i].equals("R") && i > rowNum){
                return false;
            }
        }
        return true;
    }

    boolean isSwappable(int fromRowNum, int toRowNum){
        /*
        ALGORITHM:

        Step 1: For each cell in the row
                1.1: If the cell contains red ball
                    1.1.1 If the columnNo is greater than row number return false
        Step 2: Return true
         */
        for(int i = 0; i < n; i++){
            if(balls[fromRowNum][i].equals("R") && i > toRowNum){
                return false;
            }
        }
        return true;
    }



    void swap(int fromRowNum, int toRowNum){
        /*
        Swap(fromRowNumber, toRowNumber)

            ALGORITHM:

            Step 1: set temp to ""
            Step 2: for each from cell in the fromRow
                    2.1: copy the from cell value to temp
                    2.2: assign the to cell value to from cell
                    2.3: assign the temp value to to cell
         */
        String temp = "";
        for(int i = 0; i < n; i++){
            temp = this.balls[fromRowNum][i]+"";
            this.balls[fromRowNum][i] = this.balls[toRowNum][i]+"";
            this.balls[toRowNum][i] = temp;
        }
    }

     int makeRowGood(int rowNum){
        /*
            makeRowGood(rowNumber)
        ALGORITHM:
        Step 0: If rowNumber == N and If the row is bad
                0.1: return -1
        Step 1: If the row is bad
            1.1: If adjacent row is good
                1.1.1: swap(rowNumber,rowNumber+1)
                1.1.2: Return 1
            1.2.: Otherwise
                1.2.1: If call swapCount = makeRowGood(rowNumber+1) == -1 return -1
                1.2.2: swap(rowNumber,rowNumber+1)
                1.2.3: Return swapCount+1-
        Step 2: Otherwise
                2.1:Return 0



         */

        if(rowNum == n-1 && !isGoodRow(rowNum)){
            return -1;
        }
        if(!isGoodRow(rowNum)){
            if(isSwappable(rowNum+1, rowNum)){
                swap(rowNum, rowNum+1);
                return 1;
            }
            else {
               int swapCount = makeRowGood(rowNum+1);
                if(swapCount == -1){
                    return -1;
                }
                if(isSwappable(rowNum+1 , rowNum)){
                    swap(rowNum, rowNum+1);
                    return swapCount+1;
                }
                else {
                    return -1;
                }

            }

        }
        return 0;
    }

    public int arrangeRedBalls(){
        /*
         ALGORITHM:
        Step 0: set swapCount to 0
        Step1: For each row in the array
            1.1: if call makeRowGood(rowNumber) == -1
                1.1.1: then return -1
            1.2: Otherwise
                    1.2.1: add swapCount with the result of makeRowGood(CurrentRowNumber)
        Step 2: Return swapCount

         */
        int swapCount = 0;
        for(int i = 0; i < n; i++){
            if(makeRowGood(i) == -1){
                return -1;
            }
            swapCount += makeRowGood(i);

        }
        return swapCount;
    }
    public void populateArray(int rowNO, String[] lines){
        for(int i =0; i < lines.length; i++){
            this.balls[rowNO][i] = lines[i];
        }
    }



}
public class TestRedGreenBalls{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();
        String[] strs = lines.trim().split("");
        int n = Integer.parseInt(strs[0]);


        String[][] balls = new String[n][n];
        RedGreenBalls redGreenBalls = new RedGreenBalls(n, balls);
        for(int i = 0; i < n; i++){
            String[]  lines2 = br.readLine().trim().split("");
            redGreenBalls.populateArray(i,lines2);

        }

        int result = redGreenBalls.arrangeRedBalls();
        System.out.println(result);
    }

}

