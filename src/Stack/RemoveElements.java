package Stack;

import java.util.Stack;
 class Remove_Elements {
    public static void main(String[]args){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        removeElements(stack);
        System.out.println("After removing  "+stack);
    }
    public static void removeElements(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            stack.pop();
            removeElements(stack);
        }
    }
}

