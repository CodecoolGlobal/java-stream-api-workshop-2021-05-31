package com.codecool;

import java.util.Arrays;
import java.util.List;

public class Main7 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};

        // #1
        System.out.println(Arrays.toString(Arrays.stream(arr)
            .map(x -> x * x)
            .toArray()));
        System.out.println(Arrays.stream(arr)
            .map(x -> x * x)
            .boxed()
            .toList());

        // #2
        List<String> strings = Arrays.stream(arr)
                .mapToObj(x -> "A szám: " + x)
                .toList();
        System.out.println(strings);

        // #3
        List<String> strings2 = List.of("Abc", "Qwe", "AbB");
        System.out.println(strings2.stream()
            .mapToInt(x -> (int) x.chars().filter(c -> Character.isUpperCase(c)).count())
            .sum());
    }
}
