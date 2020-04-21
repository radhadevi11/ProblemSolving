package com.radha.onlineproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KthSmallest {
    int getKOrN(Scanner s){
        return s.nextInt();
    }

    private int[] populateArray(int n, Scanner s) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++){

            a[i] = s.nextInt();
        }
        return a;
    }



    void printKthSmallest(int t, Scanner s){
        for(int i = 0; i < t; i++){
            int n = getKOrN(s);
            int k = getKOrN(s);
            int[] array = populateArray(n, s);
            System.out.println(findKthSmallest(k, array));
        }
    }

    int findKthSmallest(int k, int[] numbers){
        /*
        ALGORITHM:
        Step 0: create a numberMap and set min = 0
        Step 1: For k times
                    1.1: set min = findMinExceptInTheMap()
                    1.2: put the min into numberMap
        Step 2: return min
         */
        int min = 0;
        Map<Integer, Integer> numberMap = new HashMap<>();
        for(int i = 0; i < k; i++){
            min = findMinExceptInTheMap(numberMap, numbers);
            numberMap.put(min, min);
        }
        return min;
    }

    int findMinExceptInTheMap(Map<Integer, Integer> numberMap, int[] numbers){
        /*
        ALGORITHM:
        Step 0: Set min to maxValue
        Step 1: For each element in the numbers
                    1.1: if isExpectedMin
                                1.1.1: set min to current element
        Step 2: return min
         */

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if(isExpectedMin(numberMap, numbers[i], min)){
                min = numbers[i];
            }
        }

        return min;

    }

    boolean isExpectedMin(Map<Integer, Integer> numberMap, int num, int min){
        /*
        Step 1: if num is not present in the numberMap and the element is smaller than min
                        1.1 return true
        Step 2: return false
         */

        return !numberMap.containsKey(num) && num < min;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        KthSmallest obj =  new KthSmallest();

        int t = obj.getKOrN(s);
        
        obj.printKthSmallest(t, s);
    }
}
