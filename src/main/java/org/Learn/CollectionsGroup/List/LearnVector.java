package org.Learn.CollectionsGroup.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class LearnVector {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList("a","b"));

//      Initialize
        List<String> vec1 = new Vector<>();
        List<String> vec2 = new Vector<>(Arrays.asList("A","B"));
        List<String> vec3 = new Vector<>(strList);
        List<String> vec4 = new Vector<>(Collections.singleton("hello"));
        List<String> vec5 = Collections.emptyList();
        List<String> vec6 = Arrays.asList("A","B");
        List<String> vec7 = List.of("a", "b");

        //      Addition
        vec1.add("sdfsd");
        vec1.add(1,"test");
        vec1.addFirst("first");
        vec1.addAll(strList);
        vec1.addAll(vec6);
        vec1.addAll(2,strList);
        vec1.addLast("last");
        System.out.println(vec1);

//      Removal
        List<String> vec8 = vec1;
        vec8.remove(1);
        vec8.remove("A");
        vec8.removeAll(vec7);
        vec8.removeIf(t->t.contains("A"));
        vec8.removeLast();
        vec8.removeFirst();
        System.out.println(vec8);
        vec8.clear();
        System.out.println(vec8);
        System.out.println("CheckIfEmpty: " + vec8.isEmpty());

        // Setting Value

        vec2.set(1, "element");
        System.out.println(vec2);

        // Iterator
        Iterator itr = vec2.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Min and Max
        System.out.println("Min: " + Collections.min(vec2));
        System.out.println("Max: " + Collections.max(vec2));

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        Vector<Integer> V = new Vector<Integer>();

        V.add(100);
        V.add(30);
        V.add(7);
        V.add(24);
        V.add(13);

        System.out.println("Vector elements : " + V);

        for (Integer i : V) {
            if (i > maxValue) {
                maxValue = i;
            }
            if (i < minValue) {
                minValue = i;
            }
        }

        System.out.println("Maximum Element in Vector : " + maxValue);
        System.out.println("Minimum Element in Vector : " + minValue);
        
    }
}
