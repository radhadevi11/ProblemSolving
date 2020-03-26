import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class CountOccurrences {

    Queue insertElementsInQueue(Scanner s, int n){
        Queue queue = new Queue();
        for(int i = 0; i < n; i++){
            queue.insert(s.nextInt());
        }
        return queue;

    }

    Map<Integer, Integer> convertMapToQueue(Queue queue){
        /*
        Step 0: create map called numMap
        Step 1: for each element in the queue
                    1.2 : putElement into queue
        Step 2: return map
         */
        Map<Integer, Integer> numMap = new HashMap<>();
        while(queue.getHead() != -1){
         numMap = putElement(queue, numMap);

        }
        return numMap;
    }

      Map<Integer, Integer> putElement(Queue queue, Map<Integer, Integer> numMap) {
        /*
        Step 1: remove the element from queue
                Step 1.1: if the element is already present in the numMap
                                1.1.1: increment it's value by 1
                Step 1.2: put element as a key and value as 1 in numMap
         */
        Integer element = (queue.remove()).get();
        if(numMap.containsKey(element)){
            numMap.replace(element, numMap.get(element)+1);
        }
        else{
            numMap.put(element, 1);
        }
        return numMap;
    }

    int findOccurrences(Map<Integer, Integer> numMap, int numToFind) {

        /*
            Step 1: If the numToFind is present in the map
                        1.1 : return the value
            Step 2: return -1
         */
        if(numMap.containsKey(numToFind)){
            return  numMap.get(numToFind);
        }
        return -1;
    }
    int getNorM(Scanner s){
        return s.nextInt();
    }

    void printOccurrences(int m, Scanner s, Map<Integer, Integer> numMap){
        for (int i = 0; i < m; i++){
            int num = s.nextInt();
            System.out.println(num+ " Occurs "+findOccurrences(numMap, num)+ " times");

        }
    }

    public static void main(String[] args) {
        CountOccurrences countOccurrences = new CountOccurrences();
        Scanner s = new Scanner(System.in);

        int n = countOccurrences.getNorM(s);
        Queue queue = countOccurrences.insertElementsInQueue(s, n);
        Map<Integer, Integer> QueueMap = countOccurrences.convertMapToQueue(queue);

        int m = countOccurrences.getNorM(s);
        countOccurrences.printOccurrences(m, s, QueueMap);





    }

}
