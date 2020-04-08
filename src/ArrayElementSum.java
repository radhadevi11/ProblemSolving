import java.util.HashMap;
import java.util.Map;

public class ArrayElementSum {
    Map<Integer, Integer> convertArrayToMap(int[] numbers) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int num : numbers){
            numMap.put(num, num);
        }
        return numMap;
    }

    boolean isSumEqualToK (int k, Map<Integer, Integer> numMap, int[] numbers) {
        /*
        Step 1: For each element in the numbers
                    1.1: subtract the element with k and find absolute
                    1.2: set the result to numToFind
                    1.3: if numToFind is present in the map
                            1.3.1: return true
        Step 2: return false
         */
        for(int num : numbers) {
            int numToFind = Math.abs(num - k);
            if(numMap.containsKey(numToFind)) {
                return true;
            }
        }
        return false;
    }

    boolean isSumOfElementsEqualToK (int k, int[] numbers) {
        Map<Integer, Integer> numMap = convertArrayToMap(numbers);
        return isSumEqualToK(k, numMap, numbers);
    }
}
