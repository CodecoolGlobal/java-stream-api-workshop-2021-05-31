package com.codecool;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main11 {

    public static class PersonLogic {

        private final String version;

        public PersonLogic(String version) {
            this.version = version;
        }

        void printPerson(Person p) {
            System.out.println("(VERSION: " + version +  ") Name: " + p.getName() + ", age: " + p.getAge());
        }

        void signUpForDarido(Person p) {
            System.out.println("(VERSION: " + version +  ") Name: " + p.getName() + " signed up at Lajcsi!");
        }

        String getVersion() {
            return version;
        }
    }

    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Joe", 33);
        Person p2 = new Person("Jane", 44);
        Person p3 = new Person("Jill", 1);
        List<Person> ps = List.of(p1, p2, p3);

        PersonLogic pl1 = new PersonLogic("2021");
        PersonLogic pl2 = new PersonLogic("1971");
        PersonLogic pl3 = new PersonLogic("700");
        List<PersonLogic> pls = List.of(pl1, pl2, pl3);

        System.out.println(pls.stream()
                .map(PersonLogic::getVersion)
                .toList());
    }

//    static <T> void doWithPerson(Person p, Pers) {
//        System.out.println("Hasznos1");
//        function.apply(p);
//        System.out.println("Hasznos2");
//    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
