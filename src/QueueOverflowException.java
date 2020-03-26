public class QueueOverflowException extends Throwable {

    public QueueOverflowException(Queue queue, Exception e){
        super("Queue is full, can not insert element, capacity : "+ queue.getCAPACITY(), e);
    }
}
