import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountOccurrencesTest {

    @Test
    public void testPutElementWithEmptyMap() throws QueueOverflowException {
        CountOccurrences countOccurrences = new CountOccurrences();
        Map<Integer, Integer> numMap = new HashMap<>();
        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);

       countOccurrences.putElement(queue, numMap);

        Map<Integer, Integer> expected =  new HashMap<>();
        expected.put(1, 1);

    }

    @Test
    public void testPutElementWithNonEmptyMap() throws QueueOverflowException {
        CountOccurrences countOccurrences = new CountOccurrences();
        Map<Integer, Integer> numMap = new HashMap<>();
        numMap.put(1, 1);
        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);

        countOccurrences.putElement(queue, numMap);

        Map<Integer, Integer> expected =  new HashMap<>();
        expected.put(1, 2);

    }

    @Test
    public void testConvertMapToQueue() throws QueueOverflowException {
        CountOccurrences countOccurrences = new CountOccurrences();

        Queue queue = new Queue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);

        Map<Integer, Integer> actual = countOccurrences.convertMapToQueue(queue);

        Map<Integer, Integer> expected =  new HashMap<>();
        expected.put(1, 1);
        expected.put(2, 2);
        expected.put(3, 1);
        expected.put(4, 1);

        assertEquals(expected, actual);
    }

    @Test
    public void findOccurrencesOfNumPresentInTheMap() {
        CountOccurrences countOccurrences = new CountOccurrences();
        Map<Integer, Integer> numMap =  new HashMap<>();
        numMap.put(1, 2);
        numMap.put(2, 2);
        numMap.put(3, 1);
        numMap.put(4, 1);

        int actual = countOccurrences.findOccurrences(numMap, 2);

        assertEquals(2, actual);
    }

    @Test
    public void findOccurrencesOfNumNotPresentInTheMap() {
        CountOccurrences countOccurrences = new CountOccurrences();
        Map<Integer, Integer> numMap =  new HashMap<>();
        numMap.put(1, 2);
        numMap.put(2, 2);
        numMap.put(3, 1);
        numMap.put(4, 1);

        int actual = countOccurrences.findOccurrences(numMap, 5);

        assertEquals(-1, actual);
    }
}