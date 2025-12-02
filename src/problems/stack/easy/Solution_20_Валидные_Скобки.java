package problems.stack.easy;

import java.util.Stack;

public class Solution_20_Валидные_Скобки {
    public static boolean isValid(String s) {
        if (s.charAt(0) == '}' || s.charAt(0) == ')' || s.charAt(0) == ']') {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                case '(':
                case '[':
                    stack.push(s.charAt(i));
                    break;
                case '}':
                    if (!stack.empty()) {
                        if (stack.peek() == '{') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else {
                        stack.push(s.charAt(i));
                    }
                    break;
                case ')':
                    if (!stack.empty()) {
                        if (stack.peek() == '(') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else {
                        stack.push(s.charAt(i));
                    }
                    break;
                case ']':
                    if (!stack.empty()) {
                        if (stack.peek() == '[') {
                            stack.pop();
                        } else {
                            stack.push(s.charAt(i));
                        }
                    } else {
                        stack.push(s.charAt(i));
                    }
                    break;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}
