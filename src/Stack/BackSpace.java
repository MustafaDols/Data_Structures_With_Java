package Stack;

import java.util.Stack;

public class BackSpace {
    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        BackSpace(s,t);
        System.out.println(BackSpace(s,t));

    }
    public static Boolean BackSpace(String s , String t){
        Stack <Character> stack1 = new Stack<>();
        for(int i =0 ; i<s.length() ; i++){
            if(s.charAt(i)!='#') stack1.push(s.charAt(i));
            else if(!stack1.isEmpty()) stack1.pop();
        }
        String newS ="";
        while (!stack1.isEmpty()) newS += stack1.pop();

        Stack <Character> stack2 = new Stack<>();
        for(int i =0 ; i<t.length() ; i++){
            if(t.charAt(i)!='#') stack2.push(t.charAt(i));
            else if(!stack2.isEmpty()) stack2.pop();
        }
        String newT ="";
        while (!stack2.isEmpty()) newT += stack2.pop();
        return newS.equals(newT);
    }
}
