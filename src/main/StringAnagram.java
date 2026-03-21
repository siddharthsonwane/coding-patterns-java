package main;

import java.util.Arrays;

public class StringAnagram {

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        boolean isAnagram =
                s1.length() == s2.length() &&
                        Arrays.equals(s1.chars().sorted().toArray(),
                                s2.chars().sorted().toArray()
                        );
        if (isAnagram){
            System.out.println("Strings are Anagrams");
        }else {
            System.out.println("Strings are Not Anagrams");
        }

    }

}
