package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int max1Or2 = first > second ? first : second;
        return max1Or2 > third ? max1Or2 : third;
    }
}