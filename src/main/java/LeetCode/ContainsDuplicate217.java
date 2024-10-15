package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217 {

    public static void main(String[] args) {
        System.out.println("hello");
        containsDuplicate(new int[]{1,2,3,4,6,4,1});
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for (int n : nums) {
            if (arr.add(n) == false)
                return true;
        }
        return false;
    }
}

