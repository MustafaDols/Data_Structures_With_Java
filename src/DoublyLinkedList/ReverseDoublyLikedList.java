package DoublyLinkedList;

class Node6 {
    int data;
    Node6 prev;
    Node6 next;

    Node6(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList3 {
    Node6 head;
    DoublyLinkedList3() {
        head = null;
    }
    void reverse() {
        Node6 temp = null;
        Node6 current = head;


        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }


        if (temp != null) {
            head = temp.prev;
        }
    }


    void insert(int data) {
        Node6 newNode = new Node6(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }


    void display() {
        Node6 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

 class Test {
    public static void main(String[] args) {
        DoublyLinkedList3 list = new DoublyLinkedList3();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original doubly linked list:");
        list.display();

        list.reverse();

        System.out.println("Reversed doubly linked list:");
        list.display();
    }
}
