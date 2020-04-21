package com.radha.onlineproblems;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayPuzzle {
    public int[] removeDuplicate(int[] numbers) {
       /* Algorithm:
        Step 1: For each element in the given array
        1.1 compare ith element with i+1 to n-1 th element
        1.2 If any of them is equal to ith element then remove it from the array
        1.3 otherwise move to the next element
        Step 2 : Return the modified array*/

        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; j < numberList.size(); j++) {
                if (numberList.get(j) == numberList.get(i)) {
                    numberList.remove(j);
                }
            }
        }

        //return numberList.stream().mapToInt(Integer::intValue).toArray();
        //return numberList.stream().mapToInt(i->i).toArray();
        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] removeDuplicate2(int[] numbers){
        /*Algorithm(Time Complexity => O(n^2)
                    Space complexity => O(n))
        step 0: Declare a List called numberList
        Step 1: For each element in the numbers
                Step 1.1: If numberList contain the element then do nothing
                Step 1.2: Otherwise add the element to the numberList
         */
        List<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){
            if(!numberList.contains(numbers[i])){
                numberList.add(numbers[i]);
            }
        }
        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
    public int[] removeDuplicateUsingMap(int[] numbers){
        /*Algorithm(Time Complexity => O(n)
                    Space complexity => O(n))
        step 0: Declare a Map called numberMap
        Step 1: For each element in the numbers
                Step 1.1: If numberMap contain the element then do nothing
                Step 1.2: Otherwise add the element to the numberMap
         */
        Map<Integer,Integer> numberMap = new HashMap<>();
        for(int i = 0; i < numbers.length; i++){
            if(!numberMap.containsKey(numbers[i])){
                numberMap.put(numbers[i], numbers[i]);
            }
        }
        return numberMap.values().stream().mapToInt(Integer::intValue).toArray();


    }


}
