package main.arraystring;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[]nums = {1,2,3,5,6};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        if (nums == null) return false;
        Set<Integer>seen = new HashSet<>();
        for (int numbers : nums) {
            if (!seen.add(numbers)) {
                return true;
            }
        }
        return false;
    }
}
