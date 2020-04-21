package com.radha.onlineproblems;

import java.util.Scanner;

public class ElementOccursOnce {
    int getN(Scanner s){
        return s.nextInt();
    }
     int[] populateArray(int n, Scanner s) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++){

            a[i] = s.nextInt();
        }
        return a;
    }

    int findElementOccursOnce(int a[]){
        /*
        Step 1: set result = 0
        Step2: For each element in the a
                2.1:  EXOR result with current element assign it to result
        Step 3: return result;
         */
        int result = 0;
        for(int i = 0; i < a.length; i++){
            result = result ^ a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        ElementOccursOnce obj = new ElementOccursOnce();
        Scanner s = new Scanner(System.in);
        int n = obj.getN(s);
        int a[] = obj.populateArray(n, s);
        System.out.println(obj.findElementOccursOnce(a));
    }
}
