package Queue;
import java.util.ArrayList;

    class QueueWithArrayList<T> {
        private ArrayList<T> queue;


        public QueueWithArrayList() {
            queue = new ArrayList<T>();
        }


        public void enqueue(T element) {
            queue.add(element);
        }


        public T dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return null;
            }
            return queue.remove(0);
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
            return queue.get(0);
        }

        public static void main(String[] args) {
            QueueWithArrayList<Integer> queue = new QueueWithArrayList<>();


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

