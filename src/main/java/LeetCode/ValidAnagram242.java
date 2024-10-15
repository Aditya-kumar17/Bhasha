package LeetCode;

import java.util.*;

public class ValidAnagram242 {
    public static void main(String[] args) {

        int [ ] arr = {1,2};
        arr[0]++;
        for(int i: arr) System.out.println(i);
    }
    public static boolean isAnagram1(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr,arr1);
    }

    public static boolean isAnagram2(String s, String t){
        Map<Character, Integer> m1 = new HashMap<>();
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();

        for(char c: arr){
            m1.put(c,m1.getOrDefault(c, 0) + 1 );
        }

        for(char c: arr1){
            m1.put(c,m1.getOrDefault(c, 0) - 1 );
        }

        for(int c: m1.values()){
            if(c!=0) return false;
        }
        return true;
    }

    public static boolean isAnagram3(String s, String t){
        int []arr = new int[26];

        for(char i:s.toCharArray()){
            arr[(int)i-97] = arr[(int)i-97] + 1;
        }

        for(char i:t.toCharArray()){
            arr[(int)i-97] = arr[(int)i-97] - 1;
        }

        for(int i: arr){
            if(i!=0) return false;
        }
        return true;
    }

    public boolean isAnagram4(String s, String t) {
        int []arr = new int[26];

        for(char i:s.toCharArray()){
            arr[i - 'a']++;
        }

        for(char i:t.toCharArray()){
            arr[i-'a']--;
        }

        for(int i: arr){
            if(i!=0) return false;
        }
        return true;
    }
}
