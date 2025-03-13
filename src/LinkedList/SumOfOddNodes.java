package LinkedList;
class ListNode3 {
    int data;
    ListNode3 next;

    ListNode3(int val) {
        this.data = val;
    }
}

 class LinkedListUtils3 {
    public static int sumDiv2List(ListNode3 head) {
        int sum = 0;
        ListNode3 current = head;
        while (current != null) {
            if (current.data % 2 != 0) {
                sum += current.data;
            }
            current = current.next;
        }
        return sum;
    }

    public static void main(String[] args) {

        ListNode3 head = new ListNode3(1);
        head.next = new ListNode3(2);
        head.next.next = new ListNode3(3);
        head.next.next.next = new ListNode3(4);
        head.next.next.next.next = new ListNode3(5);


        int sum = sumDiv2List(head);
        System.out.println("Sum of odd numbers in the list: " + sum);
    }
}