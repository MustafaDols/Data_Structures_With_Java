package LinkedList;

class ListNode4 {
    int data;
    ListNode4 next;

    ListNode4(int data) {
        this.data = data;
    }
}

 class LinkedListUtils4 {
    public static int[] findMinMax(ListNode4 head) {
        if (head == null) {
            throw new IllegalArgumentException("List cannot be null");
        }

        int min = head.data;
        int max = head.data;

        ListNode4 current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }

        return new int[]{min, max};
    }


    public static void main(String[] args) {

        ListNode4 head = new ListNode4(3);
        head.next = new ListNode4(1);
        head.next.next = new ListNode4(4);
        head.next.next.next = new ListNode4(1);
        head.next.next.next.next = new ListNode4(5);


        int[] minMax = findMinMax(head);
        System.out.println("Minimum: " + minMax[0]);
        System.out.println("Maximum: " + minMax[1]);
    }
}
