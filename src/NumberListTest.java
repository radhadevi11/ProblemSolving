import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class NumberListTest {
    @Test
    public void testIsExpectedPair(){
        NumberList currentNode = new NumberList(11);

        NumberList head1 = new NumberList(1);
        NumberList node2 = new NumberList(2);
        NumberList node3 = new NumberList(3);
        NumberList node4 = new NumberList(4);
        NumberList node5 = new NumberList(5);
        NumberList node6 = new NumberList(6);

        head1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);
        node5.setNextNode(node6);

        Map<NumberList, Integer> numberListIntegerMap = head1.populateMap();

        boolean actual = currentNode.isExpectedPair(currentNode, numberListIntegerMap, 15);

        assertEquals(true, actual);

    }

    @Test
    public void testNotIsExpectedPair(){
        NumberList currentNode = new NumberList(16);

        NumberList head1 = new NumberList(1);
        NumberList node2 = new NumberList(2);
        NumberList node3 = new NumberList(3);
        NumberList node4 = new NumberList(4);
        NumberList node5 = new NumberList(5);
        NumberList node6 = new NumberList(6);

        head1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);
        node5.setNextNode(node6);

        Map<NumberList, Integer> numberListIntegerMap = head1.populateMap();

        boolean actual = currentNode.isExpectedPair(currentNode, numberListIntegerMap, 15);

        assertEquals(false, actual);

    }

    @Test
    public void testIsExpectedPairNotPresentInMap(){
        NumberList currentNode = new NumberList(1);

        NumberList head1 = new NumberList(1);
        NumberList node2 = new NumberList(2);
        NumberList node3 = new NumberList(3);
        NumberList node4 = new NumberList(4);
        NumberList node5 = new NumberList(5);
        NumberList node6 = new NumberList(6);

        head1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);
        node4.setNextNode(node5);
        node5.setNextNode(node6);

        Map<NumberList, Integer> numberListIntegerMap = head1.populateMap();

        boolean actual = currentNode.isExpectedPair(currentNode, numberListIntegerMap, 15);

        assertEquals(false, actual);

    }


}