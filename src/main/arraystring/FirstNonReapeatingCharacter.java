package main.arraystring;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonReapeatingCharacter {
    public static void main(String[] args) {
        String str = "Siddharth";
        Character ch = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(ch);
    }
}
//“I convert the string into a stream of characters, group them using a LinkedHashMap to maintain insertion order,
// count their occurrences, filter characters that appear only once, and then return the first such character.”