package main.practice_interview;

import java.util.*;
import java.util.stream.Collectors;

public class SeniorCitizenReorder {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("A", "A", 65),
                new Person("B", "B", 45),
                new Person("C", "C", 60),
                new Person("D", "D", 55),
                new Person("E", "E", 25),
                new Person("F", "F", 15),
                new Person("G", "G", 70)
        );

        List<Person> result =
                people.stream()
                        .collect(Collectors.partitioningBy(p -> p.age >= 60))
                        .entrySet().stream()
                        .sorted(Map.Entry.<Boolean, List<Person>>comparingByKey().reversed())
                        .flatMap(e -> e.getValue().stream())
                        .collect(Collectors.toList());

        result.forEach(System.out::println);
    }
}
