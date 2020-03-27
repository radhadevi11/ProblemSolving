import java.util.HashMap;
import java.util.Map;

class NumberList{

    private int value;
    private NumberList nextNode;

    public NumberList(int value) {
        this.value = value;
    }


    public void setNextNode(NumberList nextNode){
        this.nextNode = nextNode;
    }
    public int getValue() {
        return value;
    }

    public NumberList getNextNode() {
        return nextNode;
    }


    Map<NumberList, Integer> populateMap(){
        /*
        ALGORITHM:
        Step 1: For each node from tempNode to lastNode
                    1.1: put the node in the map as key and node's value as value
        Step 2: return map
         */
        Map <NumberList, Integer> numberListMap = new HashMap<>();
        NumberList tempNode = this;
        while (tempNode != null){
            numberListMap.put(tempNode, tempNode.getValue());
            tempNode = tempNode.getNextNode();
        }
        return numberListMap;
    }

    int countPairsWhoseSumISEqualToX(NumberList head2, int x){
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
        Map<NumberList, Integer> numberListMap = populateMap();
        NumberList currentNode = head2;
        while (currentNode != null){
            if(isExpectedPair(currentNode, numberListMap, x)){
                count++;
            }
            currentNode = currentNode.nextNode;
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
        if(numListMap.containsValue(numToFind)){
            return true;
        }
        return false;
    }
}
