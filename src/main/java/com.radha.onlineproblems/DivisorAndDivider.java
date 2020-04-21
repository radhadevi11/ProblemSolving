package com.radha.onlineproblems;

public class DivisorAndDivider {

    private int findMin(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    private int findMax(int[] array){
        int max = array[0];
        for(int i = 1; i < array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    private boolean isDivisible(int[] array, int divisor){
        for(int num : array){
            if(divisor % num != 0){
                return false;
            }
        }
        return true;

    }

    private boolean isDivider(int[] array, int divider){
        for(int num : array){
            if(num % divider   != 0){
                return false;
            }
        }
        return true;

    }

    public void printAllDividerAndDivisor(int[] array1, int[] array2){
        /*
        ALGORITHM:

	Step 1: Find maximum in array1
	Step 2: Find minimum in array2
	Step 3: For num = max to min do
			3.1: if num is not divisible by any one of the elements in array1
				        or num is not divide any one of the elements in in array2 then move to next value of num
			3.2: Otherwise print num
         */
        int maxInArray1 = findMax(array1);
        int minInArray2 = findMin(array2);

        for(int num = maxInArray1; num <= minInArray2; num++){
            if(!isDivisible(array1,num) || !isDivider(array2,num)){
                continue;
            }else{
                System.out.println(num+" ");
            }
        }

    }
}
