package InterviewQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String[] args) {
        // ("Aditya", "Kumar")
        // convert this to ('A','D','I','T','Y','A','K',..args..args..args..args.)
        List<String> strLis = new ArrayList<>(Arrays.asList("Aditya", "Kumar"));
        List<Character> charLis = new ArrayList<>();
        charLis = strLis.stream().flatMap(t->t.chars().mapToObj(v->(char)v)).map(x->Character.toUpperCase(x)).collect(Collectors.toCollection(ArrayList::new));
        charLis = strLis.stream().flatMap(t->t.chars().mapToObj(v->(char)v).map(x->Character.toUpperCase(x))).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(charLis);
    }
}
