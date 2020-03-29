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



}
