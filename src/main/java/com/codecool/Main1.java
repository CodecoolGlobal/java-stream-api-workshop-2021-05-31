package com.codecool;

import java.util.Iterator;
import java.util.List;

public class Main1 {

    public static void main(String[] args) {
        List<String> strings = List.of("abc", "def", "ghj");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        for (String string : strings) {
            System.out.println(string);
        }
        Iterator<String> i = strings.iterator();
        while (i.hasNext()) {
            String s = i.next();
            System.out.println(s);
        }
    }
}
