package main.arraystring;

import java.util.*;

public class TwoSum{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,5,7,8,9};
        int target = 13;
        System.out.println(Arrays.toString(findTwoSum(nums,target)));
    }

    private static int[] findTwoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) return new int[] {-1,-1};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement), i };
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
