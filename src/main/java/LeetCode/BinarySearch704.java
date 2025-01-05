package LeetCode;

public class BinarySearch704 {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12};
        System.out.println(search1(nums, 9));
        System.out.println(search2(nums, 9));
    }

    public static int search1(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) return i;
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high - low)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]>target){
                high = mid - 1;
            }else if(nums[mid]<target){
                low = mid + 1;
            }
        }
        return -1;
    }
}
