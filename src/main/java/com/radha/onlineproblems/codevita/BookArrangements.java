package com.radha.onlineproblems.codevita;

import java.util.Scanner;

/*
getInput
    - noOfBooks
getPossibleArrangements
    - formula n!(1 - 1/1! + 1/2! - 1/3! .... 1/n!)
    - totalArrangements = factorial(n)
    - possibleArrangements = 0
    - for each value from 2 to n
        - find factorial of current value
        - divide result by totalArrangements
        - if the value is odd
            multiply the result by -1 and add with possibleArrangements
        - otherwise
            add with possibleArrangements

 */
public class BookArrangements {
    int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        return  n * factorial(n - 1);
    }
    /* 4
    4![1 - 1/1! + 1/2! - 1/3! + 1/4!]
          24 [12 - 4 + 1 /24] => 9
     */
    int getPossibleArrangements(int noOfBooks) {
        int totalArrangements = factorial(noOfBooks);
        int possibleArrangements = 0;
        for(int i = 2; i <= noOfBooks; i++) {
            int curArrangement = totalArrangements / factorial(i);
            if(i % 2 != 0) {
                possibleArrangements = possibleArrangements + (-1 * curArrangement);
            } else {
                possibleArrangements += curArrangement;
            }
        }
        return possibleArrangements;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int noOfBooks = s.nextInt();
        BookArrangements book = new BookArrangements();
        book.getPossibleArrangements(noOfBooks);
    }
}
