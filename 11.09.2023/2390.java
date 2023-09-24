import java.util.*;

class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && s.charAt(i) == '*') {
                stack.pop();
            } else if (s.charAt(i) != '*') {
                stack.add(s.charAt(i));
            }
        }

        for (char chr : stack) {
            str.append(chr);
        }

        return str.toString();
    }
}
