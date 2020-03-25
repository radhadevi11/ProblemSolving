import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class QueueTest {

    @Test
    public void testIsEmptyQueue() {
        Queue queue = new Queue();

        boolean actual = queue.isEmptyQueue();

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void testAddElement() {
        Queue queue = new Queue();

        queue.addElement(5);
        queue.addElement(10);

        assertThat(queue).isEqualTo(new Queue(
                new ArrayList<>(
                        Arrays.asList(5,10))));

        assertThat(queue.getTail()).isEqualTo(1);

    }

    @Test
    public void testInsertInEmptyQueue() {
        Queue queue = new Queue();

        queue.insert(10);

        assertThat(queue.peek()).isEqualTo(Optional.of(10));

        assertThat(queue.getHead()).isEqualTo(0);
        assertThat(queue.getTail()).isEqualTo(0);
    }

    @Test
    public void testInsertInNonEmptyQueue() {
        Queue queue = new Queue();

        queue.insert(10);
        queue.insert(5);
        queue.insert(5);

        assertThat(queue.peek()).isEqualTo(Optional.of(10));
        assertThat(queue.getHead()).isEqualTo(0);
        assertThat(queue.getTail()).isEqualTo(2);
    }


    @Test
    public void testPeekInEmptyQueue() {
        Queue queue = new Queue();


        assertThat(queue.peek()).isEqualTo(Optional.empty());
    }


    @Test
    public void testPeekInNonEmptyQueue() {
        Queue queue = new Queue();

        queue.insert(10);
        queue.insert(5);

        assertThat(queue.peek()).isEqualTo(Optional.of(10));
        assertThat(queue.getHead()).isEqualTo(0);
        assertThat(queue.getTail()).isEqualTo(1);
    }

    @Test
    public void testIsEmptyQueueForNonEmptyQueue () {
        Queue queue = new Queue();

        boolean actual = queue.isEmptyQueue();

        assertThat(actual).isEqualTo(true);
    }



    @Test
    public void testIsLastElement() {
        Queue queue = new Queue();
        queue.insert(5);

        assertThat(queue.isLastElement()).isEqualTo(true);
    }

    @Test
    public void testIsLastElementWithMultipleElements() {
        Queue queue = new Queue();
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);

        assertThat(queue.isLastElement()).isEqualTo(false);
    }


    @Test
    public void testGetElement() {
        Queue queue = new Queue();
        queue.insert(5);
        queue.insert(10);
        queue.insert(15);

        assertThat(queue.getElement()).isEqualTo(Optional.of(5));

    }

    @Test
    public void testGetLastElement() {
        Queue queue = new Queue();
        queue.insert(5);

        assertThat(queue.getLastElement()).isEqualTo(Optional.of(5));
        assertThat(queue.getHead()).isEqualTo(-1);
        assertThat(queue.getTail()).isEqualTo(-1);
    }
    @Test
    public void testRemoveOnEmptyQueue() {
        Queue queue = new Queue();

        assertThat(queue.remove()).isEqualTo(Optional.empty());
    }

    @Test
    public void testRemoveOnSingleElement() {
        Queue queue = new Queue();
        queue.insert(5);

        assertThat(queue.remove()).isEqualTo(Optional.of(5));
        assertThat(queue.getHead()).isEqualTo(-1);
        assertThat(queue.getTail()).isEqualTo(-1);
    }

    @Test
    public void testRemoveOnMultipleElements() {
        Queue queue = new Queue();
        queue.insert(5);
        queue.insert(15);
        queue.insert(25);

        assertThat(queue.remove()).isEqualTo(Optional.of(5));
        assertThat(queue.getHead()).isEqualTo(1);
        assertThat(queue.getTail()).isEqualTo(2);
    }





}