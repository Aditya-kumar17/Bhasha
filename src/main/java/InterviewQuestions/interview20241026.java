package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class interview20241026 {
    public static void main(String[] args) {
        String s = "axdbcabcae";
        ap1(s);


    }

    public static void ap1(String s){

        char [] arr = s.toCharArray();
        for(char c: arr){
            if(s.indexOf(c) == s.lastIndexOf(c)){
                System.out.println(c);
                break;
            }
        }
    }

    public static void ap2(String s){
        
    }
}
