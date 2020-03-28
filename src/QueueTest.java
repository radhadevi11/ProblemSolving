import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class QueueTest {

    @Test
    public void testisQueueFull() {
        Queue queue = new Queue();


        boolean actual = queue.isQueueFull();

        assertThat(actual).isEqualTo(false);

    }

    @Test
    public void testisQueueFullForFilledQueue() throws QueueOverflowException {
        Queue queue = new Queue();
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);


        boolean actual = queue.isQueueFull();

        assertThat(actual).isEqualTo(true);

    }


    @Test
    public void testInsertInEmptyQueue() throws QueueOverflowException {
        Queue queue = new Queue();

        queue.insert(10);

        assertThat(queue.getNumbers().size()).isEqualTo(1);

    }

    @Test
    public void testInsertInNonEmptyQueue() throws QueueOverflowException {
        Queue queue = new Queue();

        queue.insert(10);
        queue.insert(5);
        queue.insert(5);

        assertThat(queue.getNumbers().size()).isEqualTo(3);
        assertThat(queue.peek()).isEqualTo(Optional.of(15));

    }

    @Test
    public void testInsertInFilledQueue() throws QueueOverflowException {
        Queue queue = new Queue();

        queue.insert(10);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);
        queue.insert(5);

        assertThatThrownBy(() -> queue.insert(50))
                .isInstanceOf(QueueOverflowException.class)
                .hasMessage("Queue is full, can not insert element:50 Queue capacity : "+ queue.getCAPACITY());

    }


    @Test
    public void testPeekInEmptyQueue() {
        Queue queue = new Queue();


        assertThat(queue.peek()).isEqualTo(Optional.empty());
    }


    @Test
    public void testPeekInNonEmptyQueue() throws QueueOverflowException {
        Queue queue = new Queue();

        queue.insert(10);
        queue.insert(5);

        assertThat(queue.peek()).isEqualTo(Optional.of(10));
    }

    @Test
    public void testIsEmptyQueue() {
        Queue queue = new Queue();

        boolean actual = queue.isEmptyQueue();

        assertThat(actual).isEqualTo(true);
    }

    @Test
    public void testIsEmptyQueueForNonEmptyQueue () throws QueueOverflowException {
        Queue queue = new Queue();
        queue.insert(10);
        queue.insert(5);

        boolean actual = queue.isEmptyQueue();

        assertThat(actual).isEqualTo(false);
    }

    @Test
    public void testRemoveOnEmptyQueue() {
        Queue queue = new Queue();

        assertThat(queue.remove()).isEqualTo(Optional.empty());
    }

    @Test
    public void testRemoveOnSingleElement() throws QueueOverflowException {
        Queue queue = new Queue();
        queue.insert(5);

        assertThat(queue.remove()).isEqualTo(Optional.of(5));

    }

    @Test
    public void testRemoveOnMultipleElements() throws QueueOverflowException {
        Queue queue = new Queue();
        queue.insert(5);
        queue.insert(15);
        queue.insert(25);

        assertThat(queue.remove()).isEqualTo(Optional.of(5));
        assertThat(queue.peek()).isEqualTo(Optional.of(15));

    }





}