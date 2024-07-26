package org.flow.CollectionsGroup.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LearnArrayList {

    public static void main(String[] args) {
        // ----- Implement
        // ───── Extend

        // List
        // └───>ArrayList
        // └───>LinkedList
        // └───>Vector<--┐
        // ____Stack-----┘

        // Initialize
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

//      Iterator
        Iterator<Integer> itr = intList.iterator();

        while (itr.hasNext()) {
            int x = itr.next();
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
        // List<Integer> reversedList = new ArrayList<>();
        // for(int i = testList2.size()-1; i>=0; i--){
        //     reversedList.add(testList2.get(i));
        // }
        // System.out.println("List" + testList2);
        // System.out.println("reversedList" + reversedList);

        // Option 4
        ListIterator<Integer> itr2 = testList2.listIterator(testList2.size());
        List<Integer> reverseList = new ArrayList<>();
        while(itr2.hasPrevious()){
            reverseList.add(itr2.previous());
        }
        System.out.println("List" + testList2);
        System.out.println("reversedList" + reverseList);


        // +------------------------------------+
        // |____reverse an Array of Objects_____|
        // +------------------------------------+
        Employee e1 = new Employee(351,"Sam", "Phoenix");
        Employee e2 = new Employee(453,"Max", "NY");
        Employee e3 = new Employee(42,"Andre", "Brazil");
        Employee e4 = new Employee(6,"David", "Gaza");
        List<Employee> empList = new ArrayList<>(Arrays.asList(e1,e2,e3,e4));
        System.out.println("Employee List: " + empList.toString());
        Collections.reverse(empList);
        System.out.println("Employee List reversed: " + empList.toString());



        // +-----------------------------------------------------------------+
        // |____Convert an ArrayList of String to a String Array in Java_____|
        // +-----------------------------------------------------------------+
        List<Integer> testList3 = new ArrayList<>(Arrays.asList(1,2,33,54,5,44,45,7,8,9,36,32,66,4,9,39,1,7,6,4,3,99,22,6));
        int[] intArray = new int[testList3.size()];
        for(int i =0;i<intArray.length; i++){
            intArray[i] = testList3.get(i);
        }

        System.out.println("ArrayList" + testList3);
        System.out.println("String Array1" + Arrays.toString(intArray));
        System.out.println("String Array2" + Arrays.toString(testList3.toArray()));

        Integer[] intArray2 = testList3.toArray(new Integer[testList3.size()]);

        System.out.println("String Array3" + Arrays.toString(intArray2));

        int[] intArray3 = testList3.stream().mapToInt(Integer::intValue).toArray();

        int[] intArray4 = new int[testList3.size()];
        Arrays.setAll(intArray4, testList3::get);


        // +-----------------------------------------------------------------+
        // |____Convert an String Array to ArrayList of String in Java_______|
        // +-----------------------------------------------------------------+

        int[] arr1 = new int[1];
        int[] arr2 = {1,2,3,6,4,5,6,8};

        List<Integer> ArrList1 = Arrays.stream(arr2).boxed().collect(Collectors.toCollection(ArrayList::new));


        // +--------------------------------+
        // |____Thread Safe ArrayList_______|
        // +--------------------------------+
        List<Integer> threadSafeList = new CopyOnWriteArrayList<>();

        // +------------------------+
        // |____Sub ArrayList_______|
        // +------------------------+
        List<Integer> testList4 = new ArrayList<>(Arrays.asList(1,2,33,54,5,44,45,7,8,9,36,32,66,4,9,39,1,7,6,4,3,99,22,6));
        List<Integer> subList = testList4.subList(0,15);
        System.out.println(subList);


    }
}

class Employee{
    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "it=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int id;
    public String name;
    public String address;
}
