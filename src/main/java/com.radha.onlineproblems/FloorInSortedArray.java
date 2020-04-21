package com.radha.onlineproblems;

import java.util.*;

public class FloorInSortedArray {
    boolean isLessThanOrEqualToX(int num, int x){
        return num <= x;
    }

    int findFloorInSortedArray(int x, int[] array){
        /*
        Step 2: for each element in the array
                    2.1: if element is equal to x
                            2.1.1: return it's position
                    2.2: if the element is not LessThanOrEqualToX and it is the very first element
                            2.2.1: return -1
                    2.3: if the element is not LessThanOrEqualToX
                            2.3 .1: return the previous element's position
         */
        for(int i = 0; i < array.length; i++){
            if(array[i] == x){
                return i;
            }
             if(!isLessThanOrEqualToX(array[i], x) && i == 0){
                return -1;
            }
             if(!isLessThanOrEqualToX(array[i], x)){
                return i-1;
            }
        }
        return -1;

    }


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

    public static void main(String[] args) {
        FloorInSortedArray floor = new FloorInSortedArray();
        Scanner s = new Scanner(System.in);
        int n = floor.getN(s);
        int x = floor.getN(s);
        int[] array = floor.populateArray(n, s);
        System.out.println(floor.findFloorInSortedArray(x, array));
    }

}
