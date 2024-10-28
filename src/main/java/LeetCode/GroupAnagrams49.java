package LeetCode;

import java.util.*;

public class GroupAnagrams49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map< Integer,String> arr = new HashMap<>();
        int k=0;
        for(String s: strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            arr.put( k++,String.valueOf(temp));
        }


        System.out.println(arr);
        List<List<String>> result =  new ArrayList<>();

        for(int i=0; i<arr.size(); i++){
            Map<String, List<String>> temp = new HashMap<>();
            List<String> t2 = new ArrayList<>();

            for(int j =i+1; j<arr.size(); j++){


            }

        }

             return result;
    }
}
