package org.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnCollection {

    public static void main(String[] args) {
        // ----- Implement
        // ───── Extend

        // List
        // └───>ArrayList
        // └───>LinkedList
        // └───>Vector<--┐
        // ____Stack-----┘

        // Creation
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(20);
        List<String> list3 = new ArrayList<>(Arrays.asList("A", "B"));
        List<String> list4 = new ArrayList<>(Collections.singleton("hello"));
        List<String> list5 = Arrays.asList("A", "B");
        List<String> list6 = List.of("a", "b");
        List<String> list7 = Collections.emptyList();
        List<String> list8 = Collections.synchronizedList(new ArrayList<>());// Thread safe

        // Addition
        list1.add("first element");
        list2.add(0, "first element");
        list3.addAll(list1);
        list4.addAll(0, list3);
        list8.addFirst("first");
        list8.addLast("last");

        // Removal
        list1.remove(0);

        List<Integer> intList = new ArrayList<>(
                Arrays.asList(1, 2, 3, 6, 4, 6, 5, 7, 8, 6, 1, 6, 523, 22, 3, 2332, 3, 2, 2, 32, 2, 5, 5, 233));
        Predicate<Integer> checkgreaterthan5 = a -> a > 5;
        intList.removeIf(checkgreaterthan5);
        System.out.println(intList);

        intList.removeFirst();
        intList.removeLast();
        System.out.println(intList);
        intList.remove(Integer.valueOf(2)); // remove first occurance of 2

        Iterator itr = intList.iterator();

        while (itr.hasNext()) {
            int x = (int) itr.next();
            if (x == 3)
                itr.remove();
        }
        System.out.println(intList);

        // intList.removeAll(intList);
        // intList.clear();
        // above two remove all elements in ArrayList
        System.out.println(intList);

        System.out.println(list3);

        // +------------------------------------+
        // |____remove duplicate from Array_____|
        // +------------------------------------+
        List<Integer> testList1 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 6, 4, 6, 5, 7, 8, 6, 1, 6, 523, 22, 3, 2332, 3, 2, 2, 32, 2, 5, 5, 233));
        // Option 1
        // testList1 = testList1.stream().distinct().collect(Collectors.toList());

        // Option 2
        // List<Integer> uniqueList = new ArrayList<>();

        // for(Integer i : testList1){
        // if(!uniqueList.contains(i)){
        // uniqueList.add(i);
        // }
        // }

        // Option 3
        // Set<Integer> uniqueSet = new HashSet<>();
        // _____________________________or LinkedHashSet
        // testList1 =
        // testList1.stream().filter(t->uniqueSet.add(t)).collect(Collectors.toList());
        // ___________method referance can be used like uniqueSet::add

        // Option 4
        List<Integer> uniqueList = new ArrayList<>();
        testList1.stream().filter(x -> !uniqueList.contains(x)).forEach(uniqueList::add);
        System.out.println(uniqueList);


        // +-------------------------+
        // |____reverse an Array_____|
        // +-------------------------+

        List<Integer> testList2 = new ArrayList<>(Arrays.asList(1,2,33,54,5,44,45,4,5,44,55,89,98,7,98,7,978,5,3,21));
//        Option 1
//        List<Integer> reverseList = new ArrayList<>();
//        for(Integer i: testList2){
//            reverseList.addFirst(i);
//        }
//        System.out.println("list" + testList2);
//        System.out.println("reversed List" + reverseList);

//        Option 2
//        System.out.println("list" + testList2);
//        Collections.reverse(testList2);
//        System.out.println("reversed List" + testList2);

//        Option 3
        List<Integer> reversedList = new ArrayList<>();
        for(int i = testList2.size()-1; i>=0; i--){
            reversedList.add(testList2.get(i));
        }
        System.out.println("List" + testList2);
        System.out.println("reversedList" + reversedList);

    }
}
