package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] first = left.split(". ");
        String[] second = right.split(". ");
        Integer firstNum = Integer.parseInt(first[0]);
        Integer secondNum = Integer.parseInt(second[0]);
        return Integer.compare(firstNum, secondNum);
    }
}