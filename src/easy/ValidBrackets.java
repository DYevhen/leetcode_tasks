package easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.IntStream;

public class ValidBrackets {
    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Example:
     * Input: s = "()"
     * Output: true
     */
    public static void main(String[] main) {
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("(])"));
        System.out.println(isValid(")()"));
    }

    private static boolean valid(char b, char e) {
        return b == '(' && e == ')' || b == '{' && e == '}' || b == '[' && e == ']';
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (valid(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
