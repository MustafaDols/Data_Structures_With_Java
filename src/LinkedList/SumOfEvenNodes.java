package LinkedList;
    class ListNode2 {
        int data;
        ListNode2 next;

        ListNode2(int val) {
            this.data = val;
        }
    }

   class LinkedListUtils2 {
        public static int sumDiv2List(ListNode2 head) {
            int sum = 0;
            ListNode2 current = head;
            while (current != null) {
                if (current.data % 2 == 0) {
                    sum += current.data;
                }
                current = current.next;
            }
            return sum;
        }

        public static void main(String[] args) {

            ListNode2 head = new ListNode2(1);
            head.next = new ListNode2(2);
            head.next.next = new ListNode2(3);
            head.next.next.next = new ListNode2(4);
            head.next.next.next.next = new ListNode2(5);


            int sum = sumDiv2List(head);
            System.out.println("Sum of even numbers in the list: " + sum);
        }
    }

