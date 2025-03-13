package Stack;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackReverse {
    public static void reverseStack(Stack<Integer> myStack) {
        Queue<Integer> queue = new LinkedList<>();


        while (!myStack.isEmpty()) {
            queue.add(myStack.pop());
        }


        while (!queue.isEmpty()) {
            myStack.push(queue.remove());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("Original stack: " + myStack);

        reverseStack(myStack);

        System.out.println("Reversed stack: " + myStack);
    }
}