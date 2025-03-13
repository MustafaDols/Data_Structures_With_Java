package Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack1 {
    private Node top;
    private int size;

    public Stack1() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int popped = top.data;
            top = top.next;
            size--;
            return popped;
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }
}

class LinkedStack {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size of stack: " + stack.size());

        System.out.println("Top element: " + stack.top());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Size of stack: " + stack.size());

        stack.push(4);
        System.out.println("Top element: " + stack.top());
    }
}