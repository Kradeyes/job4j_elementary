package ru.job4j.collection;


import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Pert");
        names.add("Ivan");
        names.add("Stepan");
        for (Object x: names) {
            System.out.println(x);
        }
    }
}
