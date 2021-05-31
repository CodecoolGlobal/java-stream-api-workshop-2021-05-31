package com.codecool;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main5 {

    public static void main(String[] args) {
        int i = 42;
        Integer j = i; // Auto-boxing, boxing, this is syntactic sugar
        Integer k = Integer.valueOf(i); // Same as above
        int l = j; // Unboxing (automatic), implicit
        int m = j.intValue(); // Unboxing, explicit

        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        Stream<Integer> integerStream = integerList.stream();
        System.out.println(integerStream.min(Comparator.naturalOrder()));

        // IntStream, DoubleStream, LongStream
        IntStream intStream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        IntStream intStream2 = integerList.stream().mapToInt(x -> x);
        IntStream intStream3 = IntStream.range(0, 100);
        // System.out.println(intStream.sum());
        // System.out.println(intStream.average());
        // System.out.println(intStream.min());
        // System.out.println(intStream.max());
        System.out.println(intStream.summaryStatistics());
    }
}
