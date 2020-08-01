package com.radha.onlineproblems.bytes;

import java.util.Scanner;

public class SpiralMatrix {
    /*
    for each time i = 0 to n/2 do
                printLeftToRight
                printTopToBottom
                printRightToLeft
                printBottomToTop
     */
    public static void main(String[] args) {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        Scanner s = new Scanner(System.in);
        int rowSize = s.nextInt();
        int[][] a = spiralMatrix.getMatrix(rowSize);
        spiralMatrix.printSpiral(a);
    }

    private  int[][] getMatrix(int n) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        return a;
    }

    public void printSpiral(int a[][]) {
            int tempIndex = a.length - 1;
            int limit = (int) Math.ceil(a.length/2);
            for(int i = 0; i <= limit ; i++) {
                printLeftToRight(a, i, a[i].length);
                printTopToBottom(a, i, a[i].length, tempIndex);
                printRightToLeft(a, i, a[i].length, tempIndex);
                printBottomToTop(a, i, tempIndex);
                tempIndex--;
            }

    }

     void printBottomToTop(int[][] a, int i, int tempIndex) {
         System.out.println("bottom to top");
        for(int m = tempIndex; m > i; m--) {
            System.out.print(a[m][i]+" ");
        }
    }

     void printRightToLeft(int[][] a, int i, int length, int tempIndex) {

        for(int l = length-i-1; l > i; l--) {
            System.out.print(a[tempIndex][l]+" ");
        }
    }

     void printTopToBottom(int[][] a, int i, int length, int tempIndex) {
         System.out.println("Top to bottom");
        for(int k = i; k <  length-1-i; k++) {
            System.out.print(a[k][tempIndex]+" ");
        }
    }

     void  printLeftToRight(int[][] a, int i, int length) {
         System.out.println("left to right");
        for (int j = i; j < length-i-1; j++) {
            System.out.print(a[i][j]+" ");
        }
    }

     boolean isSquareMAtrix(int[][] a) {
        int rowSize = a.length;
        for(int i = 0; i < rowSize; i++) {
            if(a[i].length != rowSize) {
                return false;
            }
        }
        return true;
    }
}
