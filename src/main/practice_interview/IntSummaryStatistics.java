package main.practice_interview;

import java.util.Arrays;

public class IntSummaryStatistics {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 8, 9, 7};
        java.util.IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        //System.out.println(stat.getMin());
       /// System.out.println(stat.getMax());
//System.out.println(stat.getAverage());
        //System.out.println(stat.getCount());

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

    }
}
