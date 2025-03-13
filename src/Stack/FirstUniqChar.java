package Stack;

import java.util.Stack;

 class firstUniqChar {
    public static void main(String[] args) {
        String str = "aabb";
        int index = firstNonRepeatingCharacter(str);

        System.out.println(index);
    }

    public static int firstNonRepeatingCharacter(String str) {
        Stack<Character> stack = new Stack<>();
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            count[str.charAt(i)]++;
        }

        while (!stack.isEmpty()) {
            char ch = stack.pop();
            if (count[ch] == 1) {
                return str.indexOf(ch);
            }
        }

        return -1;
    }
}