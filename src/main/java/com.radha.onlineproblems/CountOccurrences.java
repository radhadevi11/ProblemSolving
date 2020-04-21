package com.radha.onlineproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {

    Queue insertElementsInQueue() throws QueueOverflowException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Queue queue = new Queue();
        for(int i = 0; i < n; i++){
            queue.insert(s.nextInt());
        }
        return queue;

    }

    Map<Integer, Integer> convertQueueToMap(Queue queue){
        /*
        Step 0: create map called numMap
        Step 1: for each element in the queue
                    1.2 : remove the element from queue
                    1.3 : if isExistingElement
                            1.3.1: put element as a key and value as 1 in numMap
                    1.2 : Otherwise
                            1.2.1: get the element from the map
                            1.2.2: increment it's value by 1
                            1.2.3: replace it's new  value in the map
        Step 2: return map
         */
        Map<Integer, Integer> numMap = new HashMap<>();
        while(!queue.isEmptyQueue()){
          queue.remove().ifPresent((element) -> {
              if(isExistingElement(element, numMap)){
                  numMap.replace(element, numMap.get(element) + 1);
              } else {
                  numMap.put(element, 1);
              }
          });

        }
        return numMap;
    }

      boolean isExistingElement(int num, Map<Integer, Integer> numMap) {
        /*
        Step 1: remove the element from queue
                Step 1.1: if the element is already present in the numMap
                                1.1.1:
                Step 1.2:
         */

         return numMap.containsKey(num);

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


    void printOccurrences(int m, Scanner s, Map<Integer, Integer> numMap){
        for (int i = 0; i < m; i++){
            int num = s.nextInt();
            System.out.println(num+ " Occurs "+findOccurrences(numMap, num)+ " times");

        }
    }

    public static void main(String[] args) throws QueueOverflowException {
        CountOccurrences countOccurrences = new CountOccurrences();
        Scanner s = new Scanner(System.in);

        Queue queue = countOccurrences.insertElementsInQueue();
        Map<Integer, Integer> QueueMap = countOccurrences.convertQueueToMap(queue);

        int m = s.nextInt();
        countOccurrences.printOccurrences(m, s, QueueMap);





    }

}
