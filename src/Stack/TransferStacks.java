package Stack;

import java.util.Stack;
 class Transfer_Stacks {
    public static void main(String[]args){
        Stack<Integer> source = new Stack<>();
        Stack<Integer> destination = new Stack<>();

        source.push(1);
        source.push(2);
        source.push(3);
        System.out.println(source);
        System.out.println(destination);

        transfer(source, destination);
        System.out.println(source);
        System.out.println(destination);
    }
    public static void transfer(Stack<Integer> source, Stack<Integer> destination) {
        while (!source.isEmpty()) {
            destination.push(source.pop());
        }
    }

}

