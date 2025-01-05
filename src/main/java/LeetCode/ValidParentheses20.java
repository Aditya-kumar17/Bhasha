package LeetCode;

import java.util.Stack;

public class ValidParentheses20 {

    public static void main(String[] args) {

        System.out.println(isValid1("{{{}}}[]()[{()}]"));
        System.out.println(isValid2("{{{}}}[]()[{()}]"));
    }

    public static boolean isValid1(String s) {
        char pre = s.charAt(0);
        Stack<Character> ch = new Stack<>();


        for (char c : s.toCharArray()) {

            if (c == ')' && pre == '(') {
                ch.pop();
                if (!ch.empty()) pre = ch.getLast();
                else pre = ' ';
                continue;
            } else if (c == '}' && pre == '{') {
                ch.pop();
                if (!ch.empty()) pre = ch.getLast();
                else pre = ' ';
                continue;
            } else if (c == ']' && pre == '[') {
                ch.pop();
                if (!ch.empty()) pre = ch.getLast();
                else pre = ' ';
                continue;
            }
            ch.push(c);
            pre = c;
        }

        return ch.empty();
    }

    public static boolean isValid2(String s) {
        Stack<Character> arr = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                arr.push(c);
            } else {
                char temp = arr.pop();
                if ((c == ')' && temp != '(')
                        || (c == '}' && temp != '{')
                        || (c == ']' && temp != '[')) return false;
            }
        }
        return true;
    }
}
