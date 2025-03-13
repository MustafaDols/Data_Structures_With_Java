package Stack;

import java.util.Stack;

 class Baseball2 {
    public static void main(String[] args) {
        String [] arr = {"5","2","C","D","+"};
        System.out.println(calcPoints(arr));
    }
    public static int calcPoints(String[] operations){
        Stack <Integer> stack = new Stack<>();
        int sum =0;
        for (int i=0; i<operations.length; i++){
            if(operations[i].equals("+")){
                int x = stack.pop();
                int y = stack.peek();
                int z = x+y;
                stack.push(x);
                stack.push(z);
            }
            else if(operations[i].equals("D")){
                stack.push(2*stack.peek());
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        while (!stack.isEmpty())
            sum = sum+stack.pop();

        return sum;
    }
}

