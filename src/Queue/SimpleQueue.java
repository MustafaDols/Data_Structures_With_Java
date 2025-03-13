package Queue;
import java.util.LinkedList;
import java.util.Queue;

    class Main {
        public static void main(String[] args) {
            Queue<Integer> queue = new LinkedList<>();


            queue.add(1);
            queue.add(2);
            queue.add(3);


            System.out.println("Queue: " + queue);


            queue.poll();
            queue.poll();


            System.out.println("Queue after removing elements: " + queue);
        }
    }

