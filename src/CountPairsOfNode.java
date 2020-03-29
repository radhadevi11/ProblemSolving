import java.util.HashMap;
import java.util.Map;

public class CountPairsOfNode {
    Map<Integer, Integer> populateMap(NumberList head){
        /*
        ALGORITHM:
        Step 1: For each node from tempNode to lastNode
                    1.1: put the node's value in the map as key and node's value as value
        Step 2: return map
         */
        Map <Integer, Integer> numberListMap = new HashMap<>();
        NumberList tempNode = head;
        while (tempNode != null){
            numberListMap.put(tempNode.getValue(), tempNode.getValue());
            tempNode = tempNode.getNextNode();
        }
        return numberListMap;
    }

    int countPairsWhoseSumISEqualToX(NumberList head1, NumberList head2, int x){
        /*
        ALGORITHM:
        Step 0: set count = 0
        Step 1: populateMap() with head 1
        Step 2: For each node from head2 to last
                    2.1: if isExpectedPair
                            2.1.1: increment count by 1
        Step 3: Return count

         */
        int count = 0;
        Map<Integer, Integer> numberListMap = populateMap(head1);
        NumberList currentNode = head2;
        while (currentNode != null){
            if(isExpectedPair(currentNode, numberListMap, x)){
                count++;
            }
            currentNode = currentNode.getNextNode();
        }
        return count;
    }
    boolean isExpectedPair(NumberList currentNode, Map numListMap, int x){
        /*
                    Step 1: Get the value of the currentNode
                    Step 2: Subtract it with x and find absolute then assign it to numToFind
                    Step 3: if the map contain numToFind
                            3.1: return true
                    Step 4: return false;
         */
        if(currentNode.getValue() > x ){
            return false;
        }
        int numToFind = Math.abs(currentNode.getValue() - x);
        if(numListMap.containsKey(numToFind)){
            return true;
        }
        return false;
    }
}
