package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("yanin.r.a@mail.ru", "Yanin Roman Andreevich");
        for (String x : map.keySet()) {
          String name = map.get(x);
            System.out.println("key " + x + " name " + name);
        }
    }
}
