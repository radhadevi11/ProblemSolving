public class QueueUnderflowException extends Throwable {
    public QueueUnderflowException(Queue queue, Exception e) {
        super("Queue is empty, The Number of element in the queue is: "+ queue.getHead()+1, e);
    }
}
