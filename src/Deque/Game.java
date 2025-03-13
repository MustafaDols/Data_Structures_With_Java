package Deque;
import java.util.Deque;
import java.util.*;
 class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Deque<Integer> dq = new LinkedList<>();
        int x;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            dq.add(x);
        }
        int s = 0, d = 0;
        for (int i = 1; i <= n && !dq.isEmpty(); i++) {
            if (i % 2 != 0) {
                s += Math.max(dq.getFirst(), dq.getLast());
                if (dq.getFirst() > dq.getLast())
                    dq.removeFirst();
                else
                    dq.removeLast();
            } else {
                d += Math.max(dq.getFirst(), dq.getLast());
                if (dq.getFirst() > dq.getLast())
                    dq.removeFirst();
                else
                    dq.removeLast();
            }
        }
        System.out.println(s + " " + d);
    }
}
