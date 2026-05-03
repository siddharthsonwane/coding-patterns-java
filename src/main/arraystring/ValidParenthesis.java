package main.arraystring;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "[({";
        System.out.println(isValidParenthesis(s));
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) + 1);
        }
    }

    private static boolean isValidParenthesis(String input) {
        if (input == null) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : input.toCharArray()){
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch) return false;
        }
        return stack.isEmpty();
    }
}
