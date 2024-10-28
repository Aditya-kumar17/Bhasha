package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length==2) return new int[]{0,1};

        Map<Integer, Integer> m1 = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(!m1.containsKey(diff))
                m1.put(nums[i], i);
            else
                return new int[]{i, m1.get(diff)};
        }
        return new int[]{};
    }
}
