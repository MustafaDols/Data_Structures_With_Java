package DoublyLinkedList;
class Node5 {
    int data;
    Node5 prev;
    Node5 next;

    Node5(int data) {
        this.data = data;
    }
}

class DoublyLinkedList2 {
    Node5 head;
    Node5 tail;

    public void append(int data) {
        Node5 newNode = new Node5(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }


    public void printList() {
        Node5 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DoublyLinkedList2 dll = new DoublyLinkedList2();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.append(4);

        System.out.println("Doubly linked list elements:");
        dll.printList();
    }
}