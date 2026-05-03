package main.arraystring;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {5};
        System.out.println(findMissingNumber(nums));
    }

    private static int findMissingNumber(int[] nums) {
        if (nums == null) return  -1;
        long n = nums.length + 1;
        long expected =  n * (n + 1) / 2;
        for (int num:nums){ expected -= num;}
        return (int)expected;
    }
}
