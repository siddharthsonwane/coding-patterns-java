package main.arraystring;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(findMaximumSubarray(nums));
    }

    private static int findMaximumSubarray(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Invalid input");
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i ++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
