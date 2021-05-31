package com.codecool;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main8 {

    public static void main(String[] args) {
        int[] arr = new int[] {3, 9, 6, 5, 15, 30, 24};

        System.out.println(Arrays.stream(arr)
                .anyMatch(x -> x % 5 == 0));

        System.out.println(Arrays.stream(arr)
                .allMatch(x -> x % 5 == 0));
    }
}
