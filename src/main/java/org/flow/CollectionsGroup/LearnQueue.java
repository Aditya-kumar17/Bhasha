package org.flow.CollectionsGroup;

import java.util.*;

public class LearnQueue {
    public static void main(String[] args) {
//        Initialize
        Deque<String> q1 = new ArrayDeque<>(); //both directional
        Queue<String> q2 = new PriorityQueue<>(); // one directional
        Queue<String> q3 = new LinkedList<>();

//        Addition
        q1.add("1223");
        q1.offer("453");
        q1.addFirst("4");
        q1.addLast("34");
        q1.push("99");
        q1.offerFirst("8484");
        q1.offerLast("98");

        q2.add("86");
        q2.offer("36");
        q2.add("78");
        q2.add("25");
        q2.add("41");

//        Removal
        System.out.println(q1.poll());
        System.out.println(q1.remove());
        System.out.println(q1.removeFirst());
        System.out.println(q1.removeLast());
        System.out.println(q1.removeIf(t->t.length()==2));
        System.out.println(q1);



        System.out.println(q2.poll());
        System.out.println(q2.remove());
        System.out.println(q2);


//        Iterator
//        Iterator itr = q2.iterator();
//
//        while(itr.hasNext()){
//            System.out.println("Iterator print: " + itr.next());
//        }
        for (String s : q2) {
            System.out.println("Iterator print: " + s);
        }

        System.out.println(q2.element());
        System.out.println(q2.peek());

    }
}
