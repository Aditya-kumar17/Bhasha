package org.flow.CollectionsGroup.Set;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

public class LearnSet {
    public static void main(String[] args) {
        List<String> stList = new ArrayList<>();
//        Types of Set
        Set<String> hSet = new HashSet<>();
        Set<String> lhSet = new LinkedHashSet<>();
        Set<String> tSet = new TreeSet<>();
        Set<String> cwSet = new CopyOnWriteArraySet<>();


        Set<Day> eSet1 = EnumSet.of(Day.MONDAY,Day.THURSDAY);
        Set<Day> eSet2 = EnumSet.allOf(Day.class);


//        initialize
        Set<String> st1 = new HashSet<>();
        Set<String> st2 = new HashSet<>(Arrays.asList("as","asd"));
        Set<String> st3 = new HashSet<>(Collections.singleton("as"));
        Set<String> st4 = new HashSet<>(stList);
        Set<String> st5 = Collections.emptySet();

//        Addition
        st1.add("sdf");
        st1.add("gndfh");
        st1.add("oldfhdh");
        st1.add("axdg");
        st1.add("ty");
        st2.addAll(st1);


//        Removal
        st1.remove("sdf");
        st1.removeIf(t->t.length()==2);
        System.out.println(st1);

//        Iterator
        for(String s: st1){
            System.out.println(s);
        }
        st1.forEach(System.out::println);
        Iterator itr = st1.iterator();

//        Max/Min
        System.out.println("Max" + Collections.max(st1));
        System.out.println("Min" + Collections.min(st1));

//        sort
        List<String> list1 = new ArrayList<>(st1);
        Collections.sort(list1);
        System.out.println(list1);

    }
}
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
