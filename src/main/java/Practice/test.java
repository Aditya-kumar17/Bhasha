package Practice;

import java.util.Arrays;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        char[] arr = {'a','c'};
        System.out.println(arr);
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        // Set<Character> m1 = new HashSet<>();
        // for(char c:arr){
        //     m1.add(c);
        // }
        // for(char c:arr1){
        //     if(arr.length != arr1.length) return;
        //     if(m1.add(c) == true) return false;
        // }
        // return true;

        Arrays.sort(arr);
        Arrays.sort(arr1);
        System.out.println(arr);
        System.out.println(arr1);
        if(arr.equals(arr1)) return true;
        return false;
    }
}