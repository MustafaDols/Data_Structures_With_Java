package Stack;
import java.util.Stack;

 class removeDuplicate {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("abbaca"));
    }
    public static String removeDuplicates(String s) {
        Stack <Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for (int i = s.length()-1 ; i>=0 ; i--){
            if ( !stack.isEmpty() && stack.peek() == s.charAt(i) )
                stack.pop();

            else
                stack.push(s.charAt(i));
        }

        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();



    }
}
