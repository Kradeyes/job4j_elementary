package ru.job4j.io;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int value = 11;
        Scanner scanner = new Scanner(System.in);
        while (true) {
                System.out.println("Ходит 1 игрок");
                System.out.println("Возьмите от 1 до 3 спичек");
                int pickUp1 = Integer.valueOf(scanner.nextLine());
                value -= pickUp1;
                System.out.println("Осталось спичек: " + value);
                if (value > 0) {
                    System.out.println("Ходит 2 игрок");
                    System.out.println("Возьмите от 1 до 3 спичек");
                    int pickUp2 = Integer.valueOf(scanner.nextLine());
                    value -= pickUp2;
                    System.out.println("Осталось спичек: " + value);
                    if (value <= 0) {
                        System.out.println("Победил 2 игрок");
                        break;
                    }
            } else {
                    System.out.println("Победил 1 игрок");
                    break;
                }
        }
    }
}
