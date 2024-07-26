package org.flow.CollectionsGroup.List.LinkedList;

import java.util.*;

public class LearnLinkedList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("adasd","asdas","sjhd"));
//        Initialize
        List<String> llList1 = new LinkedList<>();
        List<String> llList2 = new LinkedList<>(list);
        List<String> llList3 = new LinkedList<>(Arrays.asList("A","B","C","D","E","F","G","H","I"));
        List<String> llList4 = new LinkedList<>(Collections.singleton("hello"));
        List<String> llList5 = Collections.emptyList();
        List<String> llList6 = Arrays.asList("A","B");
        List<String> llList7 = List.of("a", "b");


//        Addition
        llList1.add("ram");
        llList1.add(1,"test");
        llList1.addAll(list);
        llList1.addAll(2, list);
        llList1.addLast("last");
        llList1.addFirst("first");
        System.out.println(llList1);

//        Removal
        llList3.remove("A");
        llList3.remove(2);
        llList3.removeFirst();
        llList3.removeLast();
        llList3.removeAll(llList6);
        llList3.removeIf(t->t.equals("G"));
        System.out.println(llList3);

//        Iterator
        Iterator<String> itr = llList3.iterator();
//        _________________________llList3.iterator(2);
//        __________________________________________start iterator from specified position
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

//        Contain
        System.out.println("Contains C: " + llList3.contains("C"));

//        Remove All
        llList3.clear();
        System.out.println(llList3);


    }
}
