package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean answer = false;
        for (int i = 2; i <= number; i++) {
            if (number == 2) {
                answer = true;
                break;
            }
            if (number % i == 0) {
                answer = false;
            } else  {
                answer = true;
            }
            break;
        }
        return answer;
    }
}
