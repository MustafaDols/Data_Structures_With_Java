package Queue;

import java.util.Queue;
import java.util.LinkedList;

class QueueReverse {
    public static void reverseQueue(Queue<Integer> myQueue) {
        if (myQueue.isEmpty()) {
            return;
        }

        int front = myQueue.poll();
        reverseQueue(myQueue);
        myQueue.offer(front);
    }

    public static void main(String[] args) {

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        System.out.println("Original queue: " + myQueue);

        reverseQueue(myQueue);

        System.out.println("Reversed queue: " + myQueue);
    }
}