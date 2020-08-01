package com.radha.onlineproblems.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Queue {
    private List<Integer> numbers = new ArrayList<>();
    private final int CAPACITY = 5;

    public Queue() {
    }

    public int getCAPACITY() {
        return CAPACITY;
    }



    public List<Integer> getNumbers() {
        return numbers;
    }

    boolean isEmptyQueue(){
        return this.numbers.isEmpty();
    }


     boolean isQueueFull() {

        return this.numbers.size() == CAPACITY;
    }

    public void insert(int element) throws QueueOverflowException{
        /*ALGORITHM:
                Step 1: if queue is not full empty
                            1.1 : add element in the queue
                Step 2: Otherwise
                            2.1:  throw QueueOverflowException
         */
        if(! isQueueFull()){
            numbers.add(element);
        }else{
            throw new QueueOverflowException(this, element);
        }
    }



    public Optional<Integer> remove(){
        /*ALGORITHM:
            Step 1: If queue is empty
                        1.1: return empty
            Step 2: Otherwise
                        2.1: get the element
                        2.2: remove the element
                        2.3: return removed element

         */

        if(isEmptyQueue()){
            return Optional.empty();
        }
        Optional<Integer> element = Optional.of(numbers.get(0));
        numbers.remove(0);
        return element;
    }




    public    Optional<Integer> peek(){
        /*ALGORITHM:
            Step 1: If queue is empty
                        return empty
            Step 2: Otherwise
                        return the firstElement
         */
        if(isEmptyQueue()){
            return Optional.empty();
        }
        return Optional.of(numbers.get(0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Queue queue = (Queue) o;
        return numbers.equals(queue.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers);
    }




}
