package com.radha.onlineproblems.queue;

public class QueueOverflowException extends Exception {

    public QueueOverflowException(Queue queue, int element){
        super("Queue is full, can not insert element:"+element+" Queue capacity : "+ queue.getCAPACITY());
    }
}
