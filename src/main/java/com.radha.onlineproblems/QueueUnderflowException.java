package com.radha.onlineproblems;

public class QueueUnderflowException extends Exception {
    public QueueUnderflowException(Queue queue) {
        super("Queue is empty, The Number of element in the queue is: "+ queue.getNumbers().size());
    }
}
