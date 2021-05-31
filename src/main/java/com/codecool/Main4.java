package com.codecool;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main4 {

    public static void main(String[] args) {
        List<String> strings = List.of("abcd", "ef", "ghijkl");
        // ABCDEFGHIJKL

        Stream<String> s1 = strings.stream();
        Stream<String> s2 = s1.map(x -> {
            String s = x.toUpperCase();
            System.out.println("BUMM: " + x);
            return s;
        });
        // This throws an IllegalStateException at runtime.
        // Stream<Integer> integerStream = s1.map(x -> x.length());
        // Instead you need to create *another* stream if you want to
        // do something else.
        // Stream<Integer> integerStream = strings.stream().map(x -> x.length());
        Stream<String> s3 = s2.map(x -> {
            String t = "";
            for (int i = 0; i < x.length(); i+=2) {
                t += x.charAt(i);
            }
            return t;
        });
        String s4 = s3.collect(Collectors.joining());

        System.out.println(s4);
    }
}
