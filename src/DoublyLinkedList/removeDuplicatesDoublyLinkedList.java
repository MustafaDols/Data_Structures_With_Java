package DoublyLinkedList;

class Node11 {
    int data;
    Node11 prev;
    Node11 next;

    Node11(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList11 {
    Node11 head;


    public void insert(int data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = newNode;
        } else {
            Node11 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }


    public void removeDuplicates() {
        if (head == null || head.next == null)
            return;

        Node11 current = head;
        while (current != null) {
            Node11 runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    runner.prev.next = runner.next;
                    if (runner.next != null) {
                        runner.next.prev = runner.prev;
                    }
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }


    public void printList() {
        Node11 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

 class Main11 {
    public static void main(String[] args) {
        DoublyLinkedList11 list = new DoublyLinkedList11();
        list.insert(10);
        list.insert(20);
        list.insert(10);
        list.insert(30);
        list.insert(20);
        list.insert(40);

        System.out.println("Doubly linked list before removing duplicates:");
        list.printList();

        list.removeDuplicates();

        System.out.println("Doubly linked list after removing duplicates:");
        list.printList();
    }
}
