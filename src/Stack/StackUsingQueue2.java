package Stack;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;


    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }


    public void push(int x) {

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }


        queue1.add(x);


        while (!queue2.isEmpty()) {
            queue1.add(queue2.remove());
        }
    }


    public int pop() {
        return queue1.remove();
    }


    public int top() {
        return queue1.peek();
    }


    public boolean isEmpty() {
        return queue1.isEmpty();
    }
}


public class StackUsingQueue2 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        System.out.println("Top element: " + stack.top());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
