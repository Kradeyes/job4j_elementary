package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean answer = false;
        if (number == 2) {
            answer = true;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                answer = false;
                break;
            } else  {
                answer = true;
            }
        }
        return answer;
    }
}
