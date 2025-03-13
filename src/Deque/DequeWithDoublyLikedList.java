package Deque;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Deque {
    private Node head;
    private Node tail;

    public Deque() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void AddFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void AddLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public int RemoveFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int data = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return data;
    }

    public int RemoveLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        int data = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        return data;
    }

    public int first() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return head.data;
    }

    public int last() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return tail.data;
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.AddFirst(1);
        deque.AddFirst(2);
        deque.AddLast(3);

        System.out.println(deque.first());
        System.out.println(deque.last());

        deque.RemoveFirst();
        System.out.println(deque.first());

        deque.RemoveLast();
        System.out.println(deque.last());
    }
}