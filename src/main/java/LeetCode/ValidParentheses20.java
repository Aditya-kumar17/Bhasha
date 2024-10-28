package LeetCode;

import java.util.Stack;

public class ValidParentheses20 {

    public static void main(String[] args) {

        System.out.println(isValid("{{{}}}[]()[{()}]"));
    }

    public static boolean isValid(String s) {
        char pre = s.charAt(0);
        Stack<Character> ch = new Stack<>();


        for (char c : s.toCharArray()) {

            if (c == ')' && pre == '(') {
                ch.pop();
                if(!ch.empty())pre = ch.getLast();else pre=' ';
                continue;
            } else if (c == '}' && pre == '{') {
                ch.pop();
                if(!ch.empty())pre = ch.getLast(); else pre=' ';
                continue;
            } else if (c == ']' && pre == '[') {
                ch.pop();
                if(!ch.empty())pre = ch.getLast();else pre=' ';
                continue;
            }
            ch.push(c);
            pre = c;
        }

        return ch.empty();
    }
}
