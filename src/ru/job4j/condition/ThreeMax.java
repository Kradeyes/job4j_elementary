package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second > third && second > first) {
            result = second;
        }
        if (third > second && third > first) {
            result = third;
        }
        if (third == second && second > first) {
            return second;
        }
        return result;
    }
}
