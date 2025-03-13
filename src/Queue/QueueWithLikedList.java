package Queue;
import java.util.LinkedList;

class QueueWithLinkedList<T> {
    private LinkedList<T> queue;


    public QueueWithLinkedList() {
        queue = new LinkedList<>();
    }


    public void enqueue(T element) {
        queue.addLast(element);
    }


    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue.removeFirst();
    }


    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public int size() {
        return queue.size();
    }


    public T front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        return queue.getFirst();
    }

    public static void main(String[] args) {
        QueueWithLinkedList<Integer> queue = new QueueWithLinkedList<>();


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);


        System.out.println("Front element: " + queue.front());


        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());


        System.out.println("Front element: " + queue.front());


        queue.enqueue(40);
        queue.enqueue(50);


        System.out.println("Size of the queue: " + queue.size());


        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());


        System.out.println("Dequeued: " + queue.dequeue());
    }
}
