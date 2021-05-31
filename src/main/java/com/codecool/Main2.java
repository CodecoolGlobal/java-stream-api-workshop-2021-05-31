package com.codecool;

import java.util.Iterator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<String> strings = List.of("abcd", "ef", "ghijkl");
        int totalLength = 0;
        for (String string : strings) {
            totalLength += string.length();
        }
        System.out.println(totalLength);
    }
}
