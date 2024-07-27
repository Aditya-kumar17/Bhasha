package org.Learn.Map;

import java.util.*;
import java.util.stream.Collectors;

public class LearnMap {
    public static void main(String[] args) {
//        Initialize
        Map<String, String> m1 = new HashMap<>();
        Map<String, String> m2 = new LinkedHashMap<>();
        Map<String, String> m3 = new TreeMap<>();

//        Addition
        m1.put("A", "Apple");
        Map<String, String> m4 = new HashMap<>();
        System.out.println(m1);
        m4.put("B", "Ball");
        m2.putAll(m4);
        m2.putIfAbsent("C", "Car");
        m2.putIfAbsent("D", "Dog");
        m2.putIfAbsent("E", "Elephant");
        m2.putIfAbsent("F", "Fox");
        System.out.println(m2.putIfAbsent("C", "candle"));
        System.out.println(m2);

//        Removal
        m2.remove("F");
        System.out.println(m2);
        System.out.println("Remove test 1: " + m2.remove("E", "Elephant"));
        System.out.println("Remove test 2: " + m2.remove("D", "Elephant"));
        System.out.println(m2);

//        Replace
        m2.replace("D", "Dancer");
        System.out.println(m2);
        System.out.println("Replace test 1: " + m2.replace("D", "Dancer", "Desktop"));
        System.out.println("Replace test 2: " + m2.replace("D", "Dark", "Desktop"));

//        Iterate
//        Iterator itr = m2.entrySet().iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

        for (Map.Entry<String, String> stringStringEntry : m2.entrySet()) {
            System.out.println(stringStringEntry);
        }

//        Count Occurrence
        int[] intList = {1, 13, 4, 1, 41, 31, 31, 4, 13, 2};


        // +-----------------------------------------------------------------+
        // |____Convert an String Array to ArrayList of String in Java_______|
        // +-----------------------------------------------------------------+
        List<Integer> arrayList = Arrays.stream(intList).boxed().collect(Collectors.toCollection(ArrayList::new)); //Mutable - can be changed
        List<Integer> arrayList1 = Arrays.stream(intList).boxed().toList();  //Immutable - can't be changed

        Map<Integer, Integer> countOcc = new HashMap<>();

        for (int i = 0; i < intList.length - 1; i++) {
            countOcc.putIfAbsent(intList[i], 1);
//            if(countOcc.get(intList[i])==null){
//                countOcc.put(intList[i],0);
//            }
            int j = countOcc.get(intList[i]);
            countOcc.put(intList[i], ++j);
        }
        System.out.println("Occurrence Count: " + countOcc);


        Map<Integer, Integer> sortedMap = countOcc.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("Sorted Map by Value: " + sortedMap);


        List<Map.Entry<Integer,Integer>> sortedList = new ArrayList<>(countOcc.entrySet());
        sortedList.sort(Map.Entry.comparingByValue());

        Map<Integer, Integer> sortedMap2 = new LinkedHashMap<>();
        for(Map.Entry<Integer,Integer> s: sortedList){
            sortedMap2.put(s.getKey(),s.getValue());
        }
        System.out.println("Sorted Map by Value: " + sortedMap2);

    }
}
