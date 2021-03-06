package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private String id;
    private String name;

    @Override
    public String toString() {
        return getName() + " " + getId();
    }

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}