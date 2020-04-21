package com.radha.onlineproblems;

import java.util.HashMap;
import java.util.Map;

public class DetectUniqueCountOfNumbers {

    Map<Integer, Integer> convertArrayToMap(int[] numbers){
        Map<Integer, Integer> numberWithOccurrences = new HashMap<>();
        for(int num : numbers){
            if(!numberWithOccurrences.containsKey(num)){
                numberWithOccurrences.put(num, 1);
            }
            else{
                numberWithOccurrences.replace(num, numberWithOccurrences.get(num)+1);
            }
        }
        return numberWithOccurrences;
    }

    boolean hasUniqueOccurrence(Map<Integer, Integer> numberWithOccurrences){
        /*
        Step 0: create a map called resultMap
        Step 1: For each value in the numberWithOccurrences
                1.1: if the resultMap already contain the value as key
                        1.1.1: return false
                2.1: Otherwise
                        2.1.1: add the value as a key in the resultMap
        Step 2: return true
         */
        Map<Integer, Integer> resultMap = new HashMap<>();
        
        for(int key : numberWithOccurrences.keySet()) {
            Integer value = numberWithOccurrences.get(key);
            if(resultMap.containsKey(value)) {
                return false;
            }else {
                resultMap.put(value, value);
            }
        }
        return true;
    }

    boolean hasUniqueOccurrenceInTheArray(int[] numbers){
        Map<Integer, Integer> numberWithOccurrences = convertArrayToMap(numbers);
        return hasUniqueOccurrence(numberWithOccurrences);
    }
}
