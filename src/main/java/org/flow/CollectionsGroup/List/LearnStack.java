package org.flow.CollectionsGroup.List;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        // its Thread safe
        // Initialize
        Stack<Integer> stk1 = new Stack<>();

        // addition
        stk1.add(1);
        stk1.push(123);
        stk1.push(654);
        stk1.push(453);
        stk1.push(6);
        stk1.push(68);
        stk1.push(1);
        System.out.println(stk1);

        stk1.pop();
        stk1.pop();
        stk1.pop();
        System.out.println(stk1);

        System.out.println("View top element of stack: " + stk1.peek());
        System.out.println("Search 654 element of stack: " + stk1.search(654));
        System.out.println("Check stack empty: " + stk1.empty());

    }
}
