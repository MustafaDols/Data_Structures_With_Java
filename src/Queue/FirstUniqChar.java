package Queue;

import java.util.LinkedList;
import java.util.Queue;

 class firstUniqChar {
    public static void main(String[] args) {
        String str = "aaccd";
        int index = firstNonRepeatingCharacter(str);

        System.out.println(index);
    }

    public static int firstNonRepeatingCharacter(String s) {
        Queue <Character> queue = new LinkedList<>();
        int count =0;
        for (int i = 0; i < s.length(); i++) {
            queue.add(s.charAt(i));
        }
        while (!queue.isEmpty()){
            char c = queue.poll();
            if (!queue.contains(c))
                return s.indexOf(c);
            else
                queue.add(c);

            count++;
            if(count==s.length()) break;
        }
        return -1;

    }
}
