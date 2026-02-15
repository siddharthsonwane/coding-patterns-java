package main.arraystring;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class TeamPairFinderJava8 {
    public static void main(String[] args) {
        int[] ages = {20, 25, 30, 25,20};
        int targetSum  = 50;
        Set<Integer> seen = new HashSet<>();
        IntStream.range(0,ages.length)
                .filter(i -> (i + 1) % 2 ==0)
                .mapToObj(i ->ages[i])
                .forEach(age ->{
                            int required = targetSum - age;
                            if (seen.contains(required)){
                                System.out.println("Pair found: " + age + " + " + required);
                            }else{
                                seen.add(required);
                            }
                });
    }
}
