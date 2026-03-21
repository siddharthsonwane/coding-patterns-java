package main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "powerful";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i --){
            reverse = reverse + str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        String result = Arrays.stream(str.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println("2: "+result);

    }
}
