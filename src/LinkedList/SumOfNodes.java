package LinkedList;
import java.util.List;
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }

     class LinkedListUtils {
        public static int sumList(ListNode head) {
            int sum = 0;
            ListNode current = head;
            while (current != null) {
                sum += current.data;
                current = current.next;
            }
            return sum;
        }


        public static void main(String[] args) {

            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);


            int sum = sumList(head);
            System.out.println("Sum of the list: " + sum);
        }
    }

