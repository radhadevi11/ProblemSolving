package com.radha.onlineproblems;

public class QueueOverflowException extends Exception {

    public QueueOverflowException(Queue queue, int element){
        super("Queue is full, can not insert element:"+element+" Queue capacity : "+ queue.getCAPACITY());
    }
}
