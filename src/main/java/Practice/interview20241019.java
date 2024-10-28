package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class interview20241019 {
    public static void main(String[] args) {
//        array=sai,latha,aditya,kumar
//        print and count vowels

        List<String> names = new ArrayList<>(Arrays.asList("sai","latha","aditya","kumar"));

        List<String> vowels = Arrays.asList("a","e","i","o","u");

        names.stream().map(interview20241019::countVowels).forEach(System.out::println);
        Map<String, Long> test =  names.stream().collect(Collectors.toMap(x->x, interview20241019::countVowels));
        System.out.println(test);
    }

    public static long countVowels(String s){
        return s.toLowerCase().chars().filter(x->"aeiou".indexOf((char)x)!=-1).count();
    }
}
