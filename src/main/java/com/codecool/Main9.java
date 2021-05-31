package com.codecool;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main9 {

    public static void main(String[] args) {
        List<String> strings = List.of("A", "B", "C", "B", "A", "B", "C", "D");
        System.out.println(strings.stream()
                .collect(Collectors.joining()));

        System.out.println(strings.stream()
                .collect(Collectors.joining(", ")));

        System.out.println(strings.stream()
                .collect(Collectors.joining("\n")));

        System.out.println(strings.stream()
                .collect(Collectors.toSet()));

        List<Integer> ints = List.of(1, 2, 7, 4, 1, 2, 3, 4, 5, 2, 3, 9, 2);
        System.out.println(ints.stream()
                .map(x -> 3 * x)
                .collect(Collectors.toList()));

        System.out.println(ints.stream()
                .collect(Collectors.summingInt(x -> x)));

        System.out.println(ints.stream()
                .collect(Collectors.summarizingInt(x -> x)));

        Map<Integer, List<Integer>> collect = ints.stream()
                .collect(Collectors.groupingBy(x -> x));
        System.out.println(collect);
        Map<Integer, Integer> freq = collect.entrySet().stream()
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue().size()));
        System.out.println(freq);
    }
}
