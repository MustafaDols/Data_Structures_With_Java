package Stack;

import java.util.Scanner;
import java.util.Stack;

 class Main2 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);

        String s = in.next();

        try {
            f(s);
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }

    public static void f (String s ){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)))
                st.push(s.charAt(i) - '0');
            else if (!st.empty()) {
                int cr = st.pop(), cl = st.pop();
                if (s.charAt(i) == '+')
                    st.push(cl + cr);
                else if (s.charAt(i) == '-')
                    st.push(cl - cr);
                else if (s.charAt(i) == '*')
                    st.push(cl * cr);
                else {
                    if
                    (cr == 0)
                        throw new RuntimeException("Undefined process");
                    st.push(cl / cr);
                    System.out.println(st.peek());
                }
            }
        }
    }
}