package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Tracker {

    private final Item[] items = new Item[100];

    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }


    public Item[] findAll() {
        Item[] findAll = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = this.items[index];
            if (item != null) {
                findAll[size++] = this.items[index];
            }
        }
        return Arrays.copyOf(findAll, size);
    }

    public Item[] findByName(String key) {
        Item[] findByName = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = this.items[index];
            if (item != null && item.getName().equals(key)) {
                findByName[size++] = this.items[index];
            }
        }
        return Arrays.copyOf(findByName, size);
    }

    public Item findById(String id) {
        Item byId = new Item("Test");
        for (int index = 0; index < items.length; index++) {
            Item item = this.items[index];
            if (item.getId().equals(id)) {
             byId = this.items[index];
             break;
            }
        }
        return byId;
    }

}
