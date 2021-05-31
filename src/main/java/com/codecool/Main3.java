package com.codecool;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3 {

    public static void main(String[] args) {
        List<String> strings = List.of("abcd", "ef", "ghijkl");
        // #1
        System.out.println(strings
                .stream()
                .mapToInt(String::length)
                .sum());

        // #2
        Stream<String> stream1 = strings.stream();
        IntStream intStream1 = stream1.mapToInt(String::length);
        int sum1 = intStream1.sum();
        System.out.println(sum1);

        // #3
        var stream2 = strings.stream();
        IntStream intStream2 = stream2.mapToInt(x -> x.length());
        int sum2 = intStream2.sum();
        System.out.println(sum2);
    }
}
