package com.codecool;

import java.util.List;

public class Main12 {


    public static void main(String[] args) throws Exception {
        User u1 = new User("Joe", 33);
        User u2 = new User("Jane", 99);

        System.out.println(User.VERSION);
        System.out.println(u1.VERSION);
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(u2.VERSION);
        System.out.println(u2.name);
        System.out.println(u2.age);

        System.out.println("BUMM");
        u1.name = "Bart";
        User.VERSION = 199;

        System.out.println(User.VERSION);
        System.out.println(User.VERSION);
        System.out.println(u1.name);
        System.out.println(u1.age);
        System.out.println(User.VERSION);
        System.out.println(u2.name);
        System.out.println(u2.age);

        System.out.println(User.calc(10, 20));
    }
}

class User {
    static int VERSION = 12;
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String calc(int a, int b) {
        return String.valueOf(a * b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
