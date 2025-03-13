package Queue;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class NumberOfStudents {
    public static void main(String[] args) {
        int [] students = {1,1,1,0,0,1};
        int [] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students,sandwiches));
    }
    public static int countStudents(int[] students, int[] sandwiches) {
        Queue <Integer> Q = new LinkedList<>();
        Stack <Integer> S = new Stack<>();

        for (int i=0; i< students.length ;i++){
            Q.add(students[i]);
        }
        for (int i = sandwiches.length-1 ; i>=0 ; i--){
            S.push(sandwiches[i]);
        }
        while (!S.isEmpty() && !Q.isEmpty() && Q.contains(S.peek())){
            if(S.peek()==Q.peek()){
                S.pop();
                Q.poll();
            }
            else {
                Integer x =Q.poll();
                Q.add(x);
            }
        }
        return Q.size();

    }

}


