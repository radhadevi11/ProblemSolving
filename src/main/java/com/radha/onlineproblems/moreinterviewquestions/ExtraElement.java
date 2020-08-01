package com.radha.onlineproblems.moreinterviewquestions;

import java.util.*;

public class ExtraElement {

    int getNOrT(Scanner s){

        int n = s.nextInt();
        return n;
    }

    int findIndexOfExtraElement(int[] array1, int[] array2, int n){
        /*
        ALGORITHM
        Step 1: For each element in the both array
                    1.1: If current element in array 1 is not equal to current element in array 2
                            1.1.1: return the position of current element of array 1
        Step 2: If it reached the last element in array 2
                    2.1: return the array 1's last element's index
         */
        for(int i = 0; i < n-1; i++){
            if(!isSameElement(array1[i], array2[i])){
                return i;
            }
        }
        return n-1;
    }

    void printIndexOfExtraElement(int t, Scanner s){

        for(int i = 0; i < t; i++){
            int n = getNOrT(s);
            int[] array1 = populateArray(n, s);
            int[] array2 = populateArray(n-1, s);
            System.out.println(findIndexOfExtraElement(array1, array2, n));

        }

    }

    private int[] populateArray(int n, Scanner s) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++){

            a[i] = s.nextInt();
        }
        return a;
    }


    boolean isSameElement(int num1, int num2) {
        return num1 == num2;
    }

    public static void main(String[] args) {
        ExtraElement obj = new ExtraElement();
        Scanner s = new Scanner(System.in);
        int t = obj.getNOrT(s);
        //obj.printIndexOfExtraElement(t, n);
        obj.printIndexOfExtraElement(t,  s);
    }
}
