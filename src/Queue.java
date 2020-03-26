import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Queue {
    private List<Integer> numbers = new ArrayList<>();
    private int head = -1;
    private int tail = -1;
    private final int CAPACITY = 30;

    public Queue() {
    }

     int getHead() {
        return head;
    }

     int getTail() {
        return tail;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public Queue(List<Integer> numbers)  { //For Test purpose
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    boolean isEmptyQueue(){
        return this.head == -1 && this.tail == -1;
    }

    boolean isLastElement(){
        return this.head == this.tail;
    }

     void addElement(int element) {
        this.tail++;
        numbers.add(this.tail, element);
    }

    public void insert(int element){
        /*ALGORITHM:
                Step 1: if queue is empty
                            1.1 : increment head by 1
                            1.2 : add the element to queue
                Step 2: Otherwise
                            2.1:  add the element to queue
         */
        if(isEmptyQueue()){
            this.head++;
            addElement(element);
        }
        else {
            addElement(element);
        }


    }



    public Optional<Integer> remove(){
        /*ALGORITHM:
            Step 1: If queue is empty
                        1.1: return empty
            Step 2: If it is last element
                        2.1: get last element and return
            Step 3: Otherwise
                        3.1: get the element, increment head and return
         */

        if(isEmptyQueue()){
            return Optional.empty();
        }
        if(isLastElement()){
            return getLastElement();

        }
        Optional<Integer> element = getElement();
        this.head++;
        return element;
    }

     Optional<Integer> getLastElement() {
        /*
        Step 1: get the element
        Step 2: set head and tail to -1
        Step 3: return element

         */
        Optional<Integer> element = getElement();
        this.head = -1;
        this.tail = -1;
        return element;
    }

     Optional<Integer> getElement() {
        return Optional.of(numbers.get(this.head));
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
        return Optional.of(numbers.get(head));
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
