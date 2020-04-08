import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.Assert.*;

public class MostRepeatedNumbersTest {

    @Test
    public void testGetMostRepeatedNumList() {
        MostRepeatedNumbers mostRepeatedNumbers = new MostRepeatedNumbers();

        Map<Integer, Integer> numMapWithOccurrences = new HashMap<>();
        numMapWithOccurrences.put(1,1);
        numMapWithOccurrences.put(2,1);
        numMapWithOccurrences.put(3,2);
        numMapWithOccurrences.put(4,1);

        List<Integer> actual = mostRepeatedNumbers.getMostRepeatedNumList(numMapWithOccurrences);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(3)));


    }


    @Test
    public void testGetMostRepeatedNumListWithMultipleResults() {
        MostRepeatedNumbers mostRepeatedNumbers = new MostRepeatedNumbers();

        Map<Integer, Integer> numMapWithOccurrences = new HashMap<>();
        numMapWithOccurrences.put(1,1);
        numMapWithOccurrences.put(2,1);
        numMapWithOccurrences.put(3,2);
        numMapWithOccurrences.put(4,1);
        numMapWithOccurrences.put(5,2);

        List<Integer> actual = mostRepeatedNumbers.getMostRepeatedNumList(numMapWithOccurrences);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(3, 5)));


    }



    @Test
    public void testConvertListToMap(){
        MostRepeatedNumbers mostRepeatedNumbers = new MostRepeatedNumbers();
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3, 1, 3, 4, 2));

        Map<Integer, Integer> numMapWithOccurrences = new HashMap<>();
        numMapWithOccurrences.put(1,1);
        numMapWithOccurrences.put(2,1);
        numMapWithOccurrences.put(3,2);
        numMapWithOccurrences.put(4,1);

        Map<Integer, Integer> actual = mostRepeatedNumbers.convertListToMap(numList);

        assertThat(actual).isEqualTo(numMapWithOccurrences);

    }

    @Test
    public void testMostRepeatedNumber(){
        MostRepeatedNumbers mostRepeatedNumbers = new MostRepeatedNumbers();
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(3, 1, 3, 4, 2, 4));

        List<Integer> actual = mostRepeatedNumbers.getMostRepeatedNumbers(numList);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(3, 4)));

    }

    @Test
    public void testKTimesRepeatedNumList() {
        MostRepeatedNumbers repeatedNumbers = new MostRepeatedNumbers();
        Map<Integer, Integer> numMapWithOccurrences = new HashMap<>();
        numMapWithOccurrences.put(1,1);
        numMapWithOccurrences.put(2,2);
        numMapWithOccurrences.put(3,4);
        numMapWithOccurrences.put(4,1);

        List<Integer> actual = repeatedNumbers.getKTimesRepeatedNumList(numMapWithOccurrences, 2);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(2, 3)));
    }

    @Test
    public void testGetKTimesRepeatedNumbers() {
        MostRepeatedNumbers repeatedNumbers = new MostRepeatedNumbers();
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 3, 5, 3));

        List<Integer> actual = repeatedNumbers.getKTimesRepeatedNumbers(numbers, 2);

        assertThat(actual).isEqualTo(new ArrayList<>(Arrays.asList(2, 3)));
    }
}