package ru.job4j.inheritance;

public class Animal {
    String name;
    public Animal() {
        super();
        System.out.println("Animal");
    }

    public Animal(String name) {
        this.name = name;
    }
}
