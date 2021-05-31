package com.codecool;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main6 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        long count = Arrays.stream(arr)
                .filter((int x) -> x % 3 != 0) // Predicate - returns true or false
                .count();
        System.out.println(count);

        OptionalInt anInt = Arrays.stream(arr)
                .filter((int x) -> x % 3 != 0)
                .findFirst();
        System.out.println(anInt);
    }
}
