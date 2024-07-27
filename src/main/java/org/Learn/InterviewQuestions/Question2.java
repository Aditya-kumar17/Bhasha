package org.Learn.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question2 {
    public static void main(String[] args) {
//        Let’s say we have a list of title then, print the list of characters of titles.
//        For example:
//        List<String> titles = List.of(“verma”,”karn”,”singh”);
//        Result is List [v,e,r,m,a,k,a,r,n, and so on]
        List<String> titles = List.of("verma", "karn", "singh");
        List<Character> characters = titles.stream()
                .flatMap(t -> t.chars().mapToObj(v -> (char) v)).collect(Collectors.toCollection(ArrayList::new));//mutable
//        ______________________________________________________.toList() Immutable

        characters.add('a');
        System.out.println("List of characters: " + characters);

    }
}
