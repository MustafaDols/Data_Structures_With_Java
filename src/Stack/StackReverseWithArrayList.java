package Stack;
import java.util.Stack;
import java.util.ArrayList;
class StackReverseWithArrayList {
    public static void reverseStack(Stack<Integer> myStack) {
        ArrayList<Integer> tempList = new ArrayList<>();


        while (!myStack.isEmpty()) {
            tempList.add(myStack.pop());
        }


        for (Integer element : tempList) {
            myStack.push(element);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println("Original stack: " + myStack);

        reverseStack(myStack);

        System.out.println("Reversed stack: " + myStack);
    }
}