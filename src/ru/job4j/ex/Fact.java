package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {

    }

    public int calc(int n) {
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            if (n < 0) {
                throw new IllegalArgumentException("n should be bigger or equals 0");
            }
            rsl *= index;
        }
        return rsl;
    }
}