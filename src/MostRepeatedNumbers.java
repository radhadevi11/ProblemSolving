import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostRepeatedNumbers {
    List<Integer> getMostRepeatedNumList(Map<Integer, Integer> numMapWithOccurrence){
        /*
        Step 0: Set maxOccur to MIN_VALUE create a list called resultList
        Step 1: for each value in the numMapWithOccurrence
                    1.1: if the value is equal to maxOccur
                                1.1.1: add the key to resultList
                                1.1.2: set maxOccur to value
                    1.2: if the value is less than the maxOccur
                                1.2.1: removeAll element from the resultList
                                1.2.2: add the key into resultList
                                1.2.2: set maxOccur to value
        Step 2: return resultList

         */
        int maxOccur = Integer.MIN_VALUE;
        List<Integer> resultList = new ArrayList<>();
        for (Integer key : numMapWithOccurrence.keySet()){

            Integer value = numMapWithOccurrence.get(key);
            if(isValueEqualToMaxOccur(maxOccur, value)){
                resultList.add(key);
                maxOccur = value;
            }
            if(isValueLessThanMaxOccur(maxOccur, value)){
                resultList.clear();
                resultList.add(key);
                maxOccur = value;
            }
        }
        return resultList;
    }

    private boolean isValueLessThanMaxOccur(int maxOccur, Integer value) {
        return value >  maxOccur;
    }

    private boolean isValueEqualToMaxOccur(int maxOccur, Integer value) {
        return value == (maxOccur);
    }

    Map<Integer, Integer> convertListToMap(List<Integer> numbers){
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

    List<Integer> getMostRepeatedNumbers(List<Integer> numbers){
        Map<Integer, Integer> numMapWithOccurrences = convertListToMap(numbers);
        return getMostRepeatedNumList(numMapWithOccurrences);

    }
}
