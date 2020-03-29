import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class CountPairsOfNodeTest {
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

        CountPairsOfNode pairs = new CountPairsOfNode();

        Map<Integer, Integer> numberListIntegerMap = pairs.populateMap(head1);

        boolean actual = pairs.isExpectedPair(currentNode, numberListIntegerMap, 15);

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

        CountPairsOfNode pairs = new CountPairsOfNode();

        Map<Integer, Integer> numberListIntegerMap = pairs.populateMap(head1);

        boolean actual = pairs.isExpectedPair(currentNode, numberListIntegerMap, 15);

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

        CountPairsOfNode pairs = new CountPairsOfNode();

        Map<Integer, Integer> numberListIntegerMap = pairs.populateMap(head1);

        boolean actual = pairs.isExpectedPair(currentNode, numberListIntegerMap, 15);

        assertEquals(false, actual);

    }

    @Test
    public void testCountPairsWhoseSumIsX(){

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

        NumberList head2 = new NumberList(11);
        NumberList node22 = new NumberList(12);
        NumberList node23 = new NumberList(13);
        NumberList node24 = new NumberList(14);
        NumberList node25 = new NumberList(15);
        NumberList node26 = new NumberList(16);

        head2.setNextNode(node22);
        node22.setNextNode(node23);
        node23.setNextNode(node24);
        node24.setNextNode(node25);
        node25.setNextNode(node26);

        CountPairsOfNode pairs = new CountPairsOfNode();

        int actual = pairs.countPairsWhoseSumISEqualToX(head1, head2, 15);

        assertEquals(4, actual);

    }


}