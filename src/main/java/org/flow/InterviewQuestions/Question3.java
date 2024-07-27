package org.flow.InterviewQuestions;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
//        10,15,8,49,25,98,98,32,15
//        find send max with stream java
        List<Integer> intList = new ArrayList<>(Arrays.asList(10,15,8,49,25,98,98,32,15));
        Optional<Integer> i1 = intList.stream().sorted().skip(intList.size()-2).findFirst();
        Optional<Integer> i2 = intList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(i1.get());
        System.out.println(i2.get());

//        Lengthy approach
        int i=1;
        Optional<Integer> max1 = intList.stream().max(Integer::compare);
        Optional<Integer> secondMax1 = intList.stream().sorted(Comparator.reverseOrder()).skip(i).findFirst();
        for(Integer j : intList){
            if(secondMax1.get().equals(max1.get())){
                secondMax1 = intList.stream().sorted(Comparator.reverseOrder()).skip(++i).findFirst();
            }
            break;
        }
        System.out.println("Actual Second Max: " + secondMax1.get());

//        Optimize approach
        Optional<Integer> max2 = intList.stream().max(Integer::compare);
        if(max1.isPresent()){
            Optional<Integer> secondMax2 = intList.stream().filter(t->!t.equals(max2.get())).max(Integer::compare);
            if(secondMax2.isPresent())
                System.out.println("Actual Second Max with good approach: " + secondMax2.get());
            else{
                System.out.println("No second Max is present");
            }
        } else{
            System.out.println("List is empty");
        }

    }
}
