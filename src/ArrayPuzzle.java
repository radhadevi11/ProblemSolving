import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayPuzzle {
    public Integer[] removeDuplicate(int[] numbers) {
       /* Algorithm:
        Step 1: For each element in the given array
        1.1 compare ith element with i+1 to n-1 th element
        1.2 If any of them is equal to ith element then remove it from the array
        1.3 otherwise move to the next element
        Step 2 : Return the modified array*/

        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        for (int i = 0; i < numberList.size(); i++) {
            for (int j = i + 1; i < numberList.size(); j++) {
                if (numberList.get(j) == numberList.get(i)) {
                    numberList.remove(j);
                }
            }
        }
        Integer[] emptyArray = new Integer[0];
        return numberList.toArray(emptyArray);
    }


}
