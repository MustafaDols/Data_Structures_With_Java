package Stack;
import java.util.Stack;
 class Postfix_notation {
    public static void main(String[] args) {
        System.out.println(" 52+83-*4/ = " + postFix("52+83-*4/"));
    }
    public static double postFix(String s){

        Stack<Double> stack = new Stack<Double>();
        int i =0;
        while (i<s.length()){
            if(s.charAt(i)!= '+' || s.charAt(i)!= '-' || s.charAt(i)!= '*' || s.charAt(i)!= '/' ){
                stack.push(((double)s.charAt(i)-'0'));
                i++;
            }
            if (s.charAt(i)=='+'){
                double operator2 = stack.pop();
                double operator1 = stack.pop();
                stack.push(operator1+operator2);
                i++;
            }

            if (s.charAt(i)=='-'){
                double operator2 = stack.pop();
                double operator1 = stack.pop();
                stack.push(operator1-operator2);
                i++;
            }

            if (s.charAt(i)=='*'){
                double operator2 = stack.pop();
                double operator1 = stack.pop();
                stack.push(operator1*operator2);
                i++;
            }

            if (s.charAt(i)=='/'){
                double operator2 = stack.pop();
                double operator1 = stack.pop();
                if (operator2==0){ throw new ArithmeticException(" operator2 cant be zero ");  }
                stack.push(operator1/operator2);
                i++;
            }


        }
        return stack.peek();
    }

}

