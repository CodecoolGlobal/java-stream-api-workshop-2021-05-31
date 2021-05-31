package com.codecool;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main10 {

    public static void main(String[] args) throws Exception {
        List<Integer> ints = List.of(1, 2, 7, 4, 1, 2, 3, 4, 5, 2, 3, 9, 2);
        for (int i : ints) {
            System.out.println(i * 2);
        }
        ints.stream()
                .forEach(x -> System.out.println(x));
        ints.stream()
                .forEach(System.out::println);
        ints.stream()
                .forEach(x -> System.out.println(x * 2));

        Set<File> files = Files.list(Path.of("C:/Users/rkohanyi"))
                .map(Path::toFile)
                .filter(File::isFile)
                .filter(x -> x.length() > 10000L)
                .collect(Collectors.toSet());

        System.out.println(files);
    }
}
