package main.arraystring;

import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        String[] input = {"listen", "silent", "enlist",
                "rat", "tar", "god", "dog"};
        System.out.println(groupAnagrams(input));
        // [[listen, silent, enlist], [rat, tar], [god, dog]]
    }

    private static List<List<String>> groupAnagrams(String[] words) {
        Map<String,List<String>>map = new HashMap<>();
        for (String word : words){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k ->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
