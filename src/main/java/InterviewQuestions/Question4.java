package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
        String s = "A D I T Y A";
        char[] charArr = s.toCharArray();
        char[] temp;


//        String t = "";
//        for(char c: charArr){
//            if(c != ' '){
//                t+=c;
//            }
//        }
//        String is immutable, above code will make new object, so it's not very efficient
//        Stringbuilder is mutable

        StringBuilder t = new StringBuilder();
        for(char c: charArr){
            if(c != ' '){
                t.append(c);
            }
        }


        System.out.println(t);

        System.out.println(s.replace(" ",""));
    }
}
