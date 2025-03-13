package LinkedList;
class Node10 {
    int data;
    Node10 next;

    Node10(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList10 {
    Node10 head;


    public void insert(int data) {
        Node10 newNode = new Node10(data);
        if (head == null) {
            head = newNode;
        } else {
            Node10 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void removeDuplicates() {
        if (head == null || head.next == null)
            return;

        Node10 current = head;
        while (current != null) {
            Node10 runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node10 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

 class Main10 {
    public static void main(String[] args) {
        LinkedList10 list = new LinkedList10();
        list.insert(10);
        list.insert(20);
        list.insert(10);
        list.insert(30);
        list.insert(20);
        list.insert(40);

        System.out.println("Linked list before removing duplicates:");
        list.printList();

        list.removeDuplicates();

        System.out.println("Linked list after removing duplicates:");
        list.printList();
    }
}