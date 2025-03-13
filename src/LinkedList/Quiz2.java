package LinkedList;


class ListNode22 {
    int val;
    ListNode22 next;

    ListNode22() {
    }

    ListNode22(int x) {
        val = x;
        next = null;
    }


    public void insert(int val) {
        ListNode22 newNode = new ListNode22(val);
        if (next == null) {
            next = newNode;
        } else {
            ListNode22 temp = next;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void display() {
        ListNode22 temp = next;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    ListNode22 head;
    public Boolean isEqual (ListNode22 l1 , ListNode22 l2){
        while (l1!=null && l2!=null){
            if (l1.val!=l2.val)
                return false;

            l1 = l1.next;
            l2 = l2.next; }
        return l1 == null && l2==null;
    }


}
 class TestQuiz2 {
    public static void main(String[] args) {
        ListNode22 l1 = new ListNode22(1);
        l1.next = new ListNode22(2);
        l1.next.next = new ListNode22(3);

        ListNode22 l2 = new ListNode22(1);
        l2.next = new ListNode22(2);
        l2.next.next = new ListNode22(3);

        ListNode22 L =new ListNode22();
        System.out.println(L.isEqual(l1,l2));
        l2.next.next.next = new ListNode22(4);
        System.out.println(L.isEqual(l1,l2));

    }
}
